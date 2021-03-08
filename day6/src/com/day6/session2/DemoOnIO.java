package com.day6.session2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DemoOnIO {

	public static void main(String[] args) {
		Set<String> words=new HashSet<String>();
		try {
			BufferedReader br=new BufferedReader(new FileReader(new File("data.txt")));
			String line;
			while((line=br.readLine())!=null) {
				String tokens[]=line.split(" ",-1);
				for(String token:tokens) {
					words.add(token.toLowerCase());
					//System.out.println(token);
				}
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(".....unique words......");
		for(String word:words) {
			System.out.println(word);
		}

	}

}
