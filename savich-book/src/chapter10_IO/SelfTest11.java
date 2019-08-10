package chapter10_IO;

import java.io.File;
import java.util.Scanner;

public class SelfTest11 {
	static File file;

	public static File getFile(){
		
		//System.out.println("Please enter the file path");
		file= new File(new Scanner(System.in).nextLine());
		return file;
	}
	public static void checkFile(){
		if(!file.exists()){
			System.out.println("file doesnt exist ");
			getFile();
		}else if(!file.canRead() || !file.canWrite()){
			System.out.println("File cant be read or write ");
			getFile();
		}
	}
	public static void deleteFile(){
		System.out.println("Do you wanna delete this ??");
		if((new Scanner(System.in).next()).equalsIgnoreCase("Yes")){
			file.delete();
		}else{
			return;
		}
		
	}
	
	public static void main(String[] args) {
		getFile();
		checkFile();
		deleteFile();
	}
}
