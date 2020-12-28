package com.backsup.nonamemo.controller;

import com.backsup.nonamemo.dto.user.SignInDTO;
import com.backsup.nonamemo.dto.user.SignUpDTO;
import com.backsup.nonamemo.dto.user.UserDTO;
import com.backsup.nonamemo.response.NonaResponse;
import com.backsup.nonamemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("signup")
    public NonaResponse<Map<String, Boolean>> signup(@RequestBody SignUpDTO signUpDTO) {
        Map<String, Boolean> signupResultMap = new HashMap<>();
        signupResultMap.put("isSuccess", userService.signup(signUpDTO));
        return new NonaResponse<>(signupResultMap);
    }

    @PostMapping("signin")
    public NonaResponse<UserDTO> signin(@RequestBody SignInDTO signInDTO) {
        UserDTO userDTO = userService.signin(signInDTO);
        return new NonaResponse<>(userDTO);
    }
}
