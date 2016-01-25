package com.company.ssh;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.company.ssh.bean.Book;

public class Main {

	public static void main(String[] args) {
		
		//configure()默认参数是 "hibernate.cfg.xml"
		//Configuration config = new Configuration().configure("abc.cfg.xml");
		Configuration config = new Configuration().configure();
		
		//创建数据库连接 先创建工厂 再创建会话
		Session session = config.buildSessionFactory().openSession();
		//"from Book" 中的Book 是类名
		Query query = session.createQuery("from Book");
		List<Book> list = query.list();
		for(Book book:list)
		{
			System.out.println(book.getId()+","+book.getBookname()+","+book.getPrice());
		}
		
		

	}

}
