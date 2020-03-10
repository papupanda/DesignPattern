package com.nt.factory;

import com.nt.prototype.BookType;
import com.nt.prototype.FictionalBooks;
import com.nt.prototype.NonFictionalBooks;

public class BookFactory {
	
	public static BookType getBooks(String type) {
		BookType btype=null;
		
		if(type.equalsIgnoreCase("fiction")) {
			btype=new FictionalBooks();
			btype.loadBooks();
		}
		else if(type.equalsIgnoreCase("nonfiction")) {
			btype=new NonFictionalBooks();
			btype.loadBooks();
		}
		else {
			throw new IllegalArgumentException("Invalid Book Type");
		}
		return btype;
			
	}
}
