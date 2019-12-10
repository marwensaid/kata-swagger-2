package com.example.springbootswagger2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootswagger2.model.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Swagger2DemoRestController", description = "REST Apis related to Student Entity!!!!")
@RestController
public class Swagger2DemoRestController {


	// 2-create student List : name, class, country
	List<Student> students = new ArrayList<Student>();

	// 5-add http response for getStudent operation : 200 / 401 / 403 / 404

	// endpoint getStudent
	@RequestMapping(value = "/getStudents")
	public List<Student> getStudents() {
		return students;
	}

	// Get Student by name
	@ApiOperation(value = "Get specific Student in the System ", response = Student.class, tags = "getStudent")
	@RequestMapping(value = "/getStudent/{name}")
	public Student getStudent(@PathVariable(value = "name") String name) {
		return students.stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
	}

	// 3-get Student by country

	// 4-get Student by class



}
