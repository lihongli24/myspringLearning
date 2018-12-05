package com.li.myspringlearning;

import com.li.myspringlearning.aop.AbServiceInterface;
import com.li.myspringlearning.aop.DpServiceInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyspringlearningApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyspringlearningApplication.class, args);
		DpServiceInterface dpService = context.getBean(DpServiceInterface.class);
		dpService.say();
//
//		AbServiceInterface abServiceInterface = context.getBean(AbServiceInterface.class);
//		abServiceInterface.speak();

//		A a = context.getBean(A.class);
//		a.aMethod();

		C c = context.getBean(C.class);
		c.cMethod();

	}
}
