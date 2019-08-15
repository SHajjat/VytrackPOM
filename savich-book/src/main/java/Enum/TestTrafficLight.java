package Enum;

import static Enum.TraficLight.RED;

public class TestTrafficLight {
	public static void main(String[] args) {
		System.out.println(TraficLight.AMBER);
		System.out.println(RED);
		System.out.println(TraficLight.GREEN);
		System.out.println(RED instanceof TraficLight);// Red is instance of TraficLight
		System.out.println(RED instanceof Enum);// Red is instance of Enum
		System.out.println(RED instanceof Object);// Red is instance of Object
		
		Object obj = RED;
		TraficLight traffic = RED; //mostly it will be this way
		TraficLight [] arr = TraficLight.values();
		System.out.println(arr);
		System.out.println(traffic.getDuration());
		System.out.println(RED.getDuration());
		System.out.println(getNewMessage(null));
		
	}
	private static String getNewMessage(TraficLight t1){
		if(t1 == null) return "Error";
		switch (t1){
			case RED:
				return "Stop Now";
			case GREEN:
				return "Go Now";
			case AMBER:
				return "Slow down";
			default:
				return "Error";
		}
	}
}
