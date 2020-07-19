package com.mapper;

import com.entity.worker;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerMapper {
    worker oneworker(String waccount, String wpassword);
}
