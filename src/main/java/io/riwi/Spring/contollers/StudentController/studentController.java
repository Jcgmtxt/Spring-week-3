package io.riwi.Spring.contollers.StudentController;

import io.riwi.Spring.entities.Student.StudentDtoResponse;

import io.riwi.Spring.services.StudentServices.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class studentController {

    @Autowired
    private StudentServices studentServices;

    @GetMapping
    public List<StudentDtoResponse> getAllStudent(){
        return studentServices.readAll();
    }


}
