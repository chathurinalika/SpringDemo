package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		//To demo setter injection
		Circle circle = context.getBean("circle", Circle.class);
		circle.draw();
		
		//To demo constructor injection
		Quadrilateral quadrilateral = context.getBean("quadrilateral", Quadrilateral.class);
		quadrilateral.draw();
		
		//To demo injecting object
		Triangle triangle = context.getBean("triangle",Triangle.class);
		triangle.draw();
	}
}
