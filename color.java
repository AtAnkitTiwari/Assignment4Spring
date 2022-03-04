package com.tcstraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class color implements Vehicle {
	String color;
	public void feature() {
		System.out.println("Choose your color");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("blue");
		list.add("green");
		list.add("white");
		// Iterating list with help of for each loop
		for (String element : list)
			System.out.println(element);
		
		try {
			BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please write the color your choice");
			
				color=buffReader.readLine();
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
				
				
				
					if (list.contains(color)) {
						System.out.println("You have chosen:" +color);}
					else {
						System.out.println("Sorry not Available");
					}
	}


}
