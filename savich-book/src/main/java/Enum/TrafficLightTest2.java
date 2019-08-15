package Enum;

public class TrafficLightTest2 {
	public static void main(String[] args) {
		System.out.println(TraficLight.GREEN);
		
		TraficLight [] traffic = TraficLight.values();
		
		for (TraficLight t1 : traffic){
			System.out.println(t1.toString()+ " : "+t1.getDuration());
		}
		
		
		System.out.println(TraficLight.RED.getWhatToDo());
		System.out.println(TraficLight.AMBER.getWhatToDo());
		System.out.println(TraficLight.GREEN.getWhatToDo());
		
		for (TraficLight tr :traffic){
			System.out.println(tr.toString()+" : "+tr.getDuration()+" : "+tr.getWhatToDo());
		}
	
	}
}
