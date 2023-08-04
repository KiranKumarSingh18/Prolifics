package com.kiran.jdbc.model.service;

import java.util.Scanner;

import com.kiran.jdbc.model.bean.Book;
import com.kiran.jdbc.model.dao.BookDAO;

public class BookService

{

    private static Scanner sc = new Scanner(System.in);

    private BookDAO bdao = new BookDAO();

    public String addBook()

    {

        System.out.println("enter book id");

        String bookId = sc.nextLine();

        System.out.println("enter book title");

        String bookTitle = sc.nextLine();

        System.out.println("enter book Author");

        String bookAuthor = sc.nextLine();

        System.out.println("enter book Category");

        String bookCategpry = sc.nextLine();

        System.out.println("enter book price");

        double bookPrice = sc.nextDouble();

        System.out.println("enter book copies");

        int copies = sc.nextInt();

        sc.nextLine();

        if(bdao.insertBook(new Book(bookId,bookTitle,bookAuthor,bookCategpry,bookPrice,copies)))

            return "Book details added";

        return "book addition failed";

    }

    public void showAllBooks()

    {

        for(Book b : bdao.getAllBooks())

            System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookCategory()+" "+b.getBookPrice()+" "+b.getCopies());

            

    }

    public void showBookByCategory()

    {

        System.out.println("enter book Category");

        String bookCategpry = sc.nextLine();

        for(Book b : bdao.getBookByCategory(bookCategpry))

                System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookCategory()+" "+b.getBookPrice()+" "+b.getCopies());

                

    }

    public void showBookByTitle()

    {

        System.out.println("enter title");

        String bookTitle = sc.nextLine();

        Book b = bdao.getBookByTitle(bookTitle);

        if(b!=null)

            System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookCategory()+" "+b.getBookPrice()+" "+b.getCopies());

        else

            System.out.println("book doesnt exist"+bookTitle);

    }

    public void deleteBookByTitle()

    {

        System.out.println("enter book title");

        String bookTitle = sc.nextLine();

        

        if(bdao.deleteBookByTitle(bookTitle))

            System.out.println(bookTitle+"deleted");

        else

            System.out.println("book doesnt exist by title"+bookTitle);

    }

    

 

}


//public class BookService {
//	private static Scanner sc = new Scanner(System.in);
//	private BookDAO bdao = new BookDAO();
//	public String addBook()
//	{
//		System.out.println("Enter Book Id ");
//		String bookId = sc.nextLine();
//		System.out.println("Enter Book Title ");
//		String bookTitle = sc.nextLine();
//		System.out.println("Enter Book Author");
//		String bookAuthor = sc.nextLine();
//		System.out.println("Enter Book Category ");
//		String bookCategory = sc.nextLine();
//		System.out.println("Enter Book Price ");
//		double bookPrice = sc.nextDouble();
//		System.out.println("Enter Book Copies");
//		int copies = sc.nextInt();
//		sc.nextLine();
//		if(bdao.insertBook(new Book(bookId, bookTitle, bookAuthor, bookCategory, bookPrice, copies)))
//			return "Book Details Added";
//		return "Book Addition Failed";
//		
//		
//	}
//	
//	public void showAllBooks()
//	{
//		for(Book b : bdao.getAllBooks())
//			System.out.println(b.getBookId() + "   " + b.getBookTitle() + "    " + b.getBookAuthor() +"   "+ b.getBookCategory() + "    "+b.getBookPrice() +"   "+b.getCopies());
//	}
//	
//	public void showBookByCategory()
//	{
//		System.out.println("enter book Category");
//		String bookCategpry = sc.nextLine();
//		for(Book b : bdao.getBookByCategory(bookCategpry))
//			System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookCategory()+" "+b.getBookPrice()+" "+b.getCopies());
//	}
//	
//	public void showBookByTitle()
//	{
//		System.out.println("Enter Book Title ");
//		String bookTitle = sc.nextLine();
//		Book b = bdao.getBookByTitle(bookTitle);
//		if(b!=null)
//			System.out.println(b.getBookId() + "   " + b.getBookTitle() + "    " + b.getBookAuthor() +"   "+ b.getBookCategory() + "    "+b.getBookPrice() +"   "+b.getCopies());
//		else
//			System.out.println("Book Does not exist by title "+ bookTitle);
//	}
//	
//	public void deleteBookByTitle()
//	{
//		System.out.println("Enter Book Title ");
//		String bookTitle = sc.nextLine();
//		
//		if(bdao.deleteBookByTitle(bookTitle))
//			System.out.println(bookTitle + " Deleted Successfully");
//		else
//			System.out.println("Book Does not exist by title "+ bookTitle);
//	}
//}
