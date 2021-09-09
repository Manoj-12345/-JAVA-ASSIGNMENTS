package Assignment3;

public class JavaStrings {
//String str ="Hello World";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello World";
		System.out.println("Length of String : "+str.length());
		String str1= "How are you? ";
		System.out.println("joining of two strings : "+str.concat(str1));
        String  a = "Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println("String in lower case: "+ a.toLowerCase());
        System.out.println("String in upper case: "+ a.toUpperCase());
        System.out.println("String is Replaced a with $: "+ a.replace('a', '$'));
        System.out.println("String is Contains: "+ a.contains("collection"));
        System.out.println("String str is equal to a or not:"+ (str == a));
        System.out.println("String str is equal to a or not:"+ (str.equals(a)));
	}

}
