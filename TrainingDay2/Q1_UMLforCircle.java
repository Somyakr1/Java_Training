package com.TrainingDay2;

public class Q1_UMLforCircle {
	
	private double radius;
	private String color;
	
	public Q1_UMLforCircle() {               
	      this.radius = 1.0;
	      this.color = "red";
	   }
	   
	   public Q1_UMLforCircle(double r) {          
	      setRadius(r);
	      this.color = "red";
	   }

	   public Q1_UMLforCircle(double r, String c) { 
	      this.radius = r;
	      this.color = c;
	   }

	public double getRadius() {  
	      return radius;
	   }
	
	public String getColor() {  
	      return color;
	   }
	
	public double getArea() {
	      return radius * radius * Math.PI;
	   }
	
	public double getCircumference() {
	      return 2 * Math.PI * radius;
	   }
	
	public void setRadius(double radius) {
		this.radius = radius;
		if(radius<=0){
			System.out.println("Radius must be positive");
		}
	}
}

