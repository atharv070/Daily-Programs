//*WAP to to do the following process by using abstract class:
1 abstract class:(Gross, total ,Net)
Diff class : which will display the Employee detilas and Final Salary in hand amount .*/


package abstraction;

import java.util.Scanner;

public abstract class Salary {

	public static void cal() {
		Scanner sc = new Scanner(System.in);
		int gross, total, net;
		System.out.println("*Salary Information*\n");
		System.out.println("Enter your gross salary: ");
		gross = sc.nextInt();
		System.out.println("Enter your total deduction: ");
		total = sc.nextInt();
		net = gross - total;
		System.out.println("Net Salary: " + net);

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

public class Employee extends Salary{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp_info obj1 = new Emp_info();
		obj1.details();
		cal();
	}

}