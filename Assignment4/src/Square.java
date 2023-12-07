/**
 * @author Braden Tink 
 */
//Public class Square that extends Shape2D
public class Square extends Shape2D{
	
	//Publix constuctor Square 
	//Takes in one argument w width 
	//Call super constuctor back at Sahpe2D passing w twice
	//For width and height as they are equal in a square 
	public Square(double w) {
		super(w,w);
	}
	
	
	//Public override method setWidth takes in one argument w width 
	//Call to super methods setWidth and height that back in Shape2D
	//Returns nothing 
	@Override
	public void setWidth(double w) {
		super.setWidth(w);
		super.setHeight(w);
	}
	//Public override method setHeight takes in one argument w width 
	//Call to super methods setWidth and height that back in Shape2D
	//Returns nothing 
	@Override
	public void setHeight(double w){
		super.setWidth(w);
		super.setHeight(w);
	}
	//Public override method getCircumference takes in no arguments 
	//Calls getWidth and times it by 4
	//Returns circumference 
	@Override
	public double getCircumference() {
		return (this.getWidth() *4);
	}
	//Public override method getArea takes in no arguments 
	//Calls getWidth and getHeight to calculate area
	//Returns area
	@Override
	public double getArea() {
		return (this.getHeight() * this.getWidth());
	}
}
