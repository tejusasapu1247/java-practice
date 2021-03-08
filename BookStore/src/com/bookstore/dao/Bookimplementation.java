package com.bookstore.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Bookimplementation implements BookDao {

	private BufferedReader br = null;
	private BufferedWriter bw = null;

	public Bookimplementation() throws IOException {
		br = new BufferedReader(new FileReader("data.txt"));
		bw = new BufferedWriter(new FileWriter("data.txt", true));

	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();
		String line;
		try {
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(":");
				Book book = new Book(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]),
						Double.parseDouble(tokens[3]), tokens[4], tokens[5]);
				books.add(book);
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;

	}
}
