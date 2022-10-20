//WAP to calculate the rate of interest of different bank by using Multiple inheritance.

package Multi;

public interface AXIS {
	double axis = 5.4;

	public void axis();
}
package Multi;

public interface SBI {
	double sbi = 3.5;

	public void sbi();
}
package Multi;

public interface Union {
	double union = 5.5;

	public void union();

}
package Multi;

import java.util.Scanner;

public class Bank implements AXIS, Sbi, Union {
	Scanner sc = new Scanner(System.in);
	int pri = sc.nextInt();
	int time = sc.nextInt();

	public static void main(String[] args) {

		System.out.println("Enter the Amount and Year:");
		Bank obj=new Bank();
		obj.union();
		obj.axis();
		obj.sbi();  
	}

	@Override
	public void union() {
		// TODO Auto-generated method stub
		double u = pri * time * union / 100;
		System.out.println("The Interest of Union bank for the Principle Amount "+pri+" \nRs for time duration of "+time+" years with the \nrate of interest of "+union+"% is "+u+"Rs\n\n");
	}

	@Override
	public void sbi() {
		// TODO Auto-generated method stub
		double a = pri * time * sbi / 100;
		System.out.println("The Interest of Sbi bank for the Principle Amount "+pri+" \nRs for time duration of "+time+" years with the \nrate of interest of "+sbi+"% is "+a+"Rs\n\n");
	}

	@Override
	public void axis() {
		// TODO Auto-generated method stub
		double s = pri * time * axis / 100;
		System.out.println("The Interest of Axis bank for the Principle Amount "+pri+" \nRs for time duration of "+time+" years with the \nrate of interest of "+axis+"% is "+s+"Rs");
	}

}