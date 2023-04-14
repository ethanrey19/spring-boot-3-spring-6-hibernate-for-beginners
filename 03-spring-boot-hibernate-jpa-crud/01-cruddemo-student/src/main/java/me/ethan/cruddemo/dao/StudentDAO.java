package me.ethan.cruddemo.dao;

import me.ethan.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    void update(Student student);

    void delete(Integer id);

    int deleteAllStudents();

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

}
