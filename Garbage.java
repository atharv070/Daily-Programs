//*WAP to accept number and find the greater number and call the garbadge function amnually*/
import java.util.Scanner;

public class demo {
	public void finalize() {
		System.out.println("here my gc method is call");
	}

	public static void main(String[] args) {
		demo obj1 = new demo();
		obj1.greater_no();
		obj1 = null;
		System.gc();

	}

	public static void greater_no() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter two value");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println(num1 + " is greater");
		} else {
			System.out.println(num2 + " is greater ");
		}
	}
}