package com.imooc.test.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Test2Interceptor implements WebRequestInterceptor {  

	@Override
	public void afterCompletion(WebRequest arg0, Exception arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("执行到了afterCompletion方法2！");
	}

	@Override
	public void postHandle(WebRequest arg0, ModelMap arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("执行到了postHandle方法2！");
	}

	@Override
	public void preHandle(WebRequest arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("执行到了preHandle方法2！");
	} 
	
}
