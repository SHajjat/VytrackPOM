package CollectionsFrameWork;

public class Main {
	public static void main(String[] args) {
		Theatre theatre = new Theatre("Olympia",8,12);
		//theatre.getSeats();
		if(theatre.reserveSeat("H11")){
			System.out.println("please pay");
		}else {
			System.out.println("Sorry, seat is taking Mate");
		}
		if(theatre.reserveSeat("H11")){
			System.out.println("please pay");
		}else {
			System.out.println("Sorry, seat is taking Mate");
		}
	}
}
