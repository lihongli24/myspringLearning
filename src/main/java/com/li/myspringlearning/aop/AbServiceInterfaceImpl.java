package com.li.myspringlearning.aop;

import org.springframework.stereotype.Component;

@Component("abServiceInterfaceImpl")
public class AbServiceInterfaceImpl implements AbServiceInterface {

    @Override
    public void speak() {
        System.out.println("speak");
    }
}
