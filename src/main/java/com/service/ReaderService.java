package com.service;

import com.entity.reader;

import java.util.List;

public interface ReaderService {
    reader onereader(String raccount, String rpassword);

    int addReader(reader reader);

    reader IsexistRaccount(String raccount);

    int Count();

    List<reader> AllReader();

    reader GetOneReader(String raccount);

    Object findAnyReader(int pageNum, int pageSize);

    List<reader> likeReader(String keyWord);
}
