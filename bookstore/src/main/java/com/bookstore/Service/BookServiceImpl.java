package com.bookstore.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.Entity.Book;
import com.bookstore.Repository.IBookRepositry;

@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private IBookRepositry bookRepository;

	@Override
	public void save(Book book) {
		bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(Integer bookId) {
		Optional<Book> book = bookRepository.findById(bookId);
		Book bookRetrive = null;
		if(book.isPresent()) {
			bookRetrive = book.get();
		}
		return bookRetrive;
	}

	@Override
	public void deleteById(Integer bookId) {
		bookRepository.deleteById(bookId);
	}

}
