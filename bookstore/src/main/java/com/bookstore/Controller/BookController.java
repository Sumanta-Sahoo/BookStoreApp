package com.bookstore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.Entity.Book;
import com.bookstore.Entity.MyBook;
import com.bookstore.Service.BookServiceImpl;
import com.bookstore.Service.MyBookServiceImpl;

@Controller
public class BookController {
	
	@Autowired
	private BookServiceImpl bookService;
	
	@Autowired
	private MyBookServiceImpl myBookService;

	@GetMapping("/")
	public String home() {
		return "home.html";
	}
	@GetMapping("/bookRegister")
	public String book() {
		return "bookRegister.html";
	}
	@GetMapping("/availabe_books")
	public ModelAndView availabeBooks() {
		List<Book> list = bookService.getAllBooks();
		return new ModelAndView("availabeBooks","book",list);
	}
//	@GetMapping("/my_books")
//	public String myBooks() {
//		return "myBooks.html";
//	}
	@GetMapping("/my_books")
	public String getMyBooks(Model model) {
		List<MyBook> allMyBooks = myBookService.getAllMyBooks();
		model.addAttribute("myBook",allMyBooks);
		return "myBooks.html";
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book book) {
		bookService.save(book);
		return "redirect:/availabe_books";
	}
	
	@RequestMapping("/my_books/{id}")
	public String addToMyBooks(@PathVariable("id") Integer id) {
		Book b = bookService.getBookById(id);
		MyBook myBook = new MyBook(b.getBookId(), b.getBookName(),b.getBookAuthor(),b.getBookPrice(), b.getBookGenre());
		myBookService.saveMyBooks(myBook);
		return "redirect:/my_books";
	}
	
	@RequestMapping("/deleteBookList/{id}")
	public String deleteBookById(@PathVariable("id") Integer id) {
		bookService.deleteById(id);
		return "redirect:/availabe_books";
	}
	
}
