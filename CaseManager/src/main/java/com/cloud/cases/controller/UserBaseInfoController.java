package com.cloud.cases.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloud.cases.BaseController;
import com.cloud.cases.service.UserBaseInfoService;
import com.cloud.cases.vo.UserBaseInfoVO;
@Controller
@Scope("prototype")
@RequestMapping("/inner/user/userBase")
public class UserBaseInfoController extends BaseController<UserBaseInfoVO> {
	
	@Resource
	private UserBaseInfoService userService;
	
	
		// 查找所有数据
		@RequestMapping("/findAllUserInfo")
		@ResponseBody
		public String findAllUserInfo(String username) {
			System.out.println(username);
			String json = "this is a test";	
			return "alert('this is a test!!')";
		}
		
}
