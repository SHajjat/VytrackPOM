package LinkedList;

import java.util.ArrayList;

public class Customer2 {
	private String name;
	private double balance;
	
	public Customer2(String name , double balance){
		this.balance = balance;
		this.name = name;
		
	}
	
	public double getbalance(){
		return balance;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		Customer2 customer = new Customer2("Tim",54.96);
		Customer2 customer1 = customer;
		customer1.setBalance(12.18);
		System.out.println("Balance for customer "+ customer.getName()+" is "+customer.getbalance());
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		for ( Integer integer:intList) {
			System.out.println("integer = " + integer);
			
		}
		System.out.println("*********");
		intList.add(0,2);
		for ( Integer integer:intList) {
			System.out.println("integer = " + integer);
			
		}
	}
	
}
