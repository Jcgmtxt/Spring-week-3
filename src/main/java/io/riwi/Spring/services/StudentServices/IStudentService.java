package io.riwi.Spring.services.StudentServices;
import io.riwi.Spring.entities.Student.StudentDtoResponse;

import java.util.List;

public interface IStudentService {

    public List<StudentDtoResponse> readAll();


}
