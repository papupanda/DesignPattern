package com.nt.test;

import com.nt.factory.BookFactory;
import com.nt.prototype.BookType;

public class PrototypeProblemTest {	
	public static void main(String[] args) {
		BookType fictionBooks=BookFactory.getBooks("fiction");
		BookType nonfictionBooks=BookFactory.getBooks("nonfiction");
		
		BookType fictionBooks1=BookFactory.getBooks("fiction");
				//Here again loadBooks method executes and objs are created from scratch level
		BookType nonfictionBooks1=BookFactory.getBooks("nonfiction");	
				//Here again loadBooks method executes and objs are created from scratch level
		
		System.out.println(fictionBooks);
		System.out.println(nonfictionBooks);
		System.out.println("...................................");
		System.out.println(fictionBooks1);
		System.out.println(nonfictionBooks1);
	}
}
