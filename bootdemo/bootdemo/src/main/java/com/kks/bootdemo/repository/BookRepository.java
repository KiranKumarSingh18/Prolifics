package com.kks.bootdemo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kks.bootdemo.entity.Book;


public interface BookRepository extends JpaRepository<Book, String>
{
	Optional<Book> findByBookTitle(String bookTitle);
	List<Book> findByBookCategory(String bookCategory);
	Optional<Book> findByBookAuthor(String bookAuthor);
	Optional<Book> findByBookPrice(double bookPrice);
}
