package Assignment3;

public class Builder {

	public static void main(String[] args) {
		StringBuilder b = new StringBuilder();
		b.append("String Buffer");
		b.append(" is a peer of String");
		b.append(" that provide much of");
		b.append(" the functionality of the Strings");
		System.out.println(b);
		StringBuilder c = new StringBuilder("It is used to at the specific index");
		System.out.println(c);
		c.insert(13," insert text ");
		System.out.println(c);
		StringBuilder d = new StringBuilder("This method is used to reversing the statement ");
		System.out.println(d);
		d.reverse();
		System.out.println(d);

	}

}
