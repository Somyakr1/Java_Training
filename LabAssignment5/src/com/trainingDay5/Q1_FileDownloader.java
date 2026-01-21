package com.trainingDay5;

import java.util.Random;

public class Q1_FileDownloader implements Runnable{
	
	private String fileUrl;
	
	public Q1_FileDownloader(String fileUrl) {
        this.fileUrl = fileUrl;
	}
        
        @Override
        public void run() {
            String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);
            System.out.println(Thread.currentThread().getName()
                    + " - Starting download: " + fileName);

            try {
                Random random = new Random();
                Thread.sleep(200 + random.nextInt(300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()
                    + " - Completed: " + fileName);
        }
    }

