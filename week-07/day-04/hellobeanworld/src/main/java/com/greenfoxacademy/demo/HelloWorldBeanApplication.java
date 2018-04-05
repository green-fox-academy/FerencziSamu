package com.greenfoxacademy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class HelloWorldBeanApplication implements CommandLineRunner{
	@Autowired
	Printer printer;

	@Autowired
	MyColor myColor;

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldBeanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(printer.log("koszi Attila!"));
		myColor.printColor();
	}



}
