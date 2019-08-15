package Generics.Challange;

public class Main3 {
	public static void main(String[] args) {
		Team <FootballPlayer2> barcha = new Team("Barcha");
		Team <FootballPlayer2> ramthaCity = new Team("Ramtha City");
		Team <BasketBallPlayer1> miami = new Team("miami");
		barcha.addPlayer(new FootballPlayer2("messi",26,500000,11));
		barcha.addPlayer(new FootballPlayer2("Suárez",30,60000,11));
		barcha.addPlayer(new FootballPlayer2("Malcom",25,90000,11));
		barcha.addPlayer(new FootballPlayer2("Gomes",25,90000,11));
		barcha.addPlayer(new FootballPlayer2("Alcacer",25,90000,11));
		barcha.addPlayer(new FootballPlayer2("Stegen",25,90000,11));
		barcha.addPlayer(new FootballPlayer2("Cillessen",25,90000,11));
		barcha.addPlayer(new FootballPlayer2("Marlon",25,90000,11));
		barcha.addPlayer(new FootballPlayer2("Mina",25,90000,11));
		barcha.addPlayer(new FootballPlayer2("Vermaelen",25,90000,11));
		barcha.addPlayer(new FootballPlayer2("Alba",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer2("ahmad",26,500000,11));
		ramthaCity.addPlayer(new FootballPlayer2("Mohammad",30,60000,11));
		ramthaCity.addPlayer(new FootballPlayer2("Sulaiman",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer2("mthat",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer2("Samiranov",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer2("Dina",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer2("Orhan",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer2("abduallah",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer2("mustafa",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer2("not mustafa",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer2("Alba",25,90000,11));
		
		
		BasketBallPlayer1 michael = new BasketBallPlayer1("Michael",50,324234,10);
		
		
		
	}
}

