package com.backsup.nonamemo.controller;

import com.backsup.nonamemo.document.memo.Memo;
import com.backsup.nonamemo.service.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MemoController {

    private final MemoService memoService;

    public MemoController(MemoService memoService) {
        this.memoService = memoService;
    }

    @RequestMapping("/all")
    public String memo(Model model){
        List<Memo> memo = memoService.selectMemoData();
        model.addAttribute("memo", memo);
        return "memo";
    }
}
