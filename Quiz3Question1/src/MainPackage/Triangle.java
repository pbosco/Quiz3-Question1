package MainPackage;


public class Triangle extends GeometricObject{
	//private attributes
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	//no arg constructor to create default triangle
	public Triangle(){
		Triangle t = new Triangle(side1, side2, side3);
		
	}
	
	//constructor to create specific triangle
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		Triangle t = new Triangle(side1, side2, side3);
	}
	
	//getters
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	//setters
	public void setSide1(double side1){
		this.side1 = side1;
	}
	
	public void setSide2(double side2){
		this.side2 = side2;
	}
	
	public void setSide3(double side3){
		this.side3 = side3;
	}
	
	// Perimeter and Area methods
	@Override
	public double getPerimeter(){
		double perimeter = (side1 + side2 + side3);
		
		return perimeter;
	}
	@Override
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s*(s - side1) + s * (s - side2) + s * (s - side3));
		return area;
	}
	
	//ToString method
	public String ToString(){
		return("Side 1 = " + side1 + ". Side 2 = "+ side2 + "."
				+ "Side 3 = " + side3);
				
	}

	

	
	
	
	
	
	
	
	
	

}
