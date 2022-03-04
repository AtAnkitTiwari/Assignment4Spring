package com.tcstraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Vehicle.xml");

		Vehicle obj=(Vehicle) context.getBean("car");
		obj.feature();
		Vehicle obj1=(Vehicle) context.getBean("color");
		obj1.feature();
		Vehicle obj2=(Vehicle) context.getBean("tyre");
		obj2.feature();
		Vehicle obj3=(Vehicle) context.getBean("musicsystem");
		obj3.feature();
	}

}
