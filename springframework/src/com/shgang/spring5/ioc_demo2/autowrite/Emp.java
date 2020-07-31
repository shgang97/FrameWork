package com.shgang.spring5.ioc_demo2.autowrite;

public class Emp {
	private Dept dept;

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp{" +
				"dept=" + dept +
				'}';
	}

	public void print() {
		System.out.println(dept);
	}
}
