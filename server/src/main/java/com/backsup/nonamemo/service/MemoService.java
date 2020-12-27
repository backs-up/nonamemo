package com.backsup.nonamemo.service;

import com.backsup.nonamemo.document.memo.Memo;
import com.backsup.nonamemo.dto.memo.MemoDTO;
import com.backsup.nonamemo.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MemoService {

    private final MemoRepository memoRepository;

    public List<MemoDTO> selectMemoData(){
        List<MemoDTO> memoList = memoRepository.findAll().stream()
                .map(MemoDTO::new)
                .collect(Collectors.toList());
        return memoList;
    }

    public String createMemo(MemoDTO memoDTO) {
        Memo memo = Memo.newInstance(memoDTO);

        Memo savedMemo = memoRepository.save(memo);
        return savedMemo.getId();
    }
}
