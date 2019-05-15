package com.boshko.homework4.controllers;

import com.boshko.homework4.entities.Student;
import com.boshko.homework4.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

//    @GetMapping("")
//    public String studentsPage(Model model) {
//        Student allStudents = studentService.getStudent();
//        model.addAttribute("students", allStudents);
//        return "studentInfo";
//    }

//    @GetMapping("")
//    public String studentsPage(Model model) {
//        List<Student> allStudents = studentService.getAllStudents();
//        model.addAttribute("students", allStudents);
//        return "studentInfo";
//    }

//    @GetMapping("")
//    public String studentsPage(Model model) {
//        List<Student> allStudents = studentService.getAllStudentsBetweenScore();
//        model.addAttribute("students", allStudents);
//        return "studentInfo";
//    }

    @GetMapping("")
    public String studentsPage(Model model) {
        Page<Student> allStudentsOnTwoPage = studentService.getAllStudentsOnTwoPage();
        model.addAttribute("students", allStudentsOnTwoPage);
        return "studentInfo";
    }
}
