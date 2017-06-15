package com.codecool.jpaexample.model;

import com.codecool.jpaexample.CCLocation;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Class")
public class Klass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CCLocation location;

    @OneToMany(mappedBy = "")
    private Set<Student> students = new HashSet<>();

    public Klass() {}

    public Klass(String name) {
        this.name = name;
    }

    public Klass(String name, CCLocation location) {
        this(name);
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

}
