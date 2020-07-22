package com.project;

import Intefaces.FakeRepo;
import Service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		System.out.println("----------user service Implementation---------");
		FakeRepo fakeRepo = new FakeRepo();
		UserServiceImpl userService =  new UserServiceImpl(fakeRepo);
		System.out.println(userService.addUser(1,"",""));
		System.out.println(userService.removeUser(1));
		System.out.println(userService.getUser(1));

	}

}
