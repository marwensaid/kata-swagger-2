package com.example.springbootswagger2.model;

import io.swagger.annotations.ApiModelProperty;


// 1- complete student def : country and class
public class Student {


	// 5- add swagger api model for all att

	@ApiModelProperty(notes = "Name of the Student",name="name",required=true,value="test name")
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

}
