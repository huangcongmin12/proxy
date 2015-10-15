package com.hcm.proxy.dynamic;

import com.hcm.proxy.Sourcable;
import com.hcm.proxy.Source;

public class Test {
	
	public static void main(String[] args) {
		Sourcable source = new Source();
		DynamicProxy proxy = new DynamicProxy(source);
		Sourcable sourceProxy = (Sourcable)proxy.getTarget();
		sourceProxy.operation();
		
		System.out.println("ooookk");
	}

}
