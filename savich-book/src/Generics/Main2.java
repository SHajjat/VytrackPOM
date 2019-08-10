package Generics;

public class Main2 {
	public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		Team <FootballPlayer>adelaideCrows = new Team <>("adelaideCrows");
		Team <FootballPlayer> footballPlayerTeam = new Team <>("footballPlayerTeam");
		adelaideCrows.addPlayer(joe);
//		adelaideCrows.addPlayer(pat);
//		adelaideCrows.addPlayer(beckham);
		System.out.println(adelaideCrows.numPlayers());
		
		Team <BaseballPlayer>  baseballPlayerTeam = new Team<>("Chicago Cubs");
		baseballPlayerTeam.addPlayer(pat);
		
//		Team<String> brokentTeam = new Team<>("this Wont work");
//		brokentTeam.addPlayer("no-one");
		adelaideCrows.matchResult(footballPlayerTeam,1,0);
		System.out.println("ranking is "+adelaideCrows.ranking());
		System.out.println(adelaideCrows.compareTo(footballPlayerTeam));
		

	}
}
