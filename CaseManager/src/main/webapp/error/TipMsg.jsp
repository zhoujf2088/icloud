<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.cloud.cases.CloudContext" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'TipMsg.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="zhoujf,武汉，湖北">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <script type="text/javascript">
    	var tipMsg = "";
    	<%
    		List<String> successMsgList=(List<String>)request.getAttribute("successMsgList");
	    	List<String> errorMsgList=(List<String>)request.getAttribute("errorMsgList");
	    	List<String> warmMsgList=(List<String>)request.getAttribute("warmMsgList");
	    	String msg=(String)request.getAttribute("msg");
	    	if (successMsgList != null && successMsgList.size() > 0) {
	            for (int i = 0; i < successMsgList.size(); i++) {
	                out.println(String.format("tipMsg+=\"%1$s\"\n", successMsgList.get(i).replaceAll("\"", "'")));
	            }
	        }
	    	if (errorMsgList != null && errorMsgList.size() > 0) {
	            for (int i = 0; i < errorMsgList.size(); i++) {
	                out.println(String.format("tipMsg+=\"%1$s\"\n", errorMsgList.get(i).replaceAll("\"", "'")));
	            }
	        }
	    	if (warmMsgList != null && warmMsgList.size() > 0) {
	            for (int i = 0; i < warmMsgList.size(); i++) {
	                out.println(String.format("tipMsg+=\"%1$s\"\n", warmMsgList.get(i).replaceAll("\"", "'")));
	            }
	        }
	    	if(msg!=null){out.println(String.format("tipMsg+=\"%1$s\"",msg));}
    	%>
  	
		if(""!=tipMsg){
			alert(tipMsg);
		}
    </script>
  </head>

</html>
