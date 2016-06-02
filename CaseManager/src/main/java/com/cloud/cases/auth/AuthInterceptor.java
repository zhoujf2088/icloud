package com.cloud.cases.auth;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.cloud.cases.entity.FunctionEntity;
import com.cloud.cases.entity.RoleEntity;
import com.cloud.cases.entity.UserBaseInfoEntity;
/**
 * @author ZhouJF
 * @date 2016年5月25日 上午10:42:27
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		if (handler.getClass().isAssignableFrom(HandlerMethod.class)) {
			AuthPassport authPassport = ((HandlerMethod) handler)
					.getMethodAnnotation(AuthPassport.class);

			// 没有声明需要权限,或者声明不验证权限
			if (authPassport == null || authPassport.validate() == false)
				return true;
			else {
				// 在这里实现自己的权限验证逻辑
				UserBaseInfoEntity userBase = (UserBaseInfoEntity) request
						.getSession().getAttribute("cu_user");
				if (userBase != null) {
					Set<String> funs = new HashSet<String>();
					Set<RoleEntity> roles = userBase.getRoles();
					for (RoleEntity roleEntity : roles) {
						Set<FunctionEntity> fun = roleEntity.getFunctions();
						for (FunctionEntity functionInfoEntity : fun) {
							funs.add(functionInfoEntity.getFunctionurl());
						}
					}
					String userUrl = request.getRequestURI().substring(0,
							request.getRequestURI().lastIndexOf("/"));
					if (!funs.contains(userUrl)) {
//						response.sendRedirect("/SpaceManager/inner/Nopre.jsp");
						System.out.println("权限管理----------"+userBase.getRealname()+":此用户没有权限操作");
						return false;
					} else {
						return true;
					}

				}
//				response.sendRedirect("/SpaceManager/index.jsp");
				return false;
			}

		} else
			return true;

	}

}
