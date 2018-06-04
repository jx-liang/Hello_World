package com.dubbo.impl;
import com.dubbo.api.SayHiService;

public class SayHiServiceImpl implements SayHiService {
     public void sayHi(String a) {
        System.out.println("Hi,"+a+"!");
    }
}
