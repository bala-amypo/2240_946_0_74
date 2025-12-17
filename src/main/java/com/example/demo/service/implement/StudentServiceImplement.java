package com.example.demo.service.implement;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class StudentServiceImplement implements StudentService{
    @Autowired
    StudentRepository sturep;

    @Override
    public  Student createData(Student stu){
        return sturep.save(stu);
    }
    @Override
    public List<Student>fetchRecord(){
        return sturep.findAll();
    }
}