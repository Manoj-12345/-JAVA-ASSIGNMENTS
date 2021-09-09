package Assignment5;
import java.util.Scanner;

public class Hash3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String,String> myObj = new Pair<>();
		Scanner sc = new Scanner(System.in);
		String myObj1 = sc.nextLine();
		myObj.setKey(myObj1);
		System.out.println(myObj.getKey());
		String myObj2 = sc.nextLine();
		myObj.setValue(myObj2);
		System.out.println(myObj.getValue());
	}
	}
	class Pair<K,V>{
		K key;
		V value;
		
		
	 public K getKey() {
			return key;
		}
		public void setKey(K key) {
			this.key = key;
		}
		public V getValue() {
			return value;
		}
		public void setValue(V value) {
			this.value = value;
		}
		
	}
	
