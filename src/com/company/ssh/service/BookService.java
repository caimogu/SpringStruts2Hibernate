package com.company.ssh.service;
//取数据的层

import java.util.List;

import com.company.ssh.bean.Book;
import com.company.ssh.dao.BookDAO;

public class BookService {
	private BookDAO bookDao;
	
	//用set方法 代替 new 
	public void setBookDao(BookDAO bookDao) {
		this.bookDao = bookDao;
	}


	public List<Book> findAll()
	{
		List<Book> list  = bookDao.select();
		return list;
	}
}
