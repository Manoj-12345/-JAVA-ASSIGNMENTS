package Assignment6;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Assign62 {

	public static void main(String[] args) {
		// creating ArrayList and adding objects
		ArrayList<String> obj=new ArrayList<>();
		obj.add("Manoj");
		obj.add("kumar");
		obj.add("rajupalem");
		obj.add("charan");
		obj.add("vijaya");
		obj.add("nikitha");
		obj.add("sushmitha");
		obj.add("suman");
		obj.add("tejesh");
		obj.add("sainath");
		obj.add("umesh");
		//creating HashSet and adding objects
		HashSet<String> set=new HashSet<String>(obj);
		set.add("Susi");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}