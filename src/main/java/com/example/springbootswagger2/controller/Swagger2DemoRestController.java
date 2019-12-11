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

@Api(value = "Swagger2DemoRestController", description = "REST Apis related to Student Entity!!!!")
@RestController
public class Swagger2DemoRestController {


    // 2-create student List : name, class, country
    List<Student> students = new ArrayList<Student>();

    {
        students.add(new Student("Sajal", "IV", "India"));
        students.add(new Student("Lokesh", "V", "India"));
        students.add(new Student("Kajal", "III", "USA"));
        students.add(new Student("Sukesh", "VI", "USA"));
    }

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
    @RequestMapping(value = "/getStudentByCountry/{country}")
    public List<Student> getStudentByCountry(@PathVariable(value = "country") String country) {
        List<Student> studentsByCountry = students.stream()
				.filter(x -> x.getCountry()
						.equalsIgnoreCase(country))
				.collect(Collectors.toList());

        return studentsByCountry;
    }

    // 4-get Student by class
    @RequestMapping(value = "/getStudentByClass/{cls}")
    public List<Student> getStudentByClass(@PathVariable(value = "cls") String cls){
        List<Student> getStudentByClass = students.stream()
                .filter(x -> x.getCls()
                        .equalsIgnoreCase(cls))
                .collect(Collectors.toList());

        return getStudentByClass;
    }
}
