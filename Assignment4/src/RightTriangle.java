/**
 * 
 * @author Braden Tink
 *
 */
//Public class RightTriangle that extends Shape2D
public class RightTriangle extends Shape2D{
	
	//Public Contructor that takes two arguments double w, h
	//Calls super Contructor from Point2D passing w and h
	public RightTriangle(double w, double h) {
		super(w, h);
	}
	//Public Override method getCircumference that takes in no arguments
	//Calcualtes the Circumference of a right triangle calling the getHeight and getWidth methods
	//Returns a double Circumference
	@Override
	public double getCircumference() {
		//using math.pow and math.sqrt to calculate the Circumference
		double hypotunuse = (Math.pow(this.getHeight(), 2)) + (Math.pow(this.getWidth(), 2));
		hypotunuse = Math.sqrt(hypotunuse);
		//return value
		return (hypotunuse + this.getHeight() + this.getWidth());
	}
	//Public Override method getArea takes in no arguments
	//Calls getHeight and getWidth to calcualte the area
	//Returns a double area 
	@Override
	public double getArea() {
		return (this.getHeight() * this.getWidth()) / 2;
	}
}
