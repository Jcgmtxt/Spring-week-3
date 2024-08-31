package io.riwi.Spring.repository.StudentRepository;

import io.riwi.Spring.entities.Student.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<StudentEntity, Long> {

}
