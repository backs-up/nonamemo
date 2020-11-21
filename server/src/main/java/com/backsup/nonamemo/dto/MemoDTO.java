package com.backsup.nonamemo.dto;

import com.backsup.nonamemo.document.memo.Memo;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Getter
public class MemoDTO {
    private String id;
    private String userId;
    private String url;
    private String content;
    private List<String> likedUsers;
    private LocalDateTime createdAt;

    public MemoDTO(Memo memo) {
        this.id = memo.getId();
        this.userId = memo.getUserId();
        this.url = memo.getUrl();
        this.content = memo.getContent();
        this.likedUsers = memo.getLikedUsers();
        this.createdAt = memo.getCreatedAt();
    }
}
