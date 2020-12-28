package com.backsup.nonamemo.controller;

import com.backsup.nonamemo.dto.user.SignInDTO;
import com.backsup.nonamemo.dto.user.SignUpDTO;
import com.backsup.nonamemo.dto.user.UserDTO;
import com.backsup.nonamemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("signup")
    public boolean signup(@RequestBody SignUpDTO signUpDTO) {
        return userService.signup(signUpDTO);
    }

    @PostMapping("signin")
    public UserDTO signin(@RequestBody SignInDTO signInDTO) {
        return userService.signin(signInDTO);
    }
}
