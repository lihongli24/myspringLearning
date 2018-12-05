package com.li.myspringlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    @Autowired
    private A a;

    public void bMethod(){
        System.out.println("bmethod");
    }
}
