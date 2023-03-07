package org.darknet.panda;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingDataViaHibernateFromDatabase {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		Address add=ses.load(Address.class, 1);
		System.out.println(add);
		byte [] bro=add.getImage();
		try {
			FileOutputStream fo=new FileOutputStream("C:\\ppandaproj\\ppanda1.jpg");
			fo.write(bro);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	
		ses.close();
		sf.close();
		
		

	}

}
