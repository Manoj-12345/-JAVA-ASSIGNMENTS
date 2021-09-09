package Assignment3;

public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			StringBuffer b = new StringBuffer();
			b.append("String Buffer");
			b.append(" is a peer of String");
			b.append(" that provide much of");
			b.append(" the functionality of the Strings");
			System.out.println(b);
			StringBuffer c = new StringBuffer("It is used to at the specific index");
			System.out.println(c);
			c.insert(13," insert text ");
			System.out.println(c);
			StringBuffer d = new StringBuffer("This method is used to reversing the statement ");
			System.out.println(d);
			d.reverse();
			System.out.println(d);

				}

			}