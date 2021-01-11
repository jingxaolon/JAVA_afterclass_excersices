
public class Nine_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a rectangle with width 4 and height 40
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("The width of the rectangle1 is "
			      + rectangle1.width + " and the height is " + rectangle1.height);
	    System.out.println("The area of the rectangle1 is "
	      + rectangle1.getArea() + " and the perimeter is " + rectangle1.getPerimeter());
	  
	    // Create a rectangle with width 4 and height 40
	    Rectangle rectangle2 = new Rectangle(3.5, 35.9);
	    System.out.println("\nThe width of the rectangle2 is "
			      + rectangle2.width + " and the height is " + rectangle2.height);
	    System.out.println("The area of the rectangle2 is "
	      + rectangle2.getArea() + " and the perimeter is " + rectangle2.getPerimeter());
	}

}

class Rectangle{
	double width = 1;
	double height = 1;
	
	Rectangle() {
		
	}
	
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return (width + height) * 2;
	}
}