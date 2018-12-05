package com.li.myspringlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {
    @Autowired
    private D d;
//    public C(@Autowired D d) {
//    }

    public void cMethod(){
        d.dMethod();
    }
}
