package com;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	private static SessionFactory sessf;
  public static void main (String []args){
	  try{
	  sessf=new Configuration().configure().buildSessionFactory();
	  }
	  catch(Exception ex){
		  System.out.println("Exception :"+ex.getMessage());
	  }
	  MainClass mc=new MainClass();
	  TreeSet <Certificate> set1=new TreeSet <Certificate>();
	  set1.add(new Certificate("MCA"));
      set1.add(new Certificate("MBA"));
      set1.add(new Certificate("PMP"));
      TreeSet <Certificate>set2 = new  TreeSet <Certificate>();
      set2.add(new Certificate("BCA"));
      set2.add(new Certificate("BA"));
      Integer empID1 = mc.addEmployee("Manoj", "Kumar", 4000, set2);
      Integer empID2 = mc.addEmployee("Dilip", "Kumar", 3000, set1);
      System.out.println("Information Added Successfully :");
  }
 public  Integer addEmployee(String fname, String lname, 
         int salary, Set cert){
	    Session session = sessf.openSession();
	     Transaction tx = null;
	      Integer employeeID = null;
	      try{
	    	  tx=session.beginTransaction();
	    	  Employee employee = new Employee(fname, lname, salary);
	    	  employee.setCertificates(cert);
	    	  employeeID = (Integer) session.save(employee); 
	          tx.commit();
	      }
	      catch(Exception ex){
	    	  if (tx!=null) tx.rollback();
	    	  System.out.println("Exception :"+ex.getMessage());
	      }
	 return 0;
 }
}
