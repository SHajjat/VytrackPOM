package Generics;

import java.util.ArrayList;

public class Main1 {
	public static void main(String[] args) {
		ArrayList <Integer> items = new ArrayList<>();
		items.add(1);
		items.add(2);
		//items.add("tim");
		items.add(4);
		items.add(5);
		items.add(6);
		
		printDouble(items);
		
	}
	
	private static void printDouble(ArrayList <Integer> n) {
		for (int i : n) {
			System.out.println(i *2);
		}
	}
	
}
