package de.neuefische.studentdbweb.controller;

import de.neuefische.studentdbweb.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;


@RestController
@RequestMapping("dumbo/heidi")

public class StudentController {

    ArrayList<Student> listOfStudents = new ArrayList<>();

    public StudentController() {
        listOfStudents.add(new Student("Helene", 22, "8"));
        listOfStudents.add(new Student("Dieter", 31, "34"));
        listOfStudents.add(new Student("Jürgen", 24, "4"));
        listOfStudents.add(new Student("Ingeborg", 22, "39"));
        listOfStudents.add(new Student("Detlev", 30, "65"));

    }

    @GetMapping("whatever")
    public ArrayList<Student> getStudents() {

        return listOfStudents;

    }

    @PutMapping
    public Student addAStudent(@RequestBody Student someStudent) {
        listOfStudents.add(someStudent);
        return someStudent;
    }

    @GetMapping("{id}")
    public Student showStudentByID(@PathVariable String id) {
        for (Student hippies : listOfStudents) {
            if (hippies.getId().equals(id)) {
                return hippies;

            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "student not found");

    }
}
