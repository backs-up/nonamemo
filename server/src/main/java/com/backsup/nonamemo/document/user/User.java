package com.backsup.nonamemo.document.user;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Builder
@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String username;

    private String password;

    private String nickname;

    private LocalDateTime createdAt;
}
