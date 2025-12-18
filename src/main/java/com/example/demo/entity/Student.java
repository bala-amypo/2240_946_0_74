package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity 
public class Student{
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private float cgpa;
}