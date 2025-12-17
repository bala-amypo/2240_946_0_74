package com.example.demo.controller;
import org.springframework.web.bind.annotations.*;

@RestController
public class StudentController{
    @Autowired
    StudentService ser;

    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu){
        return ser.createData;
    }
    @GetMapping("/fetchdata")
    public List<Student>fetchRecord(){
        return ser.fetchRecord();
    }

}