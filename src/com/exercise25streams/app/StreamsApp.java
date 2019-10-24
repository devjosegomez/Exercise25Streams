package com.exercise25streams.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StreamsApp {

	public static void main(String[] args) {	
		String line = "";
		File myFile = null;
		FileReader myReader = null;
		BufferedReader myBuffer = null;
		
		try {
			myFile = new File("C:\\a\\a.txt");
			myReader = new FileReader(myFile);
			myBuffer = new BufferedReader(myReader);
			
			while((line = myBuffer.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				myBuffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			myReader = null;
			myBuffer = null;
		}
	}
}
