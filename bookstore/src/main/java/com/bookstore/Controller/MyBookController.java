package com.bookstore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.Service.MyBookServiceImpl;

@Controller
public class MyBookController {

	@Autowired
	private MyBookServiceImpl myBookService;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deteleMyBookById(@PathVariable("id") Integer Id) {
		myBookService.deleteMyBookById(Id);
		return "redirect:/my_books";
	}
}
