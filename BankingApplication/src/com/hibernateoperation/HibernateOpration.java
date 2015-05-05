package com.hibernateoperation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HibernateOpration {
  private static SessionFactory session;
  
  public static SessionFactory getSessionFactoryObject(){
	 try{
	  Configuration cfg=new Configuration();
	  cfg.configure("hibernate.cfg.xml");
	  session=cfg.buildSessionFactory();
	 
	 }
	 catch (Exception e) {
		 e.printStackTrace();
		// TODO: handle exception
	}
	 finally{
		 return session;
	 }
  }
}
