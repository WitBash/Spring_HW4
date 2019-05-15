package com.boshko.homework4.services;

import com.boshko.homework4.entities.Student;
import com.boshko.homework4.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //получаем студента с именем Mike
//    public Student getStudent() {
//        Student student = studentRepository.findOneByFirstName("Mike");
//        return student;
//    }

    //получаем отсортированный список студентов
//    public List<Student> getAllStudents() {
//        Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "Score"));
//        List<Student> students = (List<Student>) studentRepository.findAll(sort);
//        return students;
//    }

    //получаем студентом с общим баллом между заданными значениями
//    public List<Student> getAllStudentsBetweenScore() {
//        List<Student> students = (List<Student>) studentRepository.findAllByScoreBetween(40,45);
//        return students;
//    }

    //постраничное отображение по 10 студентов
    public Page<Student> getAllStudentsOnTwoPage() {
        Page<Student> students = studentRepository.findAll(PageRequest.of(0, 10));
        return students;
    }

    public StudentService (){

    }
}
