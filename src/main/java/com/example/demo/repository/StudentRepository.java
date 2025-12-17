package com.example.demo.repository;
import org.springframework.web.bind.annotations;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}