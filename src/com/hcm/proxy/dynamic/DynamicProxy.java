package com.hcm.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
	
	private Object target;
	
	public DynamicProxy(Object target) {
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before(method);
		Object result = method.invoke(target, args);
		end(method);
		return result;
	}
	
	public Object getTarget() {
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
	}

	public void before(Method method) {
		System.out.println(method.getName() + "() start ...");
	}
	
	public void end(Method method) {
		System.out.println(method.getName() + "() end ...");
	}

}
