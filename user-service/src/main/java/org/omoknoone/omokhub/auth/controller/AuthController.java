package org.omoknoone.omokhub.auth.controller;

import org.omoknoone.omokhub.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }


    @PostMapping("/logout")
    public ResponseEntity<?> logout(@RequestHeader String tokenIndex) throws AuthenticationException {
        authService.logout(tokenIndex);

        return ResponseEntity.noContent().build();
    }


}
