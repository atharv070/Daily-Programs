//*WAP to choice the option from bellow
  1.try catch
2:try catch finally
3:nested try catch
4:multiple catch block
and do the operations as follow
1. arithmetic operation
2. accept the size and than accept no arr[size+1]=45;
3: arithmetic, array, accept name from user than display the name, assign null value to name. display the hascode
4: arithmetic, array, accept name from user than display the name, assign null value to name. display the hascode
*/


package exception;

import java.util.Scanner;

public class Abc {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		char ans;

		do {
			System.out.println(
					"Choice the Opotion \n1. try catch \n2. try catch finally \n3. nested catch block \n4. multiple catch block");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				try {
					int num1, num2, res;

					System.out.println("Entre two no");
					num1 = sc.nextInt();
					num2 = sc.nextInt();

					res = num1 * num2;
					System.out.println("The mul is =" + res);

					res = num1 / num2;
					System.out.println("The div is =" + res);

					res = num1 + num2;
					System.out.println("The add is =" + res);
				} catch (Exception e) {
					System.out.println("the second no cannot be zero");
				}
				break;
			case 2:
				try {
					int size, i;
					System.out.println("Enter the size");
					size = sc.nextInt();
					int arr[] = new int[size];
					arr[size + 1] = 45;
					for (i = 0; i < size; i++) {
						System.out.println("Array=" + arr[i]);
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("The Array size is greater than it's declared.\n");
				} finally {
					System.out.println("This Operation is to make you know about the exception");
				}
				break;
			case 3:
				try {
					int num1, num2, res;

					System.out.println("Entre two number:");
					num1 = sc.nextInt();
					num2 = sc.nextInt();

					res = num1 * num2;
					System.out.println("The mul is =" + res);

					res = num1 / num2;
					System.out.println("The div is =" + res);

					res = num1 + num2;
					System.out.println("The add is =" + res);
				} catch (Exception e) {
					System.out.println("the second no cannot be zero");
				}
				try {
					int size, i;
					System.out.println("Enter the size");
					size = sc.nextInt();
					int arr[] = new int[size];
					arr[size + 1] = 45;
					for (i = 0; i < size; i++) {
						System.out.println("Array=" + arr[i]);
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("The Array size is greater than it's declared.\n");
				}
				try {
					String name;
					name = null;
					System.out.println("Enter your name:");
					name = sc.next();

					System.out.println("The name is=" + name.hashCode());

				} catch (NullPointerException n) {
					System.out.println("The name cannot be null");
				} finally {
					System.out.println("This is an example of Expection Handling.");
				}
				break;
			case 4:
				try {
					int num1, num2, res;

					System.out.println("Entre two number:");
					num1 = sc.nextInt();
					num2 = sc.nextInt();

					res = num1 * num2;
					System.out.println("The multiplication of two numbers =" + res);

					res = num1 / num2;
					System.out.println("The division of two  numbers =" + res);

					res = num1 + num2;
					System.out.println("The addition of two numbers =" + res);

					res = num1 - num2;
					System.out.println("The Substraction of two numbers =" + res);

					int size, i;
					System.out.println("Enter the size");
					size = sc.nextInt();
					int arr[] = new int[size];
					arr[size + 1] = 45;
					for (i = 0; i >= 0; i++)
						System.out.println("Array=" + arr[i]);

					String name;
					name = null;
					System.out.println("Enter your name:");
					name = sc.next();
					System.out.println("The name is=" + name.hashCode());

				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("The Array size is greater than it's declared.\n");
				} catch (NullPointerException n) {
					System.out.println("The name cannot be null");
				} catch (Exception e) {
					System.out.println("the second no cannot be zero");
				} finally {
					System.out.println("This is an example of Expection Handling.");
				}
				break;
			}
			System.out.println("Do you want to select another option Yes/No");
			ans = sc.next().charAt(0);
		} while (ans == 'Y' || ans == 'y');
		System.out.println("You have selected No, so the proccess is stoped");
	}

}