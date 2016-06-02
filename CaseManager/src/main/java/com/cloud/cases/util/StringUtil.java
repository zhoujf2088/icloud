package com.cloud.cases.util;

import java.security.MessageDigest;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tang64 on 2015/10/28.
 * 字符串应用工具类
 */
public class StringUtil {

    //私有化构造函数
    private StringUtil(){}

    //判断字符串是否为空
    public static Boolean isBlank(String string){
        if(string == null || "".equals(string.trim())){
            return true;
        }else{
            return false;
        }
    }

    //md5加密转换
    public static String encrypt(String username,String password){
        StringBuffer sb = new StringBuffer();
        sb.append(username).append(password).append("case");
        // 如果有空则返回""
        if(sb.length()==4){
            return "";
        }
        try {
         // 将字符串转为字节数组
         byte[] strTemp = sb.toString().getBytes();
         // 加密器
         MessageDigest mdTemp = MessageDigest.getInstance("MD5");
         // 执行加密
         mdTemp.update(strTemp);
         // 加密结果
         byte[] md = mdTemp.digest();
         StringBuffer hexValue = new StringBuffer();
         for (int i = 0; i < md.length; i++){  
             int val = ((int) md[i]) & 0xff;  
             if (val < 16)  
                 hexValue.append("0");  
             hexValue.append(Integer.toHexString(val));  
         }  
         return hexValue.toString();
        } catch (Exception e) {
         return null;
        }
    
    
    
    }

    /*
 * 将输入字符串中的多个空格、制表符、回车符、换行符全替换成空格
 * param: s
 * return String
 */
    public static String replaceBlank(String inputstr){
        //将给定的正则表达式编译到Pattern模式中
        Pattern p = Pattern.compile("\\s*|\t|\r|\n");

        //创建匹配器：匹配给定输入字条串与此模式
        Matcher m = p.matcher(inputstr);

        //替换模式与给定替换字符串相匹配的输入序列的每个子序列
        return m.replaceAll("");
    }

    //返回以逗号分割的字符串
    public static String getStringByComma(Collection<String> strs){
        if(null!=strs && !strs.isEmpty()){
            String s = strs.toString();
            s = s.substring(1,s.length()-1);
            return replaceBlank(s);
        }else{
            return null;
        }
    }

    //返回数组处理后的以逗号分隔数组元素的字符串
    public static String getStringByComma(String... strs){
        if(null!=strs && strs.length>0){
            List<String> list = Arrays.asList(strs);
            return getStringByComma(list);
        }
        return null;
    }

    //字符串转换成日期
    public static Timestamp StringToTimestamp(final String strdate){
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=null;
        try {
            date=format.parse(strdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String nowtime=df.format(date);
        return Timestamp.valueOf(nowtime);
    }

    //将字符串转换成日期
    public static Date StringToDate(final String strdate){
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
        Date date=null;
        try{
            date=format.parse(strdate);
        }catch(ParseException e){
            e.printStackTrace();
        }
        return date;
    }
}
