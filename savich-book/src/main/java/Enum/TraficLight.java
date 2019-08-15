package Enum;

public enum TraficLight implements java.io.Serializable { // enums cant extend enums or classes but can implement
	// interfaces\
	RED(40, "Stop"), AMBER(5, "Slow Down"), GREEN(60, "Go"); // constant list need to be the first thing in enum
	
	private int duration;
	private String whatToDo;
	
	//TraficLight(){}// the constant are calling the no argument constructor
	TraficLight(int duration, String whatToDo) { // enum constructor
		this.duration = duration;
		this.whatToDo = whatToDo;
		System.out.println("Inside traffic light2 constructor");//constant creation is one time activity
		//the constructor will run once for every constant
	}
	
	
	
	public int getDuration() {
		return duration;
	}
	
	public String getWhatToDo() {
		return whatToDo;
	}
	
	
}
