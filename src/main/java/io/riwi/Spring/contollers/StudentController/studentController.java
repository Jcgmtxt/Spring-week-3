package io.riwi.Spring.contollers.StudentController;

import io.riwi.Spring.entities.Student.StudentDtoRequest;
import io.riwi.Spring.entities.Student.StudentDtoResponse;


import io.riwi.Spring.services.StudentServices.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/students")
public class studentController {

    @Autowired
    private StudentServices studentServices;

    @GetMapping
    public List<StudentDtoResponse> getAllStudent(){
        return studentServices.readAll();
    }

    @GetMapping("/{id}")
    public StudentDtoResponse getStudentById(@PathVariable Long id){
        return studentServices.readById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Establece el código de estado HTTP 201 (Created)
    public void createStudent(@RequestBody @Valid StudentDtoRequest studentDtoRequest) {
        studentServices.create(studentDtoRequest);
    }

    @PatchMapping("/{id}/disable")
    public StudentDtoResponse disableStudent(@PathVariable Long id){
       return studentServices.disable(id);
    }

}
