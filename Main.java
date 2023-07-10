import com.kiran.model.Address;
import com.kiran.model.Department;
import com.kiran.model.Employee;

public class Main {

	public static void main(String[] args) {
		
//		Employee e  = new Employee(7001,"kiran",7560, new Address("1-2-3","Mg street","bangalore","karnataka"));
//		System.out.println("Emplyee id   :"+e.getEmployeeId());
//		System.out.println("Employee Name  :"+e.getEmployeeName());
//		System.out.println("Salary     :" + e.getSalary());
//		System.out.println("--------------Address-------------");
//		System.out.println("Hno     :" + e.getAddress().getHno());
//		System.out.println("Street  :" + e.getAddress().getStreet());
//		System.out.println("City    :" + e.getAddress().getCity());
//		System.out.println("State   :" + e.getAddress().getState());
		
		
		
		Employee[] elist = new Employee[3];
		elist[0] = new Employee(102,"Babu",2000,new Address("7-8-6","MG Street", "Bangalore","Karnataka"));
		elist[1] = new Employee(103,"Charan",3000,new Address("1-2-3","Anna Street","Chennai","TamilNadu"));
		elist[2] = new Employee(101,"Ajay",1000,new Address("3-2-1","Bank Street","Hyedrbad","Telangana"));

		
		Department d = new Department(10,"Sales","Mumai",elist);
		
		System.out.println("------------------Department Details------------------");
		
		System.out.println("Department Number      :" + d.getDepartmentNo());
		System.out.println("Department Name        :" + d.getName());
		System.out.println("Department Location    :" + d.getLocation());
		System.out.println();
		
		for(Employee e: elist) {
			System.out.println("Emplyee id     :"+e.getEmployeeId());
			System.out.println("Employee Name  :"+e.getEmployeeName());
			System.out.println("Salary         :" + e.getSalary());
			System.out.println();
			System.out.println("--------------Address-------------");
			System.out.println("Hno     :" + e.getAddress().getHno());
			System.out.println("Street  :" + e.getAddress().getStreet());
			System.out.println("City    :" + e.getAddress().getCity());
			System.out.println("State   :" + e.getAddress().getState());
		}
	}

}
