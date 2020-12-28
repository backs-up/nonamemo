package com.backsup.nonamemo.dto.user;

import com.backsup.nonamemo.document.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private String username;
    private String nickname;

    public static UserDTO create(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setNickname(user.getNickname());
        return userDTO;
    }
}
