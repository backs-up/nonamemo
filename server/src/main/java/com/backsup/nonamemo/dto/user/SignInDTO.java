package com.backsup.nonamemo.dto.user;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class SignInDTO {
    private String username;
    private String password;
}