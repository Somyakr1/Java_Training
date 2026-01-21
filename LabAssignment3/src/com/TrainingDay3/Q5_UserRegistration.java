package com.TrainingDay3;

public class Q5_UserRegistration {

		static void registerUser(String name, String country) throws Q5_InvalidCountryException{
			if(!country.equalsIgnoreCase("India")){
					throw new Q5_InvalidCountryException("User outside India cannot register");
					}
			System.out.println("User registration done successfully.");
		}
		
		public static void main(String[] args) {
			try {
				registerUser("Aman", "Japan");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			 try {
		            registerUser("Somya", "India");
		        } catch (Q5_InvalidCountryException e) {
		            System.out.println(e.getMessage());
		        }
		}
}
