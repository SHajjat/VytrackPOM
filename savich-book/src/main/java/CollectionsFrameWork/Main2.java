package CollectionsFrameWork;

public class Main2 {
	public static void main(String[] args) {
		CollectionsFrameWork.Theatre2 theatre = new CollectionsFrameWork.Theatre2("Olympia",8,12);
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
