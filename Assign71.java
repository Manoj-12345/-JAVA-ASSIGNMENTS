package Assignment7;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.METHOD) 
@interface Test{
	
}
public class Assign71 {

	public static void main(String[] args) {
		printSeries(8);

	}


@Test
static void printSeries(int n){
    for (int i=0;i<n;i++) {
    	System.out.println(i*2);
    }
}
}