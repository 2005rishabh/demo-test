package com.example.demo_test;

import org.springframework.boot.SpringApplication;

public class TestDemoTestApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoTestApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
