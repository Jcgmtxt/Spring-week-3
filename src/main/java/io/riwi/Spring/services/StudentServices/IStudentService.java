package io.riwi.Spring.services.StudentServices;
import io.riwi.Spring.entities.Student.StudentDtoRequest;
import io.riwi.Spring.entities.Student.StudentDtoResponse;
import io.riwi.Spring.entities.Student.StudentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStudentService {

    public List<StudentDtoResponse> readAll();
    public StudentDtoResponse readById(Long id);
    public void save (StudentDtoRequest studentDtoRequest);
    public StudentDtoResponse disable (Long id);
    public Page<StudentDtoResponse> readBy(String name, String email, Pageable pageable);

}
