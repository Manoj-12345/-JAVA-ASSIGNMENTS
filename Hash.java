package Assignment5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Double> keys = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			int key = sc.nextInt();
			Double value = sc.nextDouble();
			keys.put(key,value);
		}

		System.out.println("Mapped elements are: ");
		 for(Map.Entry m : keys.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  
		
	}

}
