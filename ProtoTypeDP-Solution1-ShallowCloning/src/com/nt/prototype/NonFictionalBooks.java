package com.nt.prototype;

import com.nt.dto.BookDTO;

public class NonFictionalBooks  extends BookType {

	@Override
	public void loadBooks() {	
//Assume that here we are writing DB code here 
//to fetch Books which takes more time for consuming process 
		System.out.println("NonFictionalBooks.loadBooks()");
		setType("Non-Fiction");
		
		for(int i=1;i<=5;i++) {
			BookDTO dto=new BookDTO();
			dto.setBookId(i);
			dto.setBookName("Book "+i);
			getBooks().add(dto);
		}

	}

}

