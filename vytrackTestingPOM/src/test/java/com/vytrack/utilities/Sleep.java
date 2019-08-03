package com.vytrack.utilities;

public class Sleep {
	public static void sleep(int time){
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
