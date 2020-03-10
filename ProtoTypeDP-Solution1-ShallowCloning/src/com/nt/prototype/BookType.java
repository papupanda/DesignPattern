package com.nt.prototype;

import java.util.ArrayList;
import java.util.List;

import com.nt.dto.BookDTO;

public abstract class BookType  implements Cloneable {
	public String type;
	public List<BookDTO> books = new ArrayList<>();
	//getters & setters
    public String getType() {
		return type;	
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<BookDTO> getBooks() {
		return books;
	}
	public void setBooks(List<BookDTO> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "BookType [type=" + type + ", books=" + books + "]";
	}
	public abstract void loadBooks();
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
