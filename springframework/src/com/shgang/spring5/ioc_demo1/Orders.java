package com.shgang.spring5.ioc_demo1;

public class Orders {

	private String oname;
	private String address;


	public Orders(String oname, String address) {
		this.oname = oname;
		this.address = address;
	}

	public void print() {
		System.out.println(oname + "::" + address);
	}
}
