package io.riwi.Spring.repository.StudentRepository;

import io.riwi.Spring.entities.Student.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IStudentRepository extends JpaRepository<StudentEntity, Long> {

}
