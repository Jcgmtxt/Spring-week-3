package io.riwi.Spring.entities.Student;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentDtoRequest {

    @NotBlank(message = "Name is required")
    @NotNull
    private String name;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is required")
    private String email;

    @NotNull(message = "Active status is required") // Asegura que 'active' no sea null
    private boolean active;

}
