package org.darknet.many_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Execution {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		employee e1 = new employee();
		employee e2 = new employee();
		employee e3 = new employee();

		e1.setEid(10);
		e1.setName("priya");
		e2.setEid(11);
		e2.setName("panda");
		e3.setEid(12);
		e3.setName("indrajeet");

		project p1 = new project();
		p1.setPid(100);
		p1.setProjectname("java");
		project p2 = new project();
		p2.setPid(101);
		p2.setProjectname("python");
		project p3 = new project();
		p3.setPid(102);
		p3.setProjectname("dotnet");

		List<project> li = new ArrayList<project>();
		li.add(p1);
		li.add(p2);
		li.add(p3);
		List<employee> lit = new ArrayList<employee>();
		lit.add(e1);
		lit.add(e2);
		lit.add(e3);

		e1.setLl(li);
		p1.setLiw(lit);
		e2.setLl(li);
		p2.setLiw(lit);
		e3.setLl(li);
		p3.setLiw(lit);

		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();

		ses.save(e1);
		ses.save(p1);
		ses.save(e2);
		ses.save(p2);
		ses.save(e3);
		ses.save(p3);
		tx.commit();
		employee emp=(employee) ses.get(employee.class, 10);
		List<project> lii=emp.getLl();
		for(project p:lii) {
		System.out.println(p.getProjectname()+" "+p.getPid());
		}
	

	}

}
