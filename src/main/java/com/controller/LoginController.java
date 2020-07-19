package com.controller;

import com.entity.reader;
import com.entity.worker;
import com.service.GmerService;
import com.service.ReaderService;
import com.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    ReaderService Reader;
    @Autowired
    WorkerService Worker;
    @Autowired
    GmerService Gmer;
    @RequestMapping("/login1")
    public String login1(String raccount,String rpassword){
        System.out.println(raccount+","+rpassword);
      reader reader= Reader.onereader(raccount,rpassword);
        System.out.println(reader);
        if (reader!=null){
            return "ok";
        }else{
            return "no";
        }
    }
@RequestMapping("/login2")
    public String login2(String waccount,String wpassword){
    System.out.println(waccount+","+wpassword);
    worker worker=  Worker.oneworker(waccount,wpassword);
    System.out.println(worker);

        if (worker!=null){
        return "ok";
    }else{
        return "no";
    }

}
@RequestMapping("IsexistRaccount")
    public  String IsexistRaccount(String raccount){
    System.out.println(raccount);
    reader reader=Reader.IsexistRaccount(raccount);
    if (reader==null){
        return "ok";
    }else {
        return "no";
    }
}

@RequestMapping("/Count1")
    public String Count1(){
     int a= Reader.Count();
     return "读者数量是"+a;
    }
@RequestMapping("/AllReader")
    public List<reader> AllReader(){
        List<reader> allReader = Reader.AllReader();
    System.out.println(allReader);
        return  allReader;
}
@RequestMapping("/GetOneReader")
    public  reader  GetOneReader( String raccount){
        reader reader =Reader.GetOneReader(raccount);
    System.out.println(reader);
        return reader;

}
@RequestMapping("/findAnyReader")
    public Object findAnyReader( int PageNum, int PageSize){
    System.out.println(PageNum+","+PageSize);
        return  Reader.findAnyReader(PageNum ,PageSize);
    }
    @RequestMapping("likeReader")
    public  Object likeReader(String KeyWord){
        List<reader> reader= Reader.likeReader(KeyWord);
        return  reader;
    }
}
