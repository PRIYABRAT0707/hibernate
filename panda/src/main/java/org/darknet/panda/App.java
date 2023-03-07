package org.darknet.panda;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       // System.out.println( "Hello World!" );
        
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Address st=new Address();
        st.setCity("bbsr");
        st.setIsopen(false);
        st.setStreet("mroad");
        
//        String pattern = "MM-dd-yyyy";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        String date = simpleDateFormat.format(new Date());
//        
        st.setAdddate(new Date());
        st.setCod(10.66);
        
        FileInputStream fis=new  FileInputStream("src/main/java/1265780.jpg");
        byte [] data=fis.readAllBytes();
        st.setImage(data);
//        student st=new student();
//        st.setId("101");
//        st.setCity("bdk");
//        st.setName("panda");
       // System.out.println(sf);
        Session ses=sf.openSession();
        Transaction tx=ses.beginTransaction();
        ses.save(st);
        tx.commit();
        ses.close();   
    }
}
