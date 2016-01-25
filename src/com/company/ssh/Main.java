package com.company.ssh;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.company.ssh.bean.Book;

public class Main {

	public static void main(String[] args) {
		
		//configure()Ĭ�ϲ����� "hibernate.cfg.xml"
		//Configuration config = new Configuration().configure("abc.cfg.xml");
		Configuration config = new Configuration().configure();
		
		//�������ݿ����� �ȴ������� �ٴ����Ự
		Session session = config.buildSessionFactory().openSession();
		//"from Book" �е�Book ������
		Query query = session.createQuery("from Book");
		List<Book> list = query.list();
		for(Book book:list)
		{
			System.out.println(book.getId()+","+book.getBookname()+","+book.getPrice());
		}
		
		

	}

}
