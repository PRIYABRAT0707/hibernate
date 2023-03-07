package org.darknet.hibernateinheritancemapping;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class execution_class {
	
	public static void main(String [] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory fac=cfg.buildSessionFactory();
		
//		employee emp=new employee();
//		emp.setEid(10);
//	    emp.setName("priyabrt panda");
//	    regular_employee re=new regular_employee();
//	    re.setName("chris hemsworth");
//	    re.setBonus(100.990);
//	    re.setSalary(600.09);
//		
//		contract_employee ce=new contract_employee();
//		
//		ce.setName("shyam panda");
//		ce.setPay_per_hour(1500.98);
//		ce.setDuration_of_work(12.66);
//		Session ses=fac.openSession();
//		Transaction tx=ses.beginTransaction();
//		ses.save(emp);
//		ses.save(re);
//		ses.save(ce);
		
		Session ses=fac.openSession();
	
		String query="from contract_employee";
		Query q=ses.createQuery(query);
		List<contract_employee> ce=q.getResultList();
		Iterator<contract_employee>it= ce.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
