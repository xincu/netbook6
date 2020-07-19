package com.mapper;

import com.entity.reader;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReaderMapper {
    reader onereader(String raccount, String rpassword);

    int addReader(reader reader);

    reader IsexistRaccount(String raccount);

    int Count();

    List<reader> AllReader();

    reader GetOneReader(String raccount);

    List<reader> findAnyReader(int start, int pageSize);

    List<reader> likeReader(String keyWord);
}
