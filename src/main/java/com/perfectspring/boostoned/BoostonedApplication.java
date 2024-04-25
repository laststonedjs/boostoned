package com.perfectspring.boostoned;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoostonedApplication {

	public static void main(String[] args) {

		var ctx = SpringApplication.run(BoostonedApplication.class, args);

		MyFirstClass myFirstClass = ctx.getBean(MyFirstClass.class);
		System.out.println(myFirstClass.sayHello());
	}

}
