package com.google;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
       People e=new People();
       e.setName("shweta");
       e.setCity("pune");
       e.setMobilenumber(23446);
       e.setSalary(12000);
       
       People e2=new People();
       e2.setName("shweta");
       e2.setCity("pune");
       e2.setMobilenumber(23446);
       e2.setSalary(12000);
       
       People e1=new People();
       e1.setName("shweta");
       e1.setCity("pune");
       e1.setMobilenumber(23446);
       e1.setSalary(12000);
       session.save(e);
       session.save(e1);
       session.save(e2);
       transaction.commit();
       session.close();

	}

}
