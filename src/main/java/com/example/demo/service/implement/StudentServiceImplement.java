package com.example.demo.service.implement;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotations.*;

@Service
public class StudentServiceImplement implements StudentService{
    @Autowired
    StudentRepository sturep;

    @Override
    public  Student createData(Student stu){
        return sturep.save(stu);
    }
    @Override
    public List<Student>fetchRecord()
}