package chapter10_IO;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		File input;
		try {
		 input = new File("fileName.txt");
		if ( !input.exists() ) {
		
				input.createNewFile();
		}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
}
