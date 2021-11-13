package ir.omidashouri.service;

import ir.omidashouri.domain.StudentEntity;

import java.util.List;

public interface StudentService {

     StudentEntity saveStudent(StudentEntity student);
     List<StudentEntity> getAllStudents();
}
