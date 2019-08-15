package Enum;

public class DayTest {
	public static void main(String[] args) {
		Day d1 =Day.valueOf("SUNDAY");
		System.out.println(d1);
		
		Day [] day = Day.values();
		
		for (Day daynow : day){
			System.out.println(daynow + " : "+daynow.ordinal());
		}
		Day day1 = Day.MONDAY;
		Day day2 = Day.MONDAY;
		Day day3 = Day.FRIDAY;
		
		System.out.println(day1 == day2);
		System.out.println(day1 == day3);
		
		System.out.println(day1.equals(day2));
		System.out.println(day1.equals(day3));
		
		
		System.out.println(day1.compareTo(day2));// day1.ordinal() - day2.ordinal() =1-1 = 0
		System.out.println(day1.compareTo(day3));//day1.ordinal() - day3.oridnal() =1-5 = 4
		System.out.println(day3.compareTo(day1));//day3.ordinal() - day1.ordinal = 5-1 = 4
		
		
		
	}
}
