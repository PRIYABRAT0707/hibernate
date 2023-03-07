package org.darknet.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCachePractice {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session se=sf.openSession();
		item it=se.get(item.class, 1);
		System.out.println(it);
				
		se.close();
		Session se1=sf.openSession();
		item it1=se1.get(item.class, 1);
		System.out.println(it1);
 se1.close();
	}

}
