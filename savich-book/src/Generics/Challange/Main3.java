package Generics.Challange;

public class Main3 {
	public static void main(String[] args) {
		Team <FootballPlayer> barcha = new Team("Barcha");
		Team <FootballPlayer> ramthaCity = new Team("Ramtha City");
		Team <BasketBallPlayer> miami = new Team("miami");
		barcha.addPlayer(new FootballPlayer("messi",26,500000,11));
		barcha.addPlayer(new FootballPlayer("Suárez",30,60000,11));
		barcha.addPlayer(new FootballPlayer("Malcom",25,90000,11));
		barcha.addPlayer(new FootballPlayer("Gomes",25,90000,11));
		barcha.addPlayer(new FootballPlayer("Alcacer",25,90000,11));
		barcha.addPlayer(new FootballPlayer("Stegen",25,90000,11));
		barcha.addPlayer(new FootballPlayer("Cillessen",25,90000,11));
		barcha.addPlayer(new FootballPlayer("Marlon",25,90000,11));
		barcha.addPlayer(new FootballPlayer("Mina",25,90000,11));
		barcha.addPlayer(new FootballPlayer("Vermaelen",25,90000,11));
		barcha.addPlayer(new FootballPlayer("Alba",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer("ahmad",26,500000,11));
		ramthaCity.addPlayer(new FootballPlayer("Mohammad",30,60000,11));
		ramthaCity.addPlayer(new FootballPlayer("Sulaiman",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer("mthat",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer("Samiranov",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer("Dina",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer("Orhan",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer("abduallah",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer("mustafa",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer("not mustafa",25,90000,11));
		ramthaCity.addPlayer(new FootballPlayer("Alba",25,90000,11));
		
		
		BasketBallPlayer michael = new BasketBallPlayer("Michael",50,324234,10);
		
		
		
	}
}

