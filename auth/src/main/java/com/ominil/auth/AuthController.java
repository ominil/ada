package com.ominil.auth;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class AuthController {

    AuthService authService;


    @PostMapping("api/v1/register")
    public void register() {
        log.info("register user controller");
        authService.register();
    }
}
