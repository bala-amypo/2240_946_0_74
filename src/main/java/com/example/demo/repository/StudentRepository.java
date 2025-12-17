package com.example.demo.repository;
import org.springframework.web.bind.annotations;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}