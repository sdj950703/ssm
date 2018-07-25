package com.ssm.service;

import java.util.List;

import com.ssm.model.Book;

public interface IBookService {
	
	List<Book> selectAll();

	boolean insertBook(Book book);

	boolean delete(int bookNo);

	Book selectByPrimarykey(int bookNo);

	boolean updateByPrimaryKey(Book book);
	}
