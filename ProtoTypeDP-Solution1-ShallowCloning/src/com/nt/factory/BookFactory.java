package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.prototype.BookType;
import com.nt.prototype.FictionalBooks;
import com.nt.prototype.NonFictionalBooks;

public class BookFactory {
	private static Map<String,BookType>  cache=new HashMap();
	static {
		BookType fictionalBooks=new FictionalBooks();
		fictionalBooks.loadBooks();
		BookType nonfictionalBooks=new NonFictionalBooks();
		nonfictionalBooks.loadBooks();
		
		cache.put("fiction", fictionalBooks);
		cache.put("nonfiction", nonfictionalBooks);
	}
	
	public static BookType getBooks(String type) throws CloneNotSupportedException {
		   return (BookType) cache.get(type).clone();
		
	}
}
