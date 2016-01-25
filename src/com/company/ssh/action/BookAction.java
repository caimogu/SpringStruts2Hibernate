package com.company.ssh.action;

import java.util.List;

import com.company.ssh.bean.Book;
import com.company.ssh.service.BookService;

public class BookAction {
	
	
	private BookService bookService;
	private List<Book> list;
	
	
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	

	public List<Book> getList() {
		return list;
	}



	public String execute()
	{
		System.out.println("BookAction--execute()--");
		list = bookService.findAll();
		//System.out.println(list.size());
		return "success";
	}

}
