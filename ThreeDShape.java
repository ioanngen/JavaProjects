/**
* This class demonstrates the methods of the ThreeDShape class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class ThreeDShape { 
	private double width;
	private double height;
	private double depth;
	
	/**
	* Default constructor.
	* @param w The width
	* @param h The height
	* @param d The depth
	*/
	ThreeDShape(double w, double h, double d){
		width = w; 
		height = h;
		depth = d; 
	}
	
	/**
	* Parameterized constructor.
	* @param w The width
	* @param h The height
	*/
	ThreeDShape(double w, double h){
		width = w; 
		height = h;
	}
	
	/**
	* Parameterized constructor.
	* @param w
	*/
	ThreeDShape(double x) {
		width = height = depth = x;
	}
	
	/**
	* This method returns the width of ThreeDShape.
	* @return width
	*/
	double getWidth() { return width; } 
	/**
	* This method returns the height of ThreeDShape.
	* @return height
	*/
	double getHeight() { return height; } 
	/**
	* This method returns the depth of ThreeDShape.
	* @return depth
	*/
	double getDepth() { return depth; } 
	
	/**
	* This method sets the Width.
	* @param w The width of ThreeDShape.
	*/
	void setWidth(double w) { width = w; } 
	/**
	* This method sets the Height.
	* @param h The height of ThreeDShape.
	*/
	void setHeight(double h) { height = h; } 
	/**
	* This method sets the Depth.
	* @param d The depth of ThreeDShape.
	*/
	void setDepth(double d) { depth = d; }
}

/**
* This class demonstrates the methods of the Sphere class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class Sphere extends ThreeDShape { 
	private double r;
	
	/**
	* Default constructor.
	* @param x The radius
	*/
	Sphere(double x){
		super(2*x);
		r=x;
	}
	
	/**
	* This method returns the area of Sphere.
	* @return 4*Math.PI*Math.sqrt(r);
	*/
	double E(){
		return 4*Math.PI*Math.sqrt(r);
	}
	/**
	* This method returns the volume of Sphere.
	* @return (4/3)*Math.PI*(Math.sqrt(r)*r);
	*/
	double V(){
		return (4/3)*Math.PI*(Math.sqrt(r)*r);
	}
	/**
	* This method prints the dimensions of Sphere.
	*/
	void show() { 
		System.out.println("R is: " + r + "\n"); 
	}
}

/**
* This class demonstrates the methods of the Cylinder class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class Cylinder extends ThreeDShape { 
	private double r;
	
	/**
	* Default constructor.
	* @param x The radius
	* @param y The width or Hight
	*/
	Cylinder(double x, double y){
		super(y);
		r=x;
	}
	
	/**
	* This method returns the area of Cylinder.
	* @return 2 *(( Math.PI*Math.sqrt(r) )+( 2*Math.PI*r*getHeight() ));
	*/
	double E(){
		// E = 2 * E(Βάσης) + Ε(Καμπήλης)
		return 2 *(( Math.PI*Math.sqrt(r) )+( 2*Math.PI*r*getHeight() ));
	}
	/**
	* This method returns the volume of Cylinder.
	* @return Math.PI*Math.sqrt(r)*getHeight();
	*/
	double V(){
		return Math.PI*Math.sqrt(r)*getHeight();
	}
	/**
	* This method prints the dimensions of Cylinder.
	*/
	void show() { 
		System.out.println("R is: " + r + "\nHeight is: " + getHeight() + "\n"); 
	}
}

/**
* This class demonstrates the methods of the Cube class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class Cube extends ThreeDShape { 
	/**
	* Default constructor.
	* @param x The width or Hight or Depth
	*/	
	Cube(double x){
		super(x);
	}
	/**
	* Parameterized constructor.
	* @param x The Width
	* @param y The Hight
	* @param z The Depth
	*/	
	Cube(double x, double y, double z){
		super(x, y, z);
	}
	/**
	* This method returns the area of Cube.
	* @return 6*Math.sqrt(getHeight());
	* @return 2*(getWidth()+getDepth())*getHeight();
	*/
	double E(){
		if (getHeight()==getWidth()){
			return 6*Math.sqrt(getHeight());
		}else{
			return 2*(getWidth()+getDepth())*getHeight();
		}
		
	}
	/**
	* This method returns the volume of Cube.
	* @return Math.sqrt(getHeight())*getHeight();
	* @return 2*(getWidth()*getDepth()+getWidth()*getHeight()+getDepth()*getHeight());
	*/
	double V(){
		if (getHeight()==getWidth()){
			return Math.sqrt(getHeight())*getHeight();
		}else{
			return 2*(getWidth()*getDepth()+getWidth()*getHeight()+getDepth()*getHeight());
		}
	}
	/**
	* This method prints the dimensions of Cube.
	*/
	void show() { 
		if (getHeight()==getWidth()){
			System.out.println("All sides of Cube are: " + getHeight() + "\n"); 
		}else{
			System.out.println("Width is: " + getWidth() + "\nHeight is: " + getHeight() + "\nDepth is: " + getDepth()); 
		}
	}
}

/**
* This class demonstrates the methods of the parallelepiped class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class parallelepiped extends ThreeDShape { 
	/**
	* Default constructor.
	* @param x The Width
	* @param y The Hight
	* @param z The Depth
	*/	
	parallelepiped(double x, double y, double z){
		super(x, y, z);
	}
	/**
	* This method returns the area of parallelepiped.
	* @return 2*(getWidth()*getHeight())+2*(getDepth()*getHeight())+2*(getWidth()*getDepth());
	*/
	double E(){
		return  2*(getWidth()*getHeight())+2*(getDepth()*getHeight())+2*(getWidth()*getDepth());
	}
	/**
	* This method returns the volume of parallelepiped.
	* @return (getWidth()*getDepth())*getHeight();
	*/
	double V(){
		return (getWidth()*getDepth())*getHeight();
	}
	/**
	* This method prints the dimensions of parallelepiped.
	*/
	void show() { 
		System.out.println("Width is: " + getWidth() + "\nHeight is: " + getHeight() + "\nDepth is: " + getDepth()); 
	}
}
