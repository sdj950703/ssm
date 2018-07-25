package com.ssm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.BookMapper;
import com.ssm.model.Book;
import com.ssm.service.IBookService;

@Service
public class BookServiceImpl implements IBookService{
	
	@Autowired
	private BookMapper mapper;

	@Override
	public List<Book> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public boolean insertBook(Book book) {
		return mapper.insert(book);
	}

	@Override
	public boolean delete(int bookNo) {
		return mapper.deleteByPrimaryKey(bookNo);
	}

	@Override
	public Book selectByPrimarykey(int bookNo) {
		return mapper.selectByPrimaryKey(bookNo);
	}

	@Override
	public boolean updateByPrimaryKey(Book book) {
		
		return mapper.updateByPrimaryKeySelective(book);
	}

	
	
}
