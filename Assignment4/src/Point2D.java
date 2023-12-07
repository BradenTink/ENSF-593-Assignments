/**
 * 
 * @author Braden Tink
 *
 */
//Public class Point2D
//Two protected varialbes x, y doubles
public class Point2D{
	protected double x, y;
	
	//Point2D constuctor 
	//Takes no arguments
	//initilize values to 0.0 and 0.0
	Point2D(){
		this(0.0, 0.0);
	}
	
	//Point2D constuctor 
	//Takes a Point2D object as the agument
	//sets x and y to the objects x and y values
	Point2D(Point2D p){
		this(p.x, p.y);
	}
	//Point2D constuctor 
	//Takes in two arguments double x double y
	//sets this x and y to the x and y values passe din
	Point2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	//Public Override method toString takes in no arguments
	//Returns a string whihc is the x and y value
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	//Public Override method equals takes in an object o 
	//Returns a boolean. Checks to see if the passed in object is 
	//equal to the Point2D object this. 
	@Override
	public boolean equals(Object o) {
		if(o == null)return false;
		if(!(o instanceof Point2D)) return false;
		
		Point2D that = (Point2D)o;
		return (this.x == that.x) && (this.y == that.y);
	}
}