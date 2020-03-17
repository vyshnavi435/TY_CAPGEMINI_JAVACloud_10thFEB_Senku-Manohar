package com.tyss.capgemini.filehandling;
// to access properties file object
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) throws IOException {
		try(FileWriter fileWriter = new FileWriter("newFile.txt");){
			fileWriter.write("This is the FileWriter example of a mark writing data....");
			fileWriter.write("This is the FileWriter example of a  1data....");// this line will override  the existing line
			fileWriter.append("This is the FileWriter example of a 2 data....");// this line will be appended to the existing line
			System.out.println("data has been written in the file");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

