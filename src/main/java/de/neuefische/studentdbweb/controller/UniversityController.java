package de.neuefische.studentdbweb.controller;

import de.neuefische.studentdbweb.model.Student;
import de.neuefische.studentdbweb.service.StudentService;
import de.neuefische.studentdbweb.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("university")
public class UniversityController {

    private final StudentService service;
    private final UniversityService universityService1;

    @Autowired
    public UniversityController (StudentService service, UniversityService universityService1){
        this.service = service;
        this.universityService1 = universityService1;
    }

    @GetMapping("{universityID}")
    public List<Student> getStudents(@PathVariable String universityID){
        return service.findStudentbyUniversity(universityID);
    }

//    @GetMapping("{studyID}")
//    public List<Student> showStudents (@PathVariable String id){
//        return service.showStudentByID(id);
//    }

    @GetMapping("open")
    public boolean universityIsOpen(){
        return universityService1.isOpen();
    }



}
