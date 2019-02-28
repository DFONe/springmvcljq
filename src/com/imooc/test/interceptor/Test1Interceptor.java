package com.imooc.test.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Test1Interceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ִ�е���afterCompletion������1");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ִ�е���postHandle������1");
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		arg0.setCharacterEncoding("utf-8");
		System.out.println("ִ�е���preHandle������1");
		System.out.println("session�е����ǣ�="+arg0.getSession().getAttribute("courseId"));
		if(arg0.getSession().getAttribute("courseId")==null) {
			arg0.getRequestDispatcher("/index.jsp").forward(arg0, arg1);
			return true;
		}
		return true; 
	}
	
}
