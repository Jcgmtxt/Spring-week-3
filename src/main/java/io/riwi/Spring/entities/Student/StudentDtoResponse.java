package io.riwi.Spring.entities.Student;


import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDtoResponse {

    private Long idStudent;

    private String name;

    private String email;

}
