package com.TrainingDay4;

import java.util.*;

public class Q4_Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//      The user decides the priority
        System.out.println("Choose priority:");
        System.out.println("1. Lowest price first");
        System.out.println("2. Highest price first");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        Comparator<Q4_Product> comparator;
  
        if (choice == 1) {
            comparator = new Comparator<Q4_Product>() {
            	
                @Override
                public int compare(Q4_Product p1, Q4_Product p2) {
                    return Double.compare(p1.getProductPrice(), p2.getProductPrice());
                    
                }
            };
            
        } else {
            comparator = new Comparator<Q4_Product>() {
                @Override
                public int compare(Q4_Product p1, Q4_Product p2) {
                    return Double.compare(p2.getProductPrice(), p1.getProductPrice());
                }
            };
        }

        PriorityQueue<Q4_Product> queue = new PriorityQueue<>(comparator);

        // inserting products
        queue.add(new Q4_Product(1, "Pen", 10.0));
        queue.add(new Q4_Product(2, "Notebook", 25.0));
        queue.add(new Q4_Product(3, "Bag", 400.0));
        queue.add(new Q4_Product(4, "Laptop", 60000.0));
        queue.add(new Q4_Product(5, "Mouse", 500.0));

        
        while (!queue.isEmpty()) {
            System.out.println("Processing product: " + queue.poll());
        }

        sc.close();
    }
	}

