package com.serviceImpl;

import com.mapper.GmerMapper;
import com.service.GmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GmerServiceImpl implements GmerService {
    @Autowired
    private GmerMapper gmerMapper;
}
