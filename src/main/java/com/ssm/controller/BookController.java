package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.Book;
import com.ssm.service.IBookService;

@Controller
@RequestMapping(value="/book")
public class BookController {
	
	@Autowired
	private IBookService service;

	@RequestMapping(value="/list")
	public String selectAllBook(ModelMap map,String msg){
		List<Book> books = service.selectAll();
		map.addAttribute("books", books);
		map.addAttribute("msg", msg);
		return "list";
	}
	
	@RequestMapping(value="/add")
	public String add(){
		return "add";
	}
	
	@RequestMapping(value="/toadd")
	public String toAdd(Book book,ModelMap model){
		boolean flag=service.insertBook(book);
		String msg="add failer";
		if(flag){
			msg="add success";
		}
		model.addAttribute("msg", msg);
		return "redirect:list";
		
	}
	
	@RequestMapping(value="{bookNo}",params="_method=delete")
	public String delete(@PathVariable int bookNo,ModelMap model){
		boolean flag=service.delete(bookNo);
		String msg="delete failer";
		if(flag){
			msg="delete success";
		}
		model.addAttribute("msg", msg);
		return "redirect:list";
		
	}
	
	@RequestMapping(value="{bookNo}",params="_method=update")
	public String update(@PathVariable int bookNo,ModelMap model){
		Book book=service.selectByPrimarykey(bookNo);
		model.addAttribute("book", book);
		return "update";
		
	}
	
	@RequestMapping(value="toupdate")
	public String toupdate(Book book,ModelMap model){
		boolean flag=service.updateByPrimaryKey(book);
		String msg="update failer";
		if(flag){
			msg="update success";
		}
		model.addAttribute("msg", msg);
		return "redirect:list";
	}

}
