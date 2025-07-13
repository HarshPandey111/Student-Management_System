package com.studentapp.student_management.model;


import jakarta.persistence.*;

// Ye annotation batata hai ki ye class DB table banayegi
@Entity
@Table(name = "students")  // Optional: Table ka naam set kar rahe hain
public class Student {

    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto increment
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;

    // ⚙️ Default constructor (Spring ke liye zaroori hota hai)
    public Student() {}

    // ⚙️ Parameterized constructor (object create karte waqt use hota hai)
    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // ✅ Getters and Setters (data access aur update ke liye)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
