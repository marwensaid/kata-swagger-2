package com.example.springbootswagger2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootswagger2.model.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

// describe this class using @Api annotation from swagger
// this is a Rest Controller
public class Swagger2DemoRestController {


    // 2-create student List : name, class, country

    // 5-add http response for getStudent operation : 200 / 401 / 403 / 404 (use ApiResponses annotation)


    // endpoint getStudent (return student List)

    // Get Student by name
    // describe this endpoint using swagger
    @RequestMapping(value = "/getStudent/{name}")
    public Student getStudent(@PathVariable(value = "name") String name) {
        // return student
        return null;
    }

    // 3-get Student by country
    @RequestMapping(value = "/getStudentByCountry/{country}")
    public List<Student> getStudentByCountry(@PathVariable(value = "country") String country) {

        // impl this method  to getStudentByCountry
        return null;
    }

    // 4-get Student by class
    // attack EP
    public List<Student> getStudentByClass(@PathVariable(value = "cls") String cls) {

        // impl method to get Student by Class

        return null;
    }
}
