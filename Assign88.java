package Assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


class PrintList implements Runnable{
	
	List<Integer> list;
	PrintList(List<Integer> list){
		this.list = list;
	}

	@Override
	public void run() {
		Consumer<List<Integer>> printNumbers = (nums)->nums.forEach(System.out::println);
		printNumbers.accept(list);
	}
	
}

public class Assign88 {

	public static void main(String[] args) {
		List<Integer> numsList = new ArrayList<>();
		numsList.add(90);
		numsList.add(870);
		numsList.add(876);
		numsList.add(940);
		numsList.add(370);
        
        PrintList printTask = new PrintList(numsList);
        Thread thread = new Thread(printTask); 
        thread.start();
	}

}