package Assignment7;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute {
	int sequence();
	 
	
}
class Det{
	@Execute(sequence=2)
	void developer() {
		System.out.println("umesh");
	}
	@Execute(sequence=1)
	void developer2(){
		System.out.println("onkar");
	}
	@Execute(sequence=3)
	void developer3(){
		System.out.println("naveen");
	}
}
public class Asiign73 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Det obj = new Det();
		Class c = obj.getClass();
        Annotation an = c.getAnnotation(Execute.class);
        Execute e = (Execute) an;
        System.out.println(e.sequence());
		
		
	}

}

