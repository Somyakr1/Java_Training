package com.TrainingDay4;

import java.io.*;
import java.util.*;

public class Q3_ReadDoubles {
	
	   public static void main(String[] args) {

	        List<Double> numbers = new ArrayList<>();

	        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
	        	
	            String line;

	            while ((line = br.readLine()) != null) {
	                line = line.trim();
	                
	                if (line.isEmpty()) {
	                    continue;
	                }

	                try {
	                    double value = Double.parseDouble(line);
	                    numbers.add(value);
	                } catch (NumberFormatException e) {
//	                	invalid nos. are not added to the numbers list
	                    System.out.println("Invalid number skipped: " + line);
	                }
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	            return;
	        }

	        // empty file or no valid numbers
	        if (numbers.isEmpty()) {
	            System.out.println("No valid numbers found.");
	            return;
	        }

	        double max = numbers.get(0);
	        for (double num : numbers) {
	            if (num > max) {
	                max = num;
	            }
	        }

	        System.out.println("Largest value: " + max);
	    }
	
}
