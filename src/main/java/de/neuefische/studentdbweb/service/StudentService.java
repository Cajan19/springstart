package de.neuefische.studentdbweb.service;


import de.neuefische.studentdbweb.model.Student;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {


    private final List<Student> listOfStudents = new ArrayList<>(List.of(

            new Student("Helene", 22, "8", "uni1"),
            new Student("Dieter", 31, "34", "uni2"),
            new Student("Jürgen", 24, "4", "uni3"),
            new Student("Ingeborg", 22, "39", "uni1"),
            new Student("Detlev", 30, "65", "uni1"),
            new Student("Doris", 30, "99", "uni2"),
            new Student("Bernhard", 21, "45", "uni2"),
            new Student("Henry", 23, "81", "uni3")));


//            ArrayList < Student > listOfStudents = new ArrayList<>();
//
//    public StudentController() {
//        listOfStudents.add(new Student("Helene", 22, "8"));
//        listOfStudents.add(new Student("Dieter", 31, "34"));
//        listOfStudents.add(new Student("Jürgen", 24, "4"));
//        listOfStudents.add(new Student("Ingeborg", 22, "39"));
//        listOfStudents.add(new Student("Detlev", 30, "65"));
//        listOfStudents.add(new Student("Doris", 30, "99"));
//        listOfStudents.add(new Student("Bernhard", 21, "45"));
//        listOfStudents.add(new Student("Henry", 23, "81"));
//
//    }


    public StudentService() {
    }

    public Student addAStudent(Student someStudent) {
        listOfStudents.add(someStudent);
        return someStudent;
    }

    public List<Student> getStudents() {
        return listOfStudents;
    }

    public List<Student> findStudentbyUniversity(String universityID) {

        List<Student> result = new ArrayList<>();

        for (Student studentinos : listOfStudents) {
            if (studentinos.getUniversityID().equals(universityID)) {
                result.add(studentinos);
            }
        }
        return result;
    }

    public List<Student> showStudentByID(String id) {

        List<Student> result2 = new ArrayList<>();

        for (Student hippies : listOfStudents) {
            if (hippies.getId().equals(id)) {
                result2.add(hippies);

            }
        }
        return result2;


    }
}


















//    public Student showStudentByID(@PathVariable String id) {
//        for (Student hippies : listOfStudents) {
//            if (hippies.getId().equals(id)) {
//                return hippies;
//
//            }
//        }
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "student not found");
//
//    }


