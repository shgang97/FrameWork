package com.shgang.spring5.ioc_demo1;

public class Book {


	private String bname;
	private String bauthor;
	private String address;

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void print() {
		System.out.println("《" + bname + "》:" + bauthor + "\t" +  address);
	}
}
