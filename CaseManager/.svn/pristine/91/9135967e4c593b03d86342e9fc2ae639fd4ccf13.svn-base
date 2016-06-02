<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>CaseManager_starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	function checkuser(){
	var username=document.getElementById("username").toString();
	$.ajax({
		type:"post",
		url : "/CaseManager/inner/user/userBase/findAllUserInfo.action",
		async : false,
		data : {
			username : username,
			/* pwd : pwd5,
			checkcode : checkcode */
		},
		success : function(data) {			
			alert(data);
		}
		
		
	});
	
	}
	</script>
  </head>
  
  <body>
    This is my JSP page. <br>
    This is my JSP page. <br><hr>
    This is my JSP page. <br><hr>
    
     This is my JSP page. <br><hr> This is my JSP page. <br><hr>
      This is my JSP page. <br><hr>
       This is my JSP page. <br><hr>
    This is my JSP page. <br><hr>
    This is my JSP page.This is my JSP page.This is my JSP page.This is my JSP page. <br>
    <form action="/CaseManager/inner/user/userBase/findAllUserInfo.action" method="post" id="ff">
    用户名：<input type="text" name="username" id="username"/>
    <button style="" type="submit" onclick="checkuser()">clickme</button>
    </form>
    
    <div id="loginform">
							<form action="/CaseManager/inner/user/userBase/findAllUserInfo.action" method="post" id="ff">
								<table>
									<tr>
										<td style="width: 100px;"><label>用户名:</label></td>
										<td><input type="text" class="easyui-textbox" id="username" name="username"></td>
										<td id="userErro" style="width: 200px;font-size:12px;color:#f00;"></td>
									</tr>
									<tr style="height:29px">
										<td style="width: 100px;"><label>密&nbsp;码:</label></td>
										<td><input type="password" class="easyui-textbox" id="pwd" name="password" autocomplete="off"></td>
										<td id="psdErro" style="width:150px;font-size:12px;color:#f00;"></td>
									</tr>
									<tr>
										
									<tr style="height: 38px;">
										<td colspan="2" style="padding-left: 34px;padding-top: 12px;">
											<input type="button" id="submit1" style="width: 80px;height: 30px;"  class="l-btn-left" onclick="checkuser()" value="登陆" /> 
											<input type="reset"	id="cancel" style="width: 80px;height: 30px;margin-left: 20px;"	class="l-btn-left" onclick="clearForm()" value="取消" />
											<input type=hidden id="ssid" name="ssid" value="<%=request.getSession().getId()%>">
										</td>
									</tr>
								</table>
							</form>
						</div>
  </body>
</html>
