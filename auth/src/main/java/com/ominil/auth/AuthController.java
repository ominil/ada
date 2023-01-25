package com.ominil.auth;

import com.ominil.auth.entity.UserRegistration;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@AllArgsConstructor
public class AuthController {

    AuthService authService;


    @PostMapping("api/v1/register")
    public void register(@RequestBody UserRegistration userRegistration) {
        log.info("register user controller");
        authService.register(userRegistration);
    }
}
