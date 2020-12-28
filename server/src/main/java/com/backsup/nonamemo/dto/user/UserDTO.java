package com.backsup.nonamemo.dto.user;

import com.backsup.nonamemo.document.user.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    private String token;
    private String username;
    private String nickname;

    public static UserDTO create(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setNickname(user.getNickname());
        return userDTO;
    }

    public static UserDTO create(String token, User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setToken(token);
        userDTO.setUsername(user.getUsername());
        userDTO.setNickname(user.getNickname());
        return userDTO;
    }
}
