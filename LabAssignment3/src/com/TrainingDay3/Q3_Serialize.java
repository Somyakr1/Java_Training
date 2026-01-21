package com.TrainingDay3;

import java.io.*;

public class Q3_Serialize {
	public static void main(String[] args) {
		Q3_Address address = new Q3_Address("New Delhi", "Delhi");
		Q3_Employee employee = new Q3_Employee(1, "Somya", address, 100000);
		
		System.out.println("Before serialization: ");
		employee.display();
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"))){
		
		 oos.writeObject(employee);
	            System.out.println("Employee object serialized successfully");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
