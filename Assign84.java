package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class Assign84 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();

        list1.add("hi");
        list1.add("iam");
        list1.add("manoj");
        list1.add("kumar");
        list1.add("rajupalem");
        list1.add("from");
        list1.add("andhrapradesh");
        list1.removeIf(s->s.length()%2!=0);
        for(int i=0;i<list1.size();i++) {
        	System.out.println(list1.get(i));
        }
	}

}