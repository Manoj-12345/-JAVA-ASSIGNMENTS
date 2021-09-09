package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class Assign86 {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("manoj");
		words.add("kumar");
		words.add("raju");
		words.add("palem");
		words.add("khader");

		words.replaceAll(word->word.toUpperCase());
		
        for(int i=0;i<words.size();i++) {
        	System.out.println(words.get(i));
        }

	}

}