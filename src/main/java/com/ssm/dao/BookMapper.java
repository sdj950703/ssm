package com.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.model.Book;

@Repository
public interface BookMapper {
    boolean deleteByPrimaryKey(Integer bookNo);

    boolean insert(Book book);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookNo);

    boolean updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

	List<Book> selectAll();
}