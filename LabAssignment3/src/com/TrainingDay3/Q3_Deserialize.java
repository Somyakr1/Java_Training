package com.TrainingDay3;

import java.io.*;

public class Q3_Deserialize {
	public static void main(String[] args) {
		try (ObjectInputStream ois =
                new ObjectInputStream(
                        new FileInputStream("emp.ser"))) {

       Q3_Employee emp = (Q3_Employee) ois.readObject();

       System.out.println("After Deserialization:");
       emp.display();

   } catch (Exception e) {
       e.printStackTrace();
   }
	}
}
