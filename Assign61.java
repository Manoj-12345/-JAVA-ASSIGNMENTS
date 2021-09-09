package Assignment6;
import java.util.TreeMap;

public class Assign61 {

	public static void main(String[] args) {

			TreeMap<Long,String> map=new TreeMap<Long,String>();
			
			map.put((long) 101, "Manoj");
			map.put((long) 102, "Kumar");
			map.put((long) 103, "rajupalem");
			
			
			System.out.println("all the keys: "+map.keySet());
			System.out.println("all the values: "+map.values());
			System.out.println("all key-value pairs: "+map.keySet()+map.values());
			System.out.println("descendingMap: "+map.descendingMap());
		}

	}

