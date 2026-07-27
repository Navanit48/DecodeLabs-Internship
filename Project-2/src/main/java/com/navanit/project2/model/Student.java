package com.navanit.project2.model;
import jakarta.validation.constraints.NotBlank;

public class Student {
    private int id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Course cannot be blank")
    private String course;
    public Student() {
    }

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}