package chapter10_IO;

import java.io.*;

public class samCreater {
	
	private static void letsCreateSam(){
		PrintWriter outStream = null;
		String file = "sam.txt";
		
		try {
			outStream = new PrintWriter(file);
		}catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		outStream.println("guess who is here?");
		outStream.println("sam is here brah");
		outStream.close();
	}
	
	private static void letsCreateMoreSams(){
		PrintWriter outStream = null;
		String file = "sam.txt";
		try{
			outStream = new PrintWriter(new FileOutputStream(file,true));
		}catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		outStream.println("sam is back");
		outStream.println("back again");
		outStream.close();
		System.out.println("sam was hanging out at file "+file);
	}
	
	public static void main(String[] args) {
		letsCreateSam();
		letsCreateMoreSams();
	}
}
