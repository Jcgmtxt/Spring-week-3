package io.riwi.Spring.entities.Student;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table( name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idStudent;

    @Column(name = "name")
    private String name;

    @Column(name = "email" )
    private String email;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "active")
    private boolean active;


}
