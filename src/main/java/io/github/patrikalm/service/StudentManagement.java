package io.github.patrikalm.service;

import io.github.patrikalm.models.Student;

import java.util.List;

public interface StudentManagement {

    Student create();
    Student save(Student student);
    Student find(int id);
    Student remove(int id);
    List<Student> findAll();
    Student edit(Student student);

}
