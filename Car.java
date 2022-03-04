package com.tcstraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	String brand;
	public void feature() {
		System.out.println("Choose your Brand");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Honda");
		list.add("Hundai");
		list.add("Maruti");
		list.add("Ford");
		// Iterating list with help of for each loop
		for (String element : list)
			System.out.println(element);
		
		try {
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please write the name of brand of your choice");
		
			brand=buffReader.readLine();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
			
			
			
				if (list.contains(brand)) {
					System.out.println("You have chosen:" +brand);}
				else {
					System.out.println("Sorry not Available");
				
				}
					
			
		
		
		
	}

}
