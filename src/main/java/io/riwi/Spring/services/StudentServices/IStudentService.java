package io.riwi.Spring.services.StudentServices;
import io.riwi.Spring.entities.Student.StudentDtoRequest;
import io.riwi.Spring.entities.Student.StudentDtoResponse;
import io.riwi.Spring.entities.Student.StudentEntity;

import java.util.List;

public interface IStudentService {

    public List<StudentDtoResponse> readAll();
    public StudentDtoResponse readById(Long id);
    public StudentEntity save (StudentDtoRequest studentDtoRequest);
    public StudentDtoResponse disable (Long id);
}
