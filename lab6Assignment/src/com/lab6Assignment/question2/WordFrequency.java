package com.lab6Assignment.question2;

import java.io.*;
import java.util.*;

public class WordFrequency {
	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		String line = null;
		int count;
		try {
			BufferedReader br = new BufferedReader(new FileReader(("wordsDocument")));
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(",");
				for (String token : tokens) {
					if (map.containsKey(token)) {
						map.put(token, map.get(token) + 1);
					} else
						map.put(token, 1);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
