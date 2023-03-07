package org.darknet.rhenyra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Practicing {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		// creating question

		Question q = new Question();
		
		q.setQid(1);
		q.setQuest("do you know her");
		Answer a = new Answer();
		a.setAid(10);
		a.setAns("yes");
		q.setAnswer(a);
		Question q1 = new Question();
		
		q1.setQid(2);
		q1.setQuest("do you know differential equation");
		Answer a1 = new Answer();
		a1.setAid(11);
		a1.setAns("no");
		q1.setAnswer(a1);

		Session ses = sf.openSession();
		Transaction tc = ses.beginTransaction();
		ses.save(q);
		ses.save(a);
		ses.save(q1);
		ses.save(a1);
		tc.commit();

		ses.close();
		sf.close();

	}

}
