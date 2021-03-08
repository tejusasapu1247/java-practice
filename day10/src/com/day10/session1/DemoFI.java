package com.day10.session1;
import java.io.*;
public class DemoFI {
	
	public static void main(String[] args) {
		//print all the hidden files from a folder
		
		File dir=new File("/home/raj/Desktop/tools/eclipse_luna");
		if(dir.isDirectory()){
			
			//File[]files=dir.listFiles( fileName-> fileName.isHidden());
			
			File[]files=dir.listFiles(File::isHidden);
			
			for(File file: files){
				System.out.println(file);
			}
			
		}
	}

}

