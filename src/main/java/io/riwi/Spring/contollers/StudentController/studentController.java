package io.riwi.Spring.contollers.StudentController;

import io.riwi.Spring.entities.Student.StudentDtoRequest;
import io.riwi.Spring.entities.Student.StudentDtoResponse;


import io.riwi.Spring.services.StudentServices.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/by")
    public Page<StudentDtoResponse> getStudents(

            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        // Crear un objeto Pageable para la paginación
        Pageable pageable = PageRequest.of(page, size);

        // Llamar al servicio para obtener la lista de estudiantes filtrada y paginada
        Page<StudentDtoResponse> students = studentServices.readBy(name, email, pageable);

        // Retornar los resultados directamente
        return students;

    }

    @GetMapping("/{id}")
    public StudentDtoResponse getStudentById(@PathVariable Long id){
        return studentServices.readById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Establece el código de estado HTTP 201 (Created)
    public void createStudent(@RequestBody @Valid StudentDtoRequest studentDtoRequest) {
        studentServices.save(studentDtoRequest);
    }

    @PatchMapping("/{id}/disable")
    public StudentDtoResponse disableStudent(@PathVariable Long id){
       return studentServices.disable(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateStudent(@RequestBody @Valid StudentDtoRequest studentDtoRequest) {
        studentServices.save(studentDtoRequest);
    }

}
