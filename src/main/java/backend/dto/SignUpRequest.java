package backend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class SignUpRequest {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
