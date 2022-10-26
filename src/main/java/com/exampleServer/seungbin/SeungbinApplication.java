package com.exampleServer.seungbin;

import com.exampleServer.seungbin.Study1.*;
//import com.exampleServer.seungbin.Study1.UserServiceImpl;
import com.exampleServer.seungbin.assignment1.CarServiceImpl;
import net.bytebuddy.description.type.TypeList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeungbinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeungbinApplication.class, args);

		User user = new User(1, "최승빈", "서버");
//		user.introduce();

		user.setName("김소현");
		user.setPart("서버");

//		String name = user.getName();
//		System.out.println(name);
//		user.introduce();


		UserServiceImpl userService = new UserServiceImpl();
		String club = userService.CLUB;
//		System.out.println(club);
//		userService.introduce("최승빈", "ENFP");
//		userService.getInfo(31, "SERVER");
//		userService.getSOPT();

		Server server = new Server("최승빈", "스프링");
//		server.test();
		Generic<String> generic1 = new Generic<>("최승빈");
		Generic<Integer> generic2 = new Generic<>(24);
//		generic1.printData();
//		generic2.printData();


		CarServiceImpl carService = new CarServiceImpl();
		String carName = carService.CarName;
		carService.information("현대", "그랜저");
		carService.getInfo(56, "쏘나타");
		carService.getCar();



//		PrintObject<Integer> object1 = new PrintObject<>(31);
//		PrintObject<String> object2 = new PrintObject<>("server");
//		object1.printData();
//		object2.printData();
	}

}
