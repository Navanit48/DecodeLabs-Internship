package com.navanit.project3.service;

import com.navanit.project3.model.Student;
import com.navanit.project3.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> updateStudent(int id, Student updatedStudent) {

        Optional<Student> existingStudent = studentRepository.findById(id);

        if (existingStudent.isPresent()) {

            Student student = existingStudent.get();

            student.setName(updatedStudent.getName());
            student.setCourse(updatedStudent.getCourse());

            return Optional.of(studentRepository.save(student));
        }

        return Optional.empty();
    }

    public boolean deleteStudent(int id) {

        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }

        return false;
    }
}