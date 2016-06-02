package com.cloud.cases.auth;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		  HttpServletRequest hrequest = (HttpServletRequest) request;
	        HttpServletResponse hresponse = (HttpServletResponse) response;
	        String referer= hrequest.getHeader("Referer");
	        if (null!=referer&&!referer.contains("CaseManager")) {
	        	request.getRequestDispatcher("/CaseManager/errorpage.jsp").forward(request,response);
	        } else {
	        	chain.doFilter(hrequest, hresponse);
	        }
		
	}

	@Override
	public void destroy() {
	}

}
