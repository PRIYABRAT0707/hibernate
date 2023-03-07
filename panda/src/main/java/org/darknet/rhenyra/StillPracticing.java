package org.darknet.rhenyra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StillPracticing {
	
	public static void main(String []args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		List<String> ll=new ArrayList<String>();
		ll.addAll(Arrays.asList("ppanda","tormed","you know me"));
		po kk=new po(10,ll,"loki");
		Session ses=sf.openSession(); 
		Transaction tx=ses.beginTransaction();
		ses.save(kk);
		tx.commit();
		
		/*
		 * QuestionPrac qp=new QuestionPrac(); qp.setQid(1);
		 * qp.setQuest("do you know her");
		 * 
		 * Answer a = new Answer(); a.setAid(10); a.setAns("yes");
		 * a.setQuestionPrac(qp); Answer a1 = new Answer(); a1.setAid(11);
		 * a1.setAns("i don't know her"); a1.setQuestionPrac(qp); Answer a3 = new
		 * Answer(); a3.setAid(12); a3.setAns("ask someone else");
		 * a3.setQuestionPrac(qp); List<Answer> li=new ArrayList<Answer>(); li.add(a);
		 * li.add(a1); li.add(a3); qp.setAns(li);
		 * 
		 * Session ses=sf.openSession(); Transaction tx=ses.beginTransaction();
		 * ses.save(qp); ses.save(a); ses.save(a1); ses.save(a3); tx.commit();
		 * 
		 * 
		 * QuestionPrac qp1=ses.get(QuestionPrac.class, 1);
		 * System.out.println(qp1.getQuest()); List<Answer>ll=new ArrayList<Answer>();
		 * ll=qp1.getAns(); for(Answer s:ll) { System.out.println(s.getAns()); }
		 */
		
		
	}

}
