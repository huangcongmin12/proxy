package com.hcm.proxy;

public class Proxy implements Sourcable {
	
	private Sourcable source;
	
	public Proxy() {
	}
	
	public Proxy(Sourcable source) {
		this.source = source;
	}

	public void operation() {
		before();
		source.operation();
		after();
	}
	
	public void before() {
		System.out.println("befor() ... ");
	}
	
	public void after() {
		System.out.println("after() ... ");
	}

}
