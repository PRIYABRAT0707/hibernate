package org.darknet.hql;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PaginationImplementaion {
	
	public static void main(String [] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		Query q=ses.createQuery("from item ");
		q.setFirstResult(0);
		q.setMaxResults(6);
		
		List<item> item1=q.getResultList();
		
		Iterator it=item1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		for (item i:item1) {
			System.out.println(i.getBattery());
		}
		
		
		
		
		
		
		ses.close();
		sf.close();
	}

}
