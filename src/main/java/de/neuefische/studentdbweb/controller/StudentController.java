package de.neuefische.studentdbweb.controller;

import de.neuefische.studentdbweb.model.Student;
import de.neuefische.studentdbweb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("dumbo/heidi")

public class StudentController {

    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }


    @GetMapping ("showmeall")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @PutMapping
    public Student addStudent(@RequestBody Student someStudent) {
        service.addAStudent(someStudent);
        return someStudent;

    }


}
