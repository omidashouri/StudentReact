package ir.omidashouri.service;

import ir.omidashouri.domain.StudentEntity;
import ir.omidashouri.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    @Override
    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
