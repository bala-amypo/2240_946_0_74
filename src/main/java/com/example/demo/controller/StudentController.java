package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Student;
import com.example.demo.service


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