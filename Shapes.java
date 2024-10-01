/**
* This class demonstrates the methods of the ThreeDShape class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class Shapes {
	/**
	* This is the main method.
	* @param args Unused.
	*/
	public static void main(String args[]) { 
		
		Sphere S1 = new Sphere(2);
		Cylinder C1 = new Cylinder(2, 10);
		Cube CB1 = new Cube(6);
		Cube CB2 = new Cube(6, 5, 7);
		parallelepiped P1 = new parallelepiped(2, 5, 8);
		
		System.out.println("E of Sphere is: " + S1.E() + "\nV of Sphere is: " + S1.V() + "\nDimensions are: ");
		S1.show();
		
		System.out.println("E of Cylinder is: " + C1.E() + "\nV of Cylinder is: " + C1.V() + "\nDimensions are: ");
		C1.show();
		
		System.out.println("E of Cube is: " + CB1.E() + "\nV of Cube is: " + CB1.V() + "\nDimensions are: ");
		CB1.show();
		
		System.out.println("E of Cube is: " + CB2.E() + "\nV of Cube is: " + CB2.V() + "\nDimensions are: ");
		CB2.show();
		
		System.out.println("E of parallelepiped is: " + P1.E() + "\nV of parallelepiped is: " + P1.V() + "\nDimensions are: ");
		P1.show();
	}
}
