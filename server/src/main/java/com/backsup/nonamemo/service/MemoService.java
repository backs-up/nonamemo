package com.backsup.nonamemo.service;

import com.backsup.nonamemo.document.memo.Memo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoService {

    private final MongoTemplate mongoTemplate;

    public MemoService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<Memo> selectMemoData(){
        List<Memo> memoList = mongoTemplate.findAll(Memo.class);
        return memoList;
    }
}
