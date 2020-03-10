package com.nt.dto;
public class BookDTO {
	private int bookId;
	private String bookName;
	
	public BookDTO() {
		System.out.println("BookDTO::0-param constructor");
	}
	
	//setter and getters
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return"Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
}
