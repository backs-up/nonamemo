package com.backsup.nonamemo.controller;

import com.backsup.nonamemo.document.memo.Memo;
import com.backsup.nonamemo.dto.MemoDTO;
import com.backsup.nonamemo.service.MemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemoController {

    private final MemoService memoService;

    public MemoController(MemoService memoService) {
        this.memoService = memoService;
    }

    @GetMapping("/memos")
    public List<MemoDTO> memo(){
        List<MemoDTO> memo = memoService.selectMemoData();
        return memo;
    }

    @PostMapping("/memo")
    public String createMemo(@RequestBody MemoDTO memoDTO) {
        String memoId = memoService.createMemo(memoDTO);
        return memoId;
    }
}
