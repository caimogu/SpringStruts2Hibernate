package com.company.ssh.service;
//ȡ���ݵĲ�

import java.util.List;

import com.company.ssh.bean.Book;
import com.company.ssh.dao.BookDAO;

public class BookService {
	private BookDAO bookDao;
	
	//��set���� ���� new 
	public void setBookDao(BookDAO bookDao) {
		this.bookDao = bookDao;
	}


	public List<Book> findAll()
	{
		List<Book> list  = bookDao.select();
		return list;
	}
}
