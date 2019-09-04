package com.wellington.employeescrud.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wellington.employeescrud.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Welcome to my emplyees crud sample";
    }
    @RequestMapping("/dataSample")
    @JsonFormat
    public Employee getSampleEmplyee(){
        Employee e = new Employee();
        e.setId(-100);
        e.setFirstName("SampleName");
        e.setLastName("SampleLastName");
        e.setEmailId("test@test.test");
        return e;
    }
}
