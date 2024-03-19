package com.bookstore.Service;

import java.util.List;

import com.bookstore.Entity.MyBook;

public interface IMyBooksService {

	public void saveMyBooks(MyBook myBook);
	
	public List<MyBook> getAllMyBooks();
	
	public void deleteMyBookById(Integer myBookId);
}
