package Assignment1;

		import java.io.*;
		import java.util.*;
		public class Average
		{
			public static void main(String[] args) {
			    int avg=0,a=0,b=0,c=0,sum=0;
			    Scanner sc = new Scanner(System.in);
			    for(int i=0;i<3;i++){
			        int a1 = sc.nextInt();
			        int b1 = sc.nextInt();
			        int c1 = sc.nextInt();
			        a = a+a1;
			        b = b+b1;
			        c = c+c1;
			        avg = avg+a1+b1+c1;
			    }
			    System.out.println(avg/3);
			    System.out.println(a/3+","+b/3+","+c/3);
			    
			}
		}
		