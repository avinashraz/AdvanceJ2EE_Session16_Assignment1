package com.proxy.classes;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] arg, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Executing: " + method);
		
	}

}
