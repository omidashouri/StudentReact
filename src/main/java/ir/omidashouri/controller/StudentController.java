package ir.omidashouri.controller;

import ir.omidashouri.domain.StudentEntity;
import ir.omidashouri.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
@RequiredArgsConstructor
public class StudentController {

//    https://github.com/youtube-arjun-codes/FullStackApp

    private final StudentService studentService;

//    http://localhost:8080/StudentReact/student/add
    @PostMapping("/add")
    public String add(@RequestBody StudentEntity student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<StudentEntity> list(){
        return studentService.getAllStudents();
    }

}
