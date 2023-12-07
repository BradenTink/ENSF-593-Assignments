import java.awt.Shape;
/**
 * 
 * @author Braden Tink
 *
 */
//Public class Rectangle that extends Shape2D and implements IShapePoints
public class Rectangle extends Shape2D implements IShapePoints{
	//New Point2D object P2
	Point2D P2 = new Point2D();
	
	//Public constructor that takes in no arguments
	//set default values to 1.0 ,2.0
	public Rectangle() {
		this(1.0,  2.0);
	}

	//Public constructor that take in two arguments double w double h
	//calls super constructor in shape2D passing in w, h
	public Rectangle(double w, double h) {
		super(w, h);
	}
	
	//Public Override class getCirvumference takes in no arguments
	//calls the getHeight method and getWidth and calculates the circumference
	//Returns value
	@Override
	public double getCircumference() {
		return 2 * (this.getHeight() + this.getWidth());
	}
	
	//Public Override class getArea takes in no arguments
	//calls the getHeight method and getWidth and calculates the area
	//Returns value
	@Override
	public double getArea() {
		return this.getHeight() * this.getWidth();
	}

	//Public Override class getReferencePoint takes in no arguments
	//creates a copy of the Point2D object
	//Returns the copy of the Points2D
	@Override
	public Point2D getReferencePoint() {
		// TODO Auto-generated method stub
		Point2D pcopy = new Point2D(P2);
		return pcopy;
	}
	
	//Public Override class setReferencePoint takes in an object o as the argument
	//sets P2 x and y values to the passed in object value
	@Override
	public void setReferencePoint(Point2D p) {
		// TODO Auto-generated method stub
		P2.x = p.x;
		P2.y = p.y;
	
	}
	
	//Public Override class getAllShapePoints takes in no argument
	//Returns a Point2D array 
	@Override
	public Point2D[] getAllShapePoints() {
		// TODO Auto-generated method stub
		//creates a Point2D array of length
		Point2D[] tmpAry = new Point2D[4];
		//Creates four points of Point2D type 
		Point2D pointOne = new Point2D(P2.x,P2.y);
		Point2D pointTwo = new Point2D(P2.x + this.getWidth(),P2.y);
		Point2D pointThree = new Point2D(P2.x + this.getWidth(),P2.y + this.getHeight());
		Point2D pointFour = new Point2D(P2.x,P2.y + this.getHeight());
		//Add all points to the array 
		tmpAry[0] = pointOne;
		tmpAry[1] = pointTwo;
		tmpAry[2] = pointThree;
		tmpAry[3] = pointFour;
		//return array
		return tmpAry;
	}
}
