package io.github.patrikalm.data_access;

import io.github.patrikalm.models.Student;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao {

    List<Student> students = new ArrayList<>();

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {

        if (students.isEmpty()) {
            throw new RuntimeException("No data found in student list");
        }

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void delete(int id) {

        if (students.isEmpty()) {
            throw new RuntimeException("No data found in student list");
        }

        students.removeIf(student -> student.getId() == id);
    }
}
