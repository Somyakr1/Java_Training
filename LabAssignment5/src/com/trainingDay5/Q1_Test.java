package com.trainingDay5;

public class Q1_Test {
	public static void main(String[] args) {
		for(int i=1; i<=25; i++) {
			String url = "https://www.dropbox.com/photo" + i + ".jpg";
			Thread t = new Thread(new Q1_FileDownloader(url),
                    "Downloader-" + i);
            t.start();
		}
	}
}
