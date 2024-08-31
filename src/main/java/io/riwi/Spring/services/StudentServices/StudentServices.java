package io.riwi.Spring.services.StudentServices;

import io.riwi.Spring.entities.Student.StudentDtoResponse;
import io.riwi.Spring.entities.Student.StudentEntity;
import io.riwi.Spring.repository.StudentRepository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServices implements IStudentService {


    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public List<StudentDtoResponse> readAll() {
        List<StudentDtoResponse> listOfStudent = new ArrayList<>();
        List<StudentEntity> listWithoutDto = studentRepository.findAll();

        listWithoutDto.forEach(student -> {
            StudentDtoResponse dto = StudentDtoResponse.builder()
                    .idStudent(student.getIdStudent())
                    .name(student.getName())
                    .email(student.getEmail()).build();

            listOfStudent.add(dto);
        });

        return listOfStudent;
    }

}
