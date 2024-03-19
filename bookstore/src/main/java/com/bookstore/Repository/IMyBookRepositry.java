package com.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bookstore.Entity.MyBook;

public interface IMyBookRepositry extends JpaRepository<MyBook, Integer> {

}
