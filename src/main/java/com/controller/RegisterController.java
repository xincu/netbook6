package com.controller;

import com.entity.reader;
import com.service.GmerService;
import com.service.ReaderService;
import com.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    ReaderService Reader;
    @Autowired
    WorkerService Worker;
    @Autowired
    GmerService Gmer;





    @RequestMapping("/register1")
    public  String  register1( reader reader){
        int num=-1;
        System.out.println(reader.getRname()+","+reader.getRaccount()+","+reader.getRpassword());
        if(num>0){
            return "ok";

        }else{
            return "no";
        }

    }




}
