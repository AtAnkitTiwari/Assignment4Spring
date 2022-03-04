package com.tcstraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component

public class Musicsystem implements Vehicle{
	String musicsystem;
	public void feature() {
		System.out.println("Choose your Brand");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sony");
		list.add("JBL");
		list.add("Boat");
		list.add("Hammer");
		// Iterating list with help of for each loop
		for (String element : list)
			System.out.println(element);
		
		try {
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please write the name of brand of musicsystem of your choice");
		
			musicsystem=buffReader.readLine();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
			
			
			
				if (list.contains(musicsystem)) {
					System.out.println("You have chosen:" +musicsystem);}
				else {
					System.out.println("Sorry not Available");
				
				}

}}
