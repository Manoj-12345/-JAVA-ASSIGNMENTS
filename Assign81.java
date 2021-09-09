package Assignment8;

public class Assign81 {

	
		public static void main(String[] args) {
			ArithOperations add=(int num1, int num2)->num1+num2;
		        System.out.println("Sum: "+add.arithoper(8,4));


		        ArithOperations sub = (int num3, int num4)->num3-num4;
		        System.out.println("Difference: "+sub.arithoper(5,2));

		        ArithOperations multiply = (int num5, int num6)->num5*num6;
		        System.out.println("Product: "+multiply.arithoper(6,3));

		        ArithOperations division = (int num7, int num8)->num7/num8;
		        System.out.println("Division result: "+division.arithoper(3,3));
		}

	}
	@FunctionalInterface 
	interface ArithOperations{
		public int arithoper(int num1, int num2);
	}

	

