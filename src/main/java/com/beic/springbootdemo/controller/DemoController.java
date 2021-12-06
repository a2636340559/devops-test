package com.beic.springbootdemo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Iterator;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    private static ArrayList<Integer> arrayList = new ArrayList<>();
    static {
        arrayList.add(1);
        arrayList.add(2);
    }
    @RequestMapping("/initialPage")
    public String sayHi() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("a");
        for(Integer integer:arrayList)
            System.out.println("arrayList:"+integer);
        for(String s:arrayList1)
            System.out.println("arrayList1:"+s);

        return "Hello World";
    }
    @RequestMapping("/test")
    public String test( String param){
        System.out.println("参数："+param);
        return param;
    }
}
