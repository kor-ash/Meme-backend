package backend.controller;


import backend.common.ApiResponse;
import backend.dto.LoginRequest;
import backend.dto.SignUpRequest;
import backend.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<ApiResponse<Void>> singUp(@Valid @RequestBody SignUpRequest signUpRequest) {
        userService.signUp(signUpRequest);

        return ResponseEntity.ok(ApiResponse.success(null));
    }
    @PostMapping("/login")
    public ResponseEntity<ApiResponse<String>> login(@Valid @RequestBody LoginRequest loginRequest) {
        String jwtToken = userService.login(loginRequest);

        return ResponseEntity.ok(ApiResponse.success(jwtToken));
    }
}
