package chapter10_IO.Udemy_excel;

import java.io.*;

public class FileWriterDemo {
	
	public static void main(String[] args) throws IOException {
		//file location and name
		File file = new File(System.getProperty("user.dir")+"/MyTextFile.html");
		for(int i = 1 ; i<1;i++) {
			//File file = new File("/Users/samirhajjat/Desktop/School/Project_X/savich-book/MyTextFile.txt");
			//establishing connectivity
			FileWriter fileWriter = new FileWriter(file,true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			//writing inside the File
			bufferedWriter.write(i+" Line\n");
			bufferedWriter.close();
			System.out.println("File is created");
		}
		FileWriter fileWriter = new FileWriter(file,true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//		for (int i = 0 ;i<4 ;i++){
//			for (int j = 0 ;j<3;j++){
//				int num = (int)(Math.random()*100);
//				bufferedWriter.write(num+"\n");
//
//
//			}
//
//		}
		bufferedWriter.write("<html><body><title> Hello from the other side</title><h1>How is it going</h1></body></html>");
		bufferedWriter.close();
	}
}
