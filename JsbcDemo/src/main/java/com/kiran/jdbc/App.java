package com.kiran.jdbc;

import java.util.Scanner;

import com.kiran.jdbc.model.service.BookService;


public class App 
{
    public static void main( String[] args ) 
    {
    	BookService bookService = new BookService();
    	Scanner sc = new Scanner(System.in);
    	int opt = 0;
    	do
    	{
    		System.out.println("1. Add Book");
    		System.out.println("2. Show All Books");
    		System.out.println("3. Show Books By Category");
    		System.out.println("4. Show Book By Title");
    		System.out.println("5. Delete Book By Title");
    		System.out.println("6. E X I T");
    		System.out.println("Enter Your option :-  ");
    		opt = sc.nextInt();
    		
    		switch(opt)
    		{
    			case 1:
    				bookService.addBook();
    				break;
    			case 2:
    				bookService.showAllBooks();
    				break;
    			case 3:
    				bookService.showBookByCategory();
    				break;
    			case 4:
    				bookService.showBookByTitle();
    				break;
    			case 5:
    				bookService.deleteBookByTitle();
    				break;
    			case 6:
    				System.out.println("You are Quitting Menu");
    				break;
    			default:
    				System.out.println("Not a valid option");
    				
    				
    		}
    	}while(opt!=6);
    }
}
























//
//Connection con = null;
//PreparedStatement pst = null;
//ResultSet rs = null;
//String url="jdbc:mysql://localhost:3306/prolifics";
//try {
//	con = DriverManager.getConnection(url, "root", "Kiran@1234");
//	pst = con.prepareStatement("select deptno,deptname,location from department",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//	rs = pst.executeQuery();
////	
////	rs.absolute(5);
////	rs.deleteRow();
//
////	while(rs.next()) 
////		System.out.println(rs.getString(1) +"   "+rs.getString(2)+"   "+rs.getString(3));
////	
////	System.out.println("-----------------------------------");
////	while(rs.previous())
////		System.out.println(rs.getString(1) +"   "+rs.getString(2)+"   "+rs.getString(3));
//	
//}
//catch(SQLException ex) {
//	ex.printStackTrace();
//}
//finally 
//{
//	try 
//	{
//		if(rs!=null) rs.close();
//		if(pst != null) pst.close();
//		if(con != null) con.close();
//	}
//	catch(SQLException ex) 
//	{
//		ex.printStackTrace();
//	}
//}



















































//rs.moveToInsertRow();
//rs.updateInt(1, 70);
//rs.updateString(2, "Finance");
//rs.updateString(3, "Vizag");
//rs.insertRow();
////if(rs.rowInserted())
//System.out.println("added");












//ResultSet rs = null;
//ResultSetMetaData rsmd = null;
//rs = pst.executeQuery();
//rsmd = rs.getMetaData();

//    		int count = rsmd.getColumnCount();
//    		for(int i =1;i<=count;i++)
//    			System.out.print(rsmd.getColumnName(i)+"    ");
//    		System.out.println();
//    		
//    		while(rs.next()) {
//    			for(int i =1;i<=count;i++)
//    				System.out.print(rs.getString(i)+"      ");
//    			System.out.println();
//    		}





//        Class.forName("com.mysql.cj.jdbc.Driver");
//    		pst.setInt(1, 102);
//    		pst = con.prepareStatement("select * from employee");
/*if(rs.next())
    			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
    		
    		pst.setInt(1, 105);
    		rs = pst.executeQuery();
    		if(rs.next())
    			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
 */



//    	String url="jdbc:mysql://localhost:3306/prolifics";
//    	try(Connection con = DriverManager.getConnection(url, "root", "Kiran@1234");
//    		PreparedStatement pst = con.prepareStatement("select * from employee");
//    		ResultSet rs = pst.executeQuery())
//    	{
//    		while(rs.next())
//    			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
//    	}
//    	catch(SQLException ex) {
//    		ex.printStackTrace();
//    	}





//con.setAutoCommit(false);
//pst = con.prepareStatement("delete from employee");
//
//int count = pst.executeUpdate();
//System.out.println(count + " Rows Deleted");
//con.commit();
//
//pst2 = con.prepareStatement("insert into employee values(?,?,?,?)");
//
//
//pst2.setInt(1, 107);
//pst2.setString(2, "Phani");
//pst2.setDouble(3,7000.45);
//pst2.setInt(4, 70);
//count = pst2.executeUpdate();
//System.out.println(count + " Rows Inserted");
//con.rollback();
