package com.serviceImpl;

import com.entity.reader;
import com.mapper.ReaderMapper;
import com.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ReaderServiceImpl implements ReaderService {

    @Autowired
    private ReaderMapper readerMapper;
    @Override
    public reader onereader(String raccount, String rpassword) {
        return  readerMapper.onereader(raccount,rpassword);
    }

    @Override
    public int addReader(reader reader) {
        return readerMapper.addReader(reader);
    }

    @Override
    public reader IsexistRaccount(String raccount) {
        return readerMapper.IsexistRaccount(raccount);
    }

    @Override
    public int Count() {
        return readerMapper.Count();
    }

    @Override
    public List<reader> AllReader() {
        return readerMapper.AllReader();
    }

    @Override
    public reader GetOneReader(String raccount) {
        return readerMapper.GetOneReader(raccount);
    }

    @Override
    public Object findAnyReader(int pageNum, int pageSize) {

        int Count=readerMapper.Count();
        System.out.println(Count);
        int MaxPage=Count/pageSize;
        if (Count % pageSize != 0) {
            MaxPage++;
        }

        if (pageNum>MaxPage){
            pageNum=MaxPage; }else if (pageNum<1){
            pageNum=1;
       }
            int start = (pageNum - 1) * pageSize;

            List<reader> reader = readerMapper.findAnyReader(start, pageSize);
            return reader;

    }

    @Override
    public List<reader> likeReader(String keyWord) {
        return  readerMapper.likeReader(keyWord);
    }
}
