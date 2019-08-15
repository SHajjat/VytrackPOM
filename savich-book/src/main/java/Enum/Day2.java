package Enum;

public enum Day2 {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY{
		@Override
		public String getMessage(){
			return "WEEKEND";
		}
	},
	SUNDAY{
		@Override
		public String getMessage(){
		return "WEEKEND";
	}};
	
	public String getMessage(){
		return "WEEKDAY";
	}
	
}
class test{
	public static void main(String[] args) {
		Day2 [] daysOfOurLife = Day2.values();
		for(Day2 daynow : daysOfOurLife){
			System.out.println(daynow + " : "+daynow.getMessage());
		}
	}
}
