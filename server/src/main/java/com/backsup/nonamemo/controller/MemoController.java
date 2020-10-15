package com.backsup.nonamemo.controller;

import com.backsup.nonamemo.document.memo.Memo;
import com.backsup.nonamemo.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MemoController {

    private MemoService memoService;

    @Autowired
    public void setMemoService(MemoService memoService){
        this.memoService = memoService;
    }

    @RequestMapping("/all")
    public String memo(Model model){
        List<Memo> memo = memoService.selectMemoData();
        model.addAttribute("memo", memo);
        return "memo";
    }
}
