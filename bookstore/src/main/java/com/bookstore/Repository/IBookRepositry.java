package com.bookstore.Repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.bookstore.Entity.Book;

public interface IBookRepositry extends JpaRepository<Book, Integer> {

}
