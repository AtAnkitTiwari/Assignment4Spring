package com.tcstraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
@Component
public class Tyre implements Vehicle {
	String tyre;
	public void feature() {
		System.out.println("Choose your Tyre Brand");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("MEF");
		list.add("Ceat");
		list.add("Apollo");
		list.add("TVS");
		// Iterating list with help of for each loop
		for (String element : list)
			System.out.println(element);
		
		try {
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please write the name of brand of tyre of your choice");
		
			tyre=buffReader.readLine();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
			
			
			
				if (list.contains(tyre)) {
					System.out.println("You have chosen:" +tyre);}
				else {
					System.out.println("Sorry not Available");
				
				}
	}
}
