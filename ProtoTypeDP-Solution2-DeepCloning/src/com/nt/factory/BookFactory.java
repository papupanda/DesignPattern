package com.nt.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nt.dto.BookDTO;
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
		BookType bookType=null;
		List<BookDTO> listBooks=null;
		BookDTO dto1=null;
		bookType= (BookType) cache.get(type).clone();
		listBooks=new ArrayList();
		for(BookDTO dto:bookType.getBooks()) {
			   dto1=new BookDTO();
			   dto1.setBookId(dto.getBookId());
			   dto1.setBookName(dto.getBookName());
			   listBooks.add(dto1);
		}
		bookType.setType(type);
		bookType.setBooks(listBooks);
      return bookType;		
		
	}
}
