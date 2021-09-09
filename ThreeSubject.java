package Assignment1;
import java.util.Scanner;

public class ThreeSubject {

	public static void main(String[] args) {
			int a,b,c;
			Scanner sc = new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
		if(a>=60   &&  b>=60 && c>=60)
			{
				System.out.println("pass");
				
			}
		else if((a>=60 && b>=60)||(b>=60 && c>=60)||(c>=60 && a>=60))
		   {
			System.out.println("promoted");	
			}
		else if ((a>=60&&b<=60&&c<60)||(a<=60&&b>=60&&c<60)||(a<=60&&b<=60&&c>=60)) {
			System.out.println("fail");
			
		}
		else {
			System.out.println("fail all");
		}
	}

	}
