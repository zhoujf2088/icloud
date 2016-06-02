package com.cloud.cases;

import com.cloud.cases.util.LogUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CloudContext是整个项目的参数容器，所有前台到后台的的参数 或则后台到前台的参数都是通过此对象进行传递的，里面封装了很多实用的方法，
 *  比如获取request的参数等等
 *
 * @author CloudKing
 * @param <T>
 *            BaseVO的子类
 */
public class CloudContext<T extends BaseVO> {
	//其它参数
	private Map<String, Object> params = new HashMap<String, Object>();	//映射对象参数
	
	//错误列表
	private List<String> errorMsgList = new ArrayList<String>();		//错误信息列表
	
	private List<String> warmMsgList = new ArrayList<String>();			//警告信息列表
	
	private List<String> successMsgList = new ArrayList<String>();		//成功信息列表
	
	private Object[] rows;				//查询结果对象数组
	
	private LoginedUser loginedUser;		//登录用户对象实例
	
	private T vo;						//VO类
	
	private PageInfo pageInfo = new PageInfo(1,10);			//分页
	
	//默认构造函数
	protected CloudContext(){
		
	}
	public PageInfo getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
	
	//添加错误信息列表
	public void addErrorMsg(String errorMsg){
		errorMsgList.add(errorMsg);
	}
	
	//添加警告信息
	public void addWarmMsg(String warmMsg){
		warmMsgList.add(warmMsg);
	}
	
	//添加成功信息
	public void addSuccessMsg(String successMsg){
		successMsgList.add(successMsg);
	}
	
	//获取警告信息列表
	public List<String> getWarmMsgList(){
		return warmMsgList;
	}
	
	//获取错误信息列表
	public List<String> getErrorMsgList(){
		return errorMsgList;
	}
	
	//获取成功信息列表
	public List<String> getSuccessMsgList(){
		return successMsgList;
	}
	
	//判断是否有警告信息
	public boolean getWarm(){
		return !warmMsgList.isEmpty();
	}
	
	//是否有错误信息
	public boolean getError(){
		return !errorMsgList.isEmpty();
	}
	
	//没有错误信息
	public boolean getSuccessIngoreWarn(){
		return errorMsgList.isEmpty();
	}
	
	//获取当前泛型类的VO对象
	public T getVO(){
		return vo;
	}
	
	//设置当前泛型类的VO
	public void setVO(T vo){
		this.vo=vo;
	}
	
	//获取params对象
	public Map<String, Object> getParams(){
		return params;
	}
	
	//添加属到到params对象
	public void addParams(String key,Object value){
		this.params.put(key, value);
	}
	
	//删除params中的键值对应的对象
	public Object removeParams(String key){
		return params.remove(key);
	}
	
	//通过键值获取相对应的对象
	public Object getObjectParams(String key){
		return params.get(key);
	}
	
	//获取键值对应的对象数组
	public String[] getStrArrayParams(String key){
		Object obj=params.get(key);
		if(obj instanceof String[]){
			String[] arraytmp=(String[])obj;
			return arraytmp;
		}else{
			return null;
		}
	}
	
	//返回params中键值对应的对象字符串
	public String getStringParams(String key){
		Object obj=params.get(key);
		//如果是字符串对象数据，则返回该字符串对象数组的第一个对象
		if(obj instanceof String[]){
			String[] arraytmp=(String[])obj;
			if(arraytmp.length>0)
				return arraytmp[0];
		}
		
		//如果是字符串对象，则直接返回该对象的字符对象
		if(obj instanceof String){
			return (String)obj;
		}
		
		//如果不是前两种情况的对象，则直接转换成字符串对象并返回
		if(obj!=null){
			return obj.toString();
		}
		
		//如果是空对象
		return null;
	}
	
	   /**
     * 返回单个Byte
     *
     * @param key
     * @return
     */
    public Byte getByteParam(String key) {
        String tmp = getStringParams(key);
        if (tmp == null)
            return null;
        try {
            return Byte.parseByte(tmp);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * 返回单个Integer
     *
     * @param key
     * @return
     */
    public Integer getIntegerParam(String key) {
        String tmp = getStringParams(key);
        if (tmp == null)
            return null;
        try {
            return Integer.parseInt(tmp);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    
    /**
     * 返回单个Long
     *
     * @param key
     * @return
     */
    public Long getLongParam(String key) {
        String tmp = getStringParams(key);
        if (tmp == null)
            return null;
        try {
            return Long.parseLong(tmp);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    /**
     * 返回单个Float
     *
     * @param key
     * @return
     */
    public Float getFloatParam(String key) {
        String tmp = getStringParams(key);
        if (tmp == null)
            return null;
        try {
            return Float.parseFloat(tmp);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    /**
     * 返回单个Double
     *
     * @param key
     * @return
     */
    public Double getDoubleParam(String key) {
        String tmp = getStringParams(key);
        if (tmp == null)
            return null;
        try {
            return Double.parseDouble(tmp);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    /**
     * 返回单个Boolean
     *
     * @param key
     * @return
     */
    public Boolean getBooleanParam(String key) {
        String tmp = getStringParams(key);
        return Boolean.parseBoolean(tmp);
    }
    
    
    /**
     * 清除VO
     */
    @SuppressWarnings("unchecked")
    public void clearVO() {
        try {
            Class<T> clazz = (Class<T>) vo.getClass();
            this.setVO(clazz.newInstance());
        } catch (Exception e) {
            //此异常直接记录即可，不影响使用。
            LogUtil.error(e);
        }
    }

    
    /**
     * 清除PageINfo
     */
    public void clearPageInfo() {
        this.setPageInfo(new PageInfo(1,10));
    }

    /**
     * 清除VO和PageInfo
     */
    public void clearVoAndPageInfo() {
        this.clearVO();
        this.clearPageInfo();
    }

    /**
     * @param loginedUser
     *            the loginedUser to set
     */
    public void setLoginedUser(LoginedUser loginedUser) {
        this.loginedUser = loginedUser;
    }

    /**
     * 获取用户
     *
     * @param name
     * @param value
     */
    public LoginedUser getLoginedUser() {
        return loginedUser;
    }

    //获取对象数据组
    public Object[] getRows() {
        return rows;
    }

    //设置对象数组
    public void setRows(Object[] rows) {
        this.rows = rows;
    }
}
