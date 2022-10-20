//WAP using interface to create a process where you have to do the following process:
1:Display the Basic info of an employee (name,phno,email,address,DOB)
2:Display the Details of emp_info (Emp_id,dep,des,location,salary)
Interface 1 method ()
2 class same interface
1 st class(Basic info)
2 nd class(EMP Info)
*/


package abstraction;

public interface Details {

	public void details();
}

package abstraction;

import java.util.Scanner;

public class Basic_info implements Details {

	@Override
	public void details() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, email, address;
		int phn_no, dob;
		System.out.println("Basic Emplyee Information\n");
		System.out.println("1.Employee Name: ");
		name = sc.next();
		System.out.println("2.Phone number: ");
		phn_no = sc.nextInt();
		System.out.println("3.Email: ");
		email = sc.next();
		System.out.println("4.Address");
		address = sc.next();
		System.out.println("5.Date of Birth: ");
		dob = sc.nextInt();
		System.out.println("*Employee Basic Information* \n");
		System.out.println("Name: " + name + "\nPhone number: " + phn_no + "\nEmail: " + email + "\nAddress: " + address
				+ "\nDate of Birth: " + dob + "\n");
	}

}

package abstraction;

import java.util.Scanner;

public class Emp_info implements Details {

	@Override
	public void details() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String dep, loc, des;
		int emp_id, sal;
		System.out.println("Organizational Information\n");
		System.out.println("1.Employee ID: ");
		emp_id = sc.nextInt();
		System.out.println("2.Department: ");
		dep = sc.next();
		System.out.println("3.Designation: ");
		des = sc.next();
		System.out.println("4.Location: ");
		loc = sc.next();
		System.out.println("5.Salary: ");
		sal = sc.nextInt();
		System.out.println(" Employee Organizational Information: \n");
		System.out.println("Employee ID: " + emp_id + "\nDepartment: " + dep + "\nDesignation: " + des + "\nLocation: "
				+ sal + "\nSalaary: " + sal + "\n");

	}

}

package abstraction;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp_info obj1 = new Emp_info();
		Basic_info obj2 = new Basic_info();
		obj2.details();
		obj1.details();
	}

}