package Assignment1;
import java.util.Scanner;

public class Compund {

	public static void main(String[] args) {
     double p,t,r;
		
		try (Scanner sc = new Scanner(System.in)) {
			p =sc.nextInt();
			t=sc.nextInt();
			r=sc.nextInt();
		}
		double sim,cim;
		sim=(p*t*r)/100;
		r=Math.pow(r+1, t);
		cim=(p*r)-p;
		System.out.println(sim+","+cim);

	}

	}
