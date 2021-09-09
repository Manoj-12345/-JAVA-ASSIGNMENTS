package Assignment1;
import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		int c;
		float tax;
		Scanner sc = new Scanner(System.in);
		c=sc.nextInt();
		if(c>0 && c<=180000) {
			tax = 0;
			
		}
		else if(c>180000 && c <= 300000){
			tax = (c*10)/100;
		}
		else if(c>300000 && c <= 500000){
			tax = (c*20)/100;
					
		}
		else {
			tax = (c*30)/100;
		}
        System.out.println(tax);
	}
		
}
