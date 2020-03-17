package com.tyss.capgemini.filehandling;
// for media files
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) throws IOException {
	try(FileInputStream fileInputStream = new FileInputStream("Image.png")){
		int imgCode ;
	 while ((imgCode = fileInputStream.read()) != -1){
		 System.out.println(imgCode);
	 }
		
	}catch (Exception e) {
		e.printStackTrace();
	}
		
	}

}
