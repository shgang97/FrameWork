package com.shgang.spring5.ioc_demo1.bean;

public class Dept {

	private String dname;

//	public String getDname() {
//		return dname;
//	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Dept{" +
				"dname='" + dname + '\'' +
				'}';
	}
}
