package com.csra.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class HelloWorldAnnotationConfigurationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HelloWorldAnnotationConfigurationApplication.class, args);
		ApplicationContext context = new FileSystemXmlApplicationContext("context.xml");
		
		HelloSystem system = context.getBean("HelloSystem", HelloSystem.class);
		System.out.println(system.getSystem());
		
//		HelloWorldModel helloVenusModel = context.getBean("HelloVenusModel",HelloWorldModel.class);
//		System.out.println(helloVenusModel.getValue());
		
		((FileSystemXmlApplicationContext) context).close();
	}
}
