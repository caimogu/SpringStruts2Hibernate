package com.company.ssh.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.company.ssh.bean.Book;

public class BookDAO extends HibernateDaoSupport{
	
	public List<Book> select()
	{
		Query query = getSession().createQuery("from Book");
		
		return query.list();
	}
}
