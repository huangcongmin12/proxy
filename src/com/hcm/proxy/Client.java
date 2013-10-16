package com.hcm.proxy;

public class Client {
	public static void main(String[] args) {
		Sourcable source = new Source();
		Proxy proxy = new Proxy(source);
		proxy.operation();
	}

}
