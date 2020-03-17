package com.tyss.capgemini.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		try(FileReader fileReader = new FileReader("newFile.txt");){
			int charUnicode;
			while((charUnicode = fileReader.read()) != -1) {
				System.out.println((char)charUnicode);//read() will return integer type values of each letter in newFile file. so we convert it to char
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
