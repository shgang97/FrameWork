package com.shgang.spring5.ioc_demo2.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
	//数组类型属性
	private String[] courses;
	//list集合类型属性
	private List<String> list;
	//map集合类型属性
	private Map<String, String> maps;
	//set集合类型属性
	private Set<String> sets;
	//学生所学多门课程，自定义类型集合
	private List<Course> courseList;

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}


	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public void print() {
		System.out.println(Arrays.toString(courses));
		System.out.println(list);
		System.out.println(maps);
		System.out.println(sets);
		System.out.println(courseList);
	}
}

