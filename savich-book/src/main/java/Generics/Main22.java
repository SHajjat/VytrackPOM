package Generics;

public class Main22 {
	public static void main(String[] args) {
		FootballPlayer1 joe = new FootballPlayer1("joe");
		BaseballPlayer1 pat = new BaseballPlayer1("Pat");
		Generics.SoccerPlayer2 beckham = new Generics.SoccerPlayer2("Beckham");
		Team1<FootballPlayer1> adelaideCrows = new Team1<>("adelaideCrows");
		Team1<FootballPlayer1> footballPlayerTeam = new Team1<>("footballPlayerTeam");
		adelaideCrows.addPlayer(joe);
//		adelaideCrows.addPlayer(pat);
//		adelaideCrows.addPlayer(beckham);
		System.out.println(adelaideCrows.numPlayers());
		
		Team1<BaseballPlayer1> baseballPlayerTeam = new Team1<>("Chicago Cubs");
		baseballPlayerTeam.addPlayer(pat);
		
//		Team<String> brokentTeam = new Team<>("this Wont work");
//		brokentTeam.addPlayer("no-one");
		adelaideCrows.matchResult(footballPlayerTeam,1,0);
		System.out.println("ranking is "+adelaideCrows.ranking());
		System.out.println(adelaideCrows.compareTo(footballPlayerTeam));
		

	}
}
