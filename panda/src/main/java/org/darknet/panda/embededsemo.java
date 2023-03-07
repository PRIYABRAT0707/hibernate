package org.darknet.panda;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class embededsemo {
	
	public static void main(String [] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		certificate cert=new certificate();
		cert.setCourse("java");
		cert.setDuration("6 months");
		student stu=new student();
		stu.setId("10");
		stu.setName("ramsetu");
		stu.setCity("virginia");
		stu.setCert(cert);
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(stu);
		tx.commit();
		
		
		ses.close();
		sf.close();
	}

}
