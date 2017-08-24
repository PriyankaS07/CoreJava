package com.jsp.shopping;

import java.util.ArrayList;

public class BookBean {

	private ArrayList<String> books;

	public BookBean() {
		super();
		this.books = new ArrayList<String>();
	}
	
	public void addBook(String bookName){
		this.books.add(bookName);
	}

	public ArrayList<String> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<String> books) {
		this.books = books;
	}

}
