package Assignment8;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Assign85 {
	public static void main(String[] args) {
		StringBuilder myName = new StringBuilder();
        List<String> words = new ArrayList<>();
        words.add("Mice");
        words.add("America");
        words.add("Numbers");
        words.add("owl");
        words.add("joker");
       
        
        Consumer<List<String>> firstLetters = (start) -> start.forEach(x->myName.append(x.charAt(0)));
        firstLetters.accept(words);

        System.out.println(myName);
	}

}