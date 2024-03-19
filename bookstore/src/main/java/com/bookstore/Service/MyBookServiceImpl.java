package com.bookstore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.Entity.MyBook;
import com.bookstore.Repository.IMyBookRepositry;

@Service
public class MyBookServiceImpl implements IMyBooksService {
	
	@Autowired
	IMyBookRepositry myBookRepo;

	@Override
	public void saveMyBooks(MyBook myBook) {
		myBookRepo.save(myBook);
	}

	@Override
	public List<MyBook> getAllMyBooks() {
		List<MyBook> findAll = myBookRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteMyBookById(Integer myBookId) {
		myBookRepo.deleteById(myBookId);
	}

}
