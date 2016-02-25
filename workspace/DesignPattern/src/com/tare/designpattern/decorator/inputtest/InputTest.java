package com.tare.designpattern.decorator.inputtest;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main (String[] args) throws IOException {
		int c;
		
		File path = new File(".");
		System.out.println(path.getAbsolutePath());
		
		String resPath = InputTest.class.getResource("").getPath();
		System.out.println(resPath);
		
		try {
			InputStream in = 
					new LowerCaseInputStream (
						new BufferedInputStream(
								new FileInputStream("test.txt")));
			
			while ((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
			
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
	
}
