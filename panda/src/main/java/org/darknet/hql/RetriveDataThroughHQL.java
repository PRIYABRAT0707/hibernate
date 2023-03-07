package org.darknet.hql;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetriveDataThroughHQL {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		//String qu="from ModelDetail where modelid=3";
		String qu="from ModelDetail where modelid=:x";
		
		//String qu="from ModelDetail as s where s.modelid=:x and s.modelname=:y";
		
		Query qw=ses.createQuery(qu);
		qw.setParameter("x", 3);
		List<ModelDetail> li=qw.getResultList();
		for(ModelDetail m:li) {
			System.out.println(m.getQuantity());
			System.out.println(m.getModelname());
			
		}
		System.out.println("           _______________________________   "
				+ ""
				+ ""
				+ ""
				+ "---------------------------------          ");
		
//		Query w=ses.createQuery("delete item as m where m.battery=:x ");
//		w.setParameter("x", 4500);
//		int stat=w.executeUpdate();
//		System.out.println(stat +"data deleted");
//		tx.commit();
//		
//		Query w=ses.createQuery("update  item  set cameraspecs=:c where battery=:x ");
//		w.setParameter("c", 100);
//		w.setParameter("x", 5000);
//		int bstat=w.executeUpdate();
//		System.out.println(bstat +"data updated");
//		
//		tx.commit();
		
		Query po=ses.createQuery("select m.modelname,i.price,i.imei from ModelDetail  as m  INNER JOIN m.item as i ");
		List<Object []> lim=po.getResultList();
		for(Object [] arr:lim) {
			System.out.println(Arrays.toString(arr));
		}
		

	}

}
