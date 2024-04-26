package com.perfectspring.boostoned;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoostonedApplication {

	public static void main(String[] args) {

		var ctx = SpringApplication.run(BoostonedApplication.class, args);

		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
	}

}
