package com.nt.test;

import com.nt.factory.BookFactory;
import com.nt.prototype.BookType;

public class PrototypeSolutionTest {	
	public static void main(String[] args)throws Exception {
		BookType fictionBooks=BookFactory.getBooks("fiction");
		BookType nonfictionBooks=BookFactory.getBooks("nonfiction");
		
		//creates fictionBooks1 obj through cloning
		BookType fictionBooks1=BookFactory.getBooks("fiction");
		//creates fictionBooks2 obj through cloning
		BookType nonfictionBooks1=BookFactory.getBooks("nonfiction");	
		
		
		System.out.println(fictionBooks);
		System.out.println(nonfictionBooks);
		System.out.println("...................................");
		System.out.println(fictionBooks1);
		System.out.println(nonfictionBooks1);
		System.out.println("------------------------------------------------------");
		fictionBooks.getBooks().remove(1);
		System.out.println(fictionBooks);
		System.out.println(fictionBooks1);
		System.out.println("========================");
		nonfictionBooks.getBooks().remove(1);
		System.out.println(nonfictionBooks);
		System.out.println(nonfictionBooks1);

		
		
	}
}
