package com.TrainingDay2;

public class Q1_Test {
	
	public static void show(Q1_UMLforCircle c, String circle) {
		System.out.println(circle);
		double circleRadius = c.getRadius();
		System.out.println("Radius: " + circleRadius);
		if(circleRadius>0) {
			System.out.println("Area: "+ c.getArea());
			System.out.println("Circumference: " + c.getCircumference());
			System.out.println("Color: " + c.getColor());
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Q1_UMLforCircle c1 = new Q1_UMLforCircle(2.0, "blue");
		show(c1, "Circle 1");
		
		Q1_UMLforCircle c2 = new Q1_UMLforCircle(2.0);
		show(c2, "Circle 2");
		
		Q1_UMLforCircle c3 = new Q1_UMLforCircle();
		show(c3, "Circle 3");
		
		Q1_UMLforCircle c4 = new Q1_UMLforCircle(-4);
		show(c4, "Circle 4");
	}
	
	
}
;
