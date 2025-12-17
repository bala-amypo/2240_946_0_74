package com.example.demo.entity;
import jakarta.persistence.*;

@Entity 
public class Student{
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private float cgpa;

    public int getID(){
        return id;
    }
    public void setId(int id){ 
        this.id=id;
    }

    public String getName(){  
        return name;
    
    }
    public void setName(String name){
        this.name=name;
    }
    public String getemail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public float cgpa(){
        return cgpa;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public Student (Long id,String name,String email,float cgpa){
        // this.id=id;
        this.name=name;
        this.email=email;
        this.cgpa=cgpa;
    }
    public Student(){
        
    }


}