package com.backsup.nonamemo.dto.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SignUpDTO {
    private String username;
    private String nickname;
    private String password;
}
