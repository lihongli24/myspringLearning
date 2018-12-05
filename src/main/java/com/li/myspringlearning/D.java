package com.li.myspringlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class D {
    private C c;
    public D(@Autowired C c) {
        this.c = c;
    }

    public void dMethod(){
        System.out.println("dMethod");
    }
}
