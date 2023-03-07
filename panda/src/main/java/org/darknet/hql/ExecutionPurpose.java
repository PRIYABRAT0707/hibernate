package org.darknet.hql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

public class ExecutionPurpose {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		item item = new item();
		item item1 = new item();
		item.setAndroidVersion(14);
		item.setBattery(7000);
		item.setCameraspecs(28);
		item.setDisplaysize(6.66);
		item.setHavingSecondaryMicrophone(true);
		item.setHavingStreoSpeaker(false);
		item.setImei("898980808989766545466");
		item.setPrice(20000.10);
		item.setProcessor("snapdragon 5674");
		item1.setAndroidVersion(12);
		item1.setBattery(1000);
		item1.setCameraspecs(900);
		item1.setDisplaysize(6.0);
		item1.setHavingSecondaryMicrophone(false);
		item1.setHavingStreoSpeaker(false);
		item1.setImei("890898989766545888");
		item1.setPrice(17000.10);
		item1.setProcessor("mediatex dimensity 9060");
		ModelDetail md=new ModelDetail();
		md.setModelname("redmi note 27");
		md.setQuantity(10007);
		md.setItem(item);
		
		ModelDetail md1=new ModelDetail();
		md1.setModelname("redmi note 26");
		md1.setQuantity(10000);
		md1.setItem(item1);
		
		
		
		 PhoneBrand pv=new  PhoneBrand();
		 pv.setMarketposition(7);
		 pv.setOriginPlace("china");
		 pv.setPhoneBrand("oppo");
		 md.setPb(pv);
		 md1.setPb(pv);
		 
		 List<ModelDetail> li=new ArrayList<ModelDetail>();
			li.add(md);
			li.add(md1);
		
		 pv.setLis(li);
		 Session ses=sf.openSession();
		 Transaction tx=ses.beginTransaction();
//		ses.save(item);
//		 ses.save(item1);
//		 ses.save(md);
//	  ses.save(md1);
		 ses.save(pv);
		 tx.commit();
		 
	//	ModelDetail md3=ses.get(ModelDetail.class, 19);
		//System.out.println(md3.getModelname());
		 
		 
		 ses.close();
		 sf.close();
		 
		 

	}

}
