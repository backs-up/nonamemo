package com.backsup.nonamemo.document.memo;

import com.backsup.nonamemo.dto.MemoDTO;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@Document(collection = "memos")
public class Memo {

    @Id
    private String id;

    private String userId;

    private String url;

    private String content;

    private List<String> likedUsers = new ArrayList<>();

    private LocalDateTime createdAt;

    public static Memo newInstance(MemoDTO memoDTO) {
        return Memo.builder()
                .userId("user-id")
                .url(memoDTO.getUrl())
                .content(memoDTO.getContent())
                .createdAt(LocalDateTime.now())
                .build();
    }
}
