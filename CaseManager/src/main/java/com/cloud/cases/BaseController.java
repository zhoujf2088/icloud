package com.cloud.cases;


import java.lang.reflect.ParameterizedType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.cloud.cases.util.Constant;
import com.cloud.cases.util.LogUtil;
import com.cloud.cases.util.StringUtil;

@SuppressWarnings("unchecked")

public abstract class BaseController<T extends BaseVO>{
	/*
	 * 成功的标识
	 */
	protected static final String SUCCESS="success";
	  /**
     * 跳转页面
     */
    protected static final String JUMP = "jump";
    /**
     * input
     */
    protected static final String INPUT = "input";
    /**
     * 初始化标识
     */
    protected static final String INIT = "init";
    /**
     * JSON标识
     */
    protected static final String JSON = "json";
    /**
     * 页面标识
     */
    protected static final String PAGE = "page";
    /**
     * 文件上传标识
     */
    protected static final String FILEUPLOAD = "fileUpload";
    /**
     * 到处excel标识
     */
    protected static final String OUTEXCEL = "outexcel";
    /**
     * 下载标识
     */
    protected static final String DOWNLOAD = "download";
	
	 /**
     * CloudContext上下文，用来存放所有请求和响应的容器
     */
	protected CloudContext<T> cloudContext = new CloudContext<T>();
	
	/**
    * 查询页面总数（easyui用）
    */
	protected Integer total;
	
	/**
     * 查询结果数组（easyui用）
     */
	protected Object[] rows;

    
    protected Class<T> clazz=null;
    
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;
 
    
	//构造函数
	public BaseController(){
			
		  	if(this.getClass().getGenericSuperclass() instanceof ParameterizedType){
		  		clazz=(Class<T>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		  	}else{
		  		clazz=(Class<T>)((ParameterizedType)this.getClass().getSuperclass()
					.getGenericSuperclass()).getActualTypeArguments()[0];
		  	}
		  	try {
		  		cloudContext.setVO(clazz.newInstance());
		  		System.out.println(clazz.getName());
	            //设置页数
		  		
	            int page = StringUtil.isBlank(getRequest().getParameter("page"))
	                            || Integer.parseInt(getRequest().getParameter("page")) < 1 ? 1 : Integer
	                            .parseInt(getRequest().getParameter("page"));
	           
	            int pagesize = StringUtil.isBlank(getRequest().getParameter("rows")) ? cloudContext.getPageInfo()
	                            .getEachPageData() : Integer.parseInt(getRequest().getParameter("rows"));
	            cloudContext.getPageInfo().setNowPage(page);
	            cloudContext.getPageInfo().setEachPageData(pagesize);
	            cloudContext.setLoginedUser(getLoginedUser());
	            
			} catch (Exception e) {
				LogUtil.error(e);
			}
	}
	
	/*
	 * 从spring mvc中获取HttpServletRequest
	 */
	public HttpServletRequest getRequest(){
		//ServletRequestAttributes attributes=(ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes attributes=(ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		return request;
	}

	/*
	 * 从spring mvc中获取HttpServletResponse
	 */
	
	public HttpServletResponse getResponse(){
		//ServletRequestAttributes attributes=(ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes attributes=(ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
		HttpServletResponse response=attributes.getResponse();
		return response;
	}
	

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	
	protected HttpSession getSession(){
		return getRequest().getSession();
	}
	
	/*
	 * 设置sersion
	 */
	public void setSession(HttpSession session) {
		this.session = session;
	}
	
	public CloudContext getCloudContext(){
		return cloudContext;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Object[] getRows() {
		return rows;
	}

	public void setRows(Object[] rows) {
		this.rows = rows;
	}
	
	//通过HttpSession来获取name的属性
	public Object getAttriBySession(String name){
		HttpServletRequest request=getRequest();
		HttpSession session=request.getSession();
		return session.getAttribute(name);
	}
	
	//通过HttpServletRequest来获取name的属性
	public Object getAttriByRequest(String name){
		HttpServletRequest request=getRequest();
		return request.getAttribute(name);
	}
	
	  /**
     * 把数据存放在session里面
     *
     * @param name
     * @param value
     */
	public void setAttriBySession(String key,Object value){
		HttpServletRequest request=getRequest();
		HttpSession session=request.getSession();
		session.setAttribute(key, value);
	}
	  /**
     * 把数据存放在request里面
     *
     * @param name
     * @param value
     */
	public void setAttriByRequest(String key,Object value){
		HttpServletRequest request=getRequest();
		request.setAttribute(key,value );		
	}

	//从session中获取已登录的用户
	public LoginedUser getLoginedUser(){
		return (LoginedUser)getAttriBySession(Constant.LOGINED_USER);
	}

	//把登录用户信息存入到HttpSession中
	public void setLoginedUser(LoginedUser loginedUser){
		setAttriBySession(Constant.LOGINED_USER,loginedUser);
	}
	
	//获取验证码
	public String getVerifyCode(){
		return (String)getAttriBySession(Constant.VERIFY_CODE);
	}


	
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	

	@ModelAttribute
	public void setRequestAndResponse(HttpServletRequest request,HttpServletResponse response){
		this.request=request;
		this.response=response;
		this.session=request.getSession();
	}
	
	//初始化提示信息
	public void initMsg(Model model){
		List<String> successMsgList=cloudContext.getSuccessMsgList();
		List<String> errorMsgList=cloudContext.getErrorMsgList();
		List<String> warmMsgList=cloudContext.getWarmMsgList();
		model.addAttribute("successMsgList",successMsgList);
		model.addAttribute("errorMsgList",errorMsgList);
		model.addAttribute("warmMsgList",warmMsgList);				
	}
	
	
	//日期参数的传递
	@InitBinder
	protected void initBinder(HttpServletRequest request,ServletRequestDataBinder binder) throws Exception{
		//DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor dateEditor=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}
	
}