package com.backsup.nonamemo.controller;

import com.backsup.nonamemo.dto.memo.MemoDTO;
import com.backsup.nonamemo.response.NonaResponse;
import com.backsup.nonamemo.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemoController {

    private final MemoService memoService;

    @GetMapping("/memos")
    public NonaResponse<List<MemoDTO>> memo(){
        List<MemoDTO> memo = memoService.selectMemoData();
        return new NonaResponse<>(memo);
    }

    @PostMapping("/memo")
    public NonaResponse<String> createMemo(@RequestBody MemoDTO memoDTO) {
        String memoId = memoService.createMemo(memoDTO);
        return new NonaResponse<>(memoId);
    }
}
