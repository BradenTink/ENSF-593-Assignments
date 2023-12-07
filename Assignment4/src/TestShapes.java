import java.util.Arrays;
/**
 * 
 * @Braden Tink
 */
//Public class testShapes
public class TestShapes {
	
	//Public Method printShapeInfo that takes in a Shape2D object s
	//Returns nothing 
	public static void printShapeInfo(Shape2D s) {
		//Print Statments of the method
		System.out.println(s);
		System.out.println("area= " + s.getArea());
		System.out.println("circumference= " + s.getCircumference());
	}
	//Public method printPointInformation takes one argument shape type IShapePoints
	//Returns nothing
	public static void printPointInformation(IShapePoints shape) {
		System.out.println("Reference point: "+shape.getReferencePoint());
		System.out.println("All points: "+Arrays.toString(shape.getAllShapePoints()));
	}
	//Public method printSquareWidthTest
	//Returns nothing
	public static void printReferencePointChangeTest(IShapePoints shape) {
		printPointInformation(shape);
		Point2D p = new Point2D(5.0, 10.0);
		System.out.println("\nSetting reference point to "+p);
		shape.setReferencePoint(p);
		System.out.println(shape);
	
		printPointInformation(shape);
	}
	//Public method printReferencePointGetTest takes one argument shape type IShapePoints
	//Returns nothing
	public static void printReferencePointGetTest(IShapePoints shape) {
		Point2D p = shape.getReferencePoint();
		System.out.println("Got point "+p);
		p.x = -10;
		System.out.println("Changed point to "+p);
		System.out.println("Shape reference is "+shape.getReferencePoint());
		System.out.println("Comparing points is "+p.equals(shape.getReferencePoint())+" (should be false)");
	}
	//Public method printReferencePointSetTest takes one argument shape type IShapePoints
	//Returns nothing
	public static void printReferencePointSetTest(IShapePoints shape) {
		Point2D p = new Point2D(-1, -1);
		System.out.println("Set reference to point "+p);
		shape.setReferencePoint(p);
		System.out.println("Shape reference is "+shape.getReferencePoint());
		p.x = 1; p.y=1;
		System.out.println("Changed point to "+p);
		System.out.println("Shape reference is "+shape.getReferencePoint());
		System.out.println("Comparing points is "+p.equals(shape.getReferencePoint())+" (should be false)");
	}
	//Public method printSquareWidthTest takes in one object as an argument Shape2D as s
	//Returns nothing
	public static void printSquareWidthTest(Shape2D s) {
		System.out.println("prior " + s);
		s.setWidth(5);
		System.out.println("after setWidth(5) " + s);
		s.setHeight(10);
		System.out.println("after setHeight(10) " + s);
	}

	public static void main(String[] args) {
		//Shape2D array shapes that holds shapes
		Shape2D[] shapes = { 
				//Create objects RightTriangle, Rectangle, Square
				new RightTriangle(1.0, 2.0), 
				new Rectangle(1.0, 2.0), 
				new Square(2.0) 
				};
		//For all shapes call the following print message
		for(Shape2D shape: shapes) {
			System.out.println("\n*** " + shape.getClass().getSimpleName() + " ***");
			printShapeInfo(shape);
		}
		
		//Call methods defined above with the defined parameters
		System.out.println("\n*** Reference point change ***");
		printReferencePointChangeTest(new Rectangle(1.0, 2.0));
		
		System.out.println("\n*** Change get reference point test ***");
		printReferencePointGetTest(new Rectangle(1.0, 2.0));
		
		System.out.println("\n*** Change set reference point test ***");
		printReferencePointSetTest(new Rectangle(1.0, 2.0));

		System.out.println("\n*** Square set width/height test *** ");
		printSquareWidthTest(new Square(1.0));

	}

}
