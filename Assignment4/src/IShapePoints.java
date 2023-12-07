/**
 * 
 * @author Braden Tink
 *
 */
//public Interface 
//Contians three methods that will be implemented in each class that implements it
public interface IShapePoints {

	public abstract Point2D getReferencePoint();
	
	public void setReferencePoint(Point2D p);
	
	public Point2D[] getAllShapePoints();
	
}
