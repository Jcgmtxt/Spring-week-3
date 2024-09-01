package io.riwi.Spring.repository.StudentRepository;

import io.riwi.Spring.entities.Student.StudentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IStudentRepository extends JpaRepository<StudentEntity, Long> {
    Page<StudentEntity> findByNameAndEmailContainingAndActiveTrue(String name, String email, Pageable pageable);
    Page<StudentEntity> findByNameAndActiveTrue(String name, Pageable pageable);
    Page<StudentEntity> findByEmailContainingAndActiveTrue(String email, Pageable pageable);
    Page<StudentEntity> findAllByActiveTrue(Pageable pageable);
}
