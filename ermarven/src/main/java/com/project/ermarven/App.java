package com.project.ermarven;


import java.util.List;

//import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import been.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
        org.hibernate.cfg.AnnotationConfiguration cfg=new AnnotationConfiguration();
        cfg.configure("Resource/hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction trn=session.beginTransaction();
        
        
        
//        Product pro1=new Product(01,"Biscuts",25);
//        Product pro2=new Product(02,"Cake",50);
//        
//        session.save(pro1);
//        session.save(pro2);
//        
//        System.out.print("Done!");
//        
//        Query qurey =session.createQuery("from Product");
//        List list=qurey.list();
//        list.stream().forEach(temp -> System.out.print(temp));
        
        
//        Query qurey1=session.createQuery("delete from Product p where p.P_Name=:ref");
//        qurey1.setParameter("ref", "Biscuts");
//        int i=qurey1.executeUpdate();
        
        
//        Query query2=session.createQuery("update Product p set p.P_Name=:ref1 where p.P_Id=:ref2");
//        query2.setParameter("ref1", "Cookies");
//        query2.setParameter("ref2", 1);
//        
//        int count =query2.executeUpdate();
//        System.out.print(count);
//        
//        
//        
        
        
        
        
        
        
        Query query1=session.createQuery("select emp from Employee emp");
        List <Employee> list1=query1.list();
        
        list1.stream().forEach(temp ->
        {System.out.println(temp.getEmpDetails().getAddress()
        	+" ,"+temp.getEmpDetails().getBankaccount()
        	+" ,"+temp.getEmpDetails().getGender()
        	+", "+temp.getEmpDetails().getEdid()
        	+" ,"+temp.getEmpDetails().getEmpid()
        	+", "+temp.getEmpDetails().getYearsofservice());
        });
        System.out.println("------------------------------------");
        Query qurey2=session.createQuery("select emp from Employee emp");
        List <Employee>getdetails=qurey2.list();
        getdetails.stream().forEach(temp1 ->
        {
        	System.out.println(temp1.getEmpAssignmentlist().size()
        			+", "+temp1.stream().getProjects().getOwner()
        			+", "+temp1.getProjects().getPrid());
        });
        
        
        
        
        trn.commit();
        
        
        
       
    }
}
