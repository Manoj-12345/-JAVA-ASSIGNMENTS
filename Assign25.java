package Assignment2;
public class Assign25{

	public static void main(String[] args) {
		Line li = new Line();
		Rectangle re = new Rectangle();
		Cube cu = new Cube();
		li.draw();
		re.draw();
		cu.draw();
	}

}
class Shape{
	public void draw() {
		System.out.println("Draw their shapes");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("The drawn shape is Line");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("The drawn shape is Rectangle");
}
}
class Cube extends Shape{
	public void draw() {
		System.out.println("The drawn shape is Cube");
}
}
