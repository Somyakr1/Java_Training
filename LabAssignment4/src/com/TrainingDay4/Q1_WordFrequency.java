package com.TrainingDay4;

import java.io.*;
import java.util.*;

public class Q1_WordFrequency {
	public static void main(String[] args) {
		
		Map<String, Integer> countWords = new HashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("story.txt"))){
			String line;
			
			while((line = br.readLine()) != null) {
				
				line = line.toLowerCase().replaceAll("[^a-z\\s]", "").trim();
				
				if (line.isEmpty()) {
                    continue;
                }
				
				String[] words = line.split("\\s+");
				
				for (String word : words) {
                    countWords.put(word, countWords.getOrDefault(word, 0) + 1);
                }
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
        }
	}
}
