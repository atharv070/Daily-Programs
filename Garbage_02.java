//*WAP to to accept the number from user for Boxing and find the number is postive or negative
 and for accept a number for unboxing and find the number is divisible by 3 or not. 
 */


import java.util.Scanner;

public class Abc {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box_demo();
		Unbox();
	}

	public static void Box_demo() {

		System.out.println("Enter the number:");

		Integer num1 = sc.nextInt();
		if (num1 > 0) {
			System.out.println("The number is Postive\n" + num1);
		} else if (num1 < 0) {
			System.out.println("The number is Negative\n" + num1);
		} else {
			System.out.println("The number is zero\n" + num1);
		}

	}

	public static void Unbox() {
		System.out.println("Enter the number for Wapper clss:");
		Integer obj = sc.nextInt();
		int num = obj;
		if (num % 3 == 0) {
			System.out.println(num + "  is divisiable by 3 ");
		} else {
			System.out.println(num + "  is not divisiable by 3 ");
		}
	}
}