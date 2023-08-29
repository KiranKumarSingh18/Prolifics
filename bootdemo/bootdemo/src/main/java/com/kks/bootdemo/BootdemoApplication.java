package com.kks.bootdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kks.bootdemo.beans.Citizen;
import com.kks.bootdemo.beans.Person;
import com.kks.bootdemo.entity.Book;
import com.kks.bootdemo.entity.Department;
import com.kks.bootdemo.entity.Employee;
import com.kks.bootdemo.repository.BookRepository;
import com.kks.bootdemo.repository.DepartmentRepository;
import com.kks.bootdemo.service.DepartmentService;

@SpringBootApplication
public class BootdemoApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(BootdemoApplication.class, args);
		DepartmentService ds = container.getBean(DepartmentService.class);
		Department d1 = ds.getDepartmentByDepartmentId(20);
		System.out.println(d1.getDepartmentNo()+"    "+d1.getDepartmentName()+"    "+d1.getLocation());
		for(Employee e :d1.getEmployees())
			System.out.println(e.getEmployeeId()+"    "+e.getEmployeeName()+"    "+e.getSalary());

			
		
	}

}

/*
DepartmentRepository dr = container.getBean(DepartmentRepository.class);
Optional<Department> d = dr.findById(20);
if(d.isPresent())
{
	Department d1 = d.get();
	System.out.println(d1.getDepartmentNo()+"    "+d1.getDepartmentName()+"    "+d1.getLocation());
	for(Employee e :d1.getEmployees())
		System.out.println(e.getEmployeeId()+"    "+e.getEmployeeName()+"    "+e.getSalary());
}
*/


//BookRepository bookRepository = container.getBean(BookRepository.class);

/* 
 Optional<Book> b = bookRepository.findByBookPrice(650);
		if(b.isPresent()) {
			Book b1 = b.get();
			System.out.println(b1.getBookId()+"    "+b1.getBookTitle()+"    "+b1.getBookAuthor()+"    "+b1.getBookCategory()+"    "+b1.getBookPrice()+"    "+b1.getAvailableCopies());
		}
		
		Optional<Book> b11 = bookRepository.findByBookAuthor("James");
		if(b11.isPresent()) {
			Book b1 = b11.get();
			System.out.println(b1.getBookId()+"    "+b1.getBookTitle()+"    "+b1.getBookAuthor()+"    "+b1.getBookCategory()+"    "+b1.getBookPrice()+"    "+b1.getAvailableCopies());
		}*/

/*
 // Custom Select Query
		List<Book> blist = bookRepository.findByBookCategory("CPP");
		for(Book b : blist)
		{
			System.out.println(b.getBookId()+"    "+b.getBookTitle()+"    "+b.getBookAuthor()+"    "+b.getBookCategory()+"    "+b.getBookPrice()+"    "+b.getAvailableCopies());
		}
*/

/*
 Optional<Book> b = bookRepository.findById("TCP");
		if(b.isPresent())
		{
			Book b1 = b.get();
			System.out.println(b1.getBookId()+"    "+b1.getBookTitle()+"    "+b1.getBookAuthor()+"    "+b1.getBookCategory()+"    "+b1.getBookPrice()+"    "+b1.getAvailableCopies());
		}
		else
			System.out.println("Book with id TCP does not exist");
*/





/*
bookRepository.deleteById("HCPP");
Book b = new Book("HCPP","How To CPP","Dietle","CPP",700,10);
bookRepository.save(b);
*/



/*
 List<Book> books = bookRepository.findAll();
		
		for(Book b : books)
			System.out.println(b.getBookId()+"    "+b.getBookTitle()+"    "+b.getBookAuthor()+"    "+b.getBookCategory()+"    "+b.getBookPrice()+"    "+b.getAvailableCopies());
*/

/*
 Person p = container.getBean(Person.class);
		System.out.println(p.getSsn()+"    "+p.getName()+"    " +p.getAge());
		System.out.println(p.getAddress().getHno()+"    "+p.getAddress().getStreet()+"    "+p.getAddress().getCity()+"    "+p.getAddress().getState());
		System.out.println();
		
		Citizen c = container.getBean(Citizen.class);
		System.out.println(c.getAadhar().getAadharId()+"    "+c.getAadhar().getName()+"    "+c.getAadhar().getGender()+"    "+c.getAadhar().getDob());
		System.out.println(c.getAge()+"   "+c.getMobile());
		
 */