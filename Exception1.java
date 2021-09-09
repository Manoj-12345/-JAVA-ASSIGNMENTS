package Assignment4;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Example for airthemetic exception:");
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number: ");
int num1 = sc.nextInt();
System.out.println("Enter a second number: ");
int num2 = sc.nextInt();
try {
	//int res = num1/num2;
 if(num2==0)
	{
 throw new UnsupportedOperationException();
	}
 int res = num1/num2;
 System.out.println(res);
}
	catch (Exception e) {
	System.out.println("Airthemetic exception");
}

	}

}
