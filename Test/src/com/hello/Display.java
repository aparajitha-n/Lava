package com.hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Display
{
	public static void main(String a[])
	{
		try
		{
		Configuration cfg=new Configuration();
		cfg.configure("/Hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
//        Object o=session.load(Data.class,5);
//        Data s=(Data)o;
//        String s1=s.getSname();
//        System.out.println(s1);
//        String i=s.getAddress();
//        System.out.println(i);
        
        Data s=new Data();
        s.setSid(111);
        s.setSname("hai");
        s.setAddress("hello");
        
        session.save(s);
        tx.commit();

        session.close();
        factory.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}