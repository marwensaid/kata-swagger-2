package com.example.springbootswagger2.controller;

import com.example.springbootswagger2.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// TODO describe this class using @Api annotation from swagger
// TODO this is a Rest Controller
public class Swagger2DemoRestController {


    // TODO create student List : name, class, country

    // TODO add http response for getStudent operation : 200 / 401 / 403 / 404 (use ApiResponses annotation)


    // TODO endpoint getStudent (return student List)

    // TODO Get Student by name
    // TODO describe this endpoint using swagger
    @RequestMapping(value = "/getStudent/{name}")
    public Student getStudent(@PathVariable(value = "name") String name) {
        // TODO return student
        return null;
    }

    // TODO get Student by country
    @RequestMapping(value = "/getStudentByCountry/{country}")
    public List<Student> getStudentByCountry(@PathVariable(value = "country") String country) {

        // TODO impl this method  to getStudentByCountry
        return null;
    }

    // TODO get Student by class
    // TODO ping the right endpoint
    public List<Student> getStudentByClass(@PathVariable(value = "cls") String cls) {

        // TODO impl method to get Student by Class

        return null;
    }
}
