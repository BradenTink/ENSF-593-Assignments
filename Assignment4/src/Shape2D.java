/**
 * 
 * This abstract class
 * represents a shape in two-dimensional space
 * using its width and height
 * 
 * 
 * @author Braden Tink
 *
 */
//Public abstract method Shape2D
//Two variables double width and double height
public abstract class Shape2D {
	
	private double width;
	private double height;
	
	//Shape2D constuctor
	//defualt values of 1,1
	public Shape2D() {
		this(1.0, 1.0);
	}
	
	//Shape2D constuctor
	//Takes in 2 arguments w, h for width and height
	//assigns arguments to this.width, this.height
	public Shape2D(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	//public method getWidth takes no arguments
	//Returns the width 
	public double getWidth() {
		return width;
	}
	
	//public method setWidth takes one argument w or width
	//sets the width 
	public void setWidth(double w) {
		this.width = w;
	}
	
	//public method getHeight takes no arguments
	//Returns the Height
	public double getHeight() {
		return height;
	}
	//public method setHeight takes one argument h or Height
	//sets the Height 
	public void setHeight(double h) {
		this.height = h;
	}
	
	//Public override method toString 
	//Takes no arguments
	//Returns a string with width and height inside
	@Override
	public String toString() {
		return width+" x "+height;
	}
	
	//public Abstract method getCircumference
	public abstract double getCircumference();
	
	//public Abstract method getArea
	public abstract double getArea();
	
}
