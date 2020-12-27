package com.backsup.nonamemo.repository;

import com.backsup.nonamemo.document.memo.Memo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoRepository extends MongoRepository<Memo, Long> {
}
