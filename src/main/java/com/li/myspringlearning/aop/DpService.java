package com.li.myspringlearning.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DpService implements DpServiceInterface {

    @Autowired
    @Qualifier("abServiceInterfaceImpl")
    private AbServiceInterface aaService;

    public DpService() {
        System.out.print("Dp init");
    }

    public void say() {
        System.out.println("aaa");
    }
}
