package com.backsup.nonamemo.document.memo;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@Document(collation = "memos")
public class Memo {

    @Id
    private String id;

    private String userId;

    private String url;

    private String content;

    private List<String> likedUsers = new ArrayList<>();

    private LocalDateTime createdAt;
}
