package com.google;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Select {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from People");
		List<People> list = query.list();
		session.getTransaction().commit();
		session.close();
		for(People e:list) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getMobilenumber());
			System.out.println(e.getSalary());
			
			
		}

	}

}
