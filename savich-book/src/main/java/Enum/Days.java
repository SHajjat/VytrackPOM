package Enum;
public class Days{
public enum DayEnum {
	
	SUNDAY("Weekend"),
	MONDAY("Weekday"),
	TUESDAY("Weekday"),
	WEDNESDAY("Weekday"),
	THURSDAY("Weekday"),
	FRIDAY("Weekday"),
	SATURDAY("Weekend");
	String status;
	
	DayEnum(String status) {
		this.status = status;
	}
	public String get(){
		return status;
	}
	
	
	public static void main(String[] args) {
		DayEnum [] days = DayEnum.values();
		for( DayEnum day : days){
			System.out.println(day + " : "+ day.status);
		}
	}
}


}
