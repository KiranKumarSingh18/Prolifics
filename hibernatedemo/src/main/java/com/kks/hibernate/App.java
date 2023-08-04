package com.kks.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.kks.hibernate.dao.EmployeeDAO;
import com.kks.hibernate.entity.Address;
import com.kks.hibernate.entity.Employee;
import com.kks.hibernate.entity.Person;
import com.kks.hibernate.util.HibernateUtli;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = HibernateUtli.buildSessionFactory();
    	Session session = factory.openSession();
    	Person p = session.get(Person.class,787);
    	if(p!=null)
    	{
    		System.out.println(p.getSsn()+"    "+p.getPersonName()+"    "+p.getPersonAge()+"    "+p.getGender());
    		System.out.println(p.getAddress().getHouseNo()+"    "+p.getAddress().getStateName());
    		System.out.println(p.getAddress().getCityName()+"    "+p.getAddress().getStateName());
    	}
    	
    	Address a = session.get(Address.class,7001);
    	if(a!=null)
    	{
    		
    		System.out.println(a.getHouseNo()+"    "+a.getStateName());
    		System.out.println(a.getCityName()+"    "+a.getStateName());
    		System.out.println(a.getPerson().getSsn()+"    "+a.getPerson().getPersonName()+"    "+a.getPerson().getPersonAge()+"    "+a.getPerson().getGender());
    	}
    	
    	session.close();
    	HibernateUtli.shutdown();
    }
}
//SessionFactory factory = HibernateUtli.buildSessionFactory();
////Session session = factory.openSession();
//EmployeeDAO edao = new EmployeeDAO(factory);
//edao.insertEmployee(new Employee(104,"Dinesh KArthik",4000,40));
//Employee e = edao.getEmployee(101);
//if(e!=null)
//System.out.println(e.getEmployeeName()+ "    " + e.getSalary() + "    " + e.getDepartmentNo());
//
//
////        edao.modifyEmployee(new Employee(103,"Ram Charan",3300,33));
////edao.modifyEmployee(new Employee(10,"",0,0));
////
//
//
//// Insertion
///*
//Employee e1 = new Employee(102, "Babu Raja", 2000, 20);
//Employee e2 = new Employee(103, "Charan", 3000, 30);
//Transaction trans = session.beginTransaction();
//session.save(e1);
//session.save(e2);
//trans.commit();
//*/
//
//
//// show / select
///*
//Employee e = session.get(Employee.class,102);
//if(e!= null)
//System.out.println(e.getEmployeeName()+"    "+e.getSalary()+"    "+e.getDepartmentNo());
//else
//System.out.println("Employee with id 102 is not found");
//*/
//
//
//// Upadate using session
///*
//Transaction trans = session.beginTransaction();
//Employee e = session.get(Employee.class,102);
//if(e!=null)
//e.setEmployeeName("Raja Babu");
//System.out.println(session.isDirty());
//trans.commit();
//System.out.println(session.isDirty());
//*/
//
//// Update using update session
///*
//Transaction trans = session.beginTransaction();
//Employee e = new Employee(102,"New Babu",2200,20);
//session.update(e);
//trans.commit();
//*/
//
//
//// saveOrUpadte
///*
//Transaction trans = session.beginTransaction();
//Employee e = new Employee(102,"Babu Raja",2200,20);
//session.saveOrUpdate(e);
//trans.commit();
//*/
//
//// Delete
///*
//Transaction trans = session.beginTransaction();
//Employee e = session.get(Employee.class,102);
//if(e!=null)
//session.delete(e);
//else
//System.out.println("Employee with id 102 Does not exist");
//trans.commit();
//*/
//
//
////Employee e1 = session.get(Employee.class, 101);
////Employee e2 = session.get(Employee.class, 101);
//
////session.close();
//HibernateUtli.shutdown();