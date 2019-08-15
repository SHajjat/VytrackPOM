package Generics.Challange;

import java.util.LinkedList;
import java.util.List;

class Team<T extends Generics.Challange.Player2> {
	String teamName;
	int played = 0;
	public int won = 0;
	int lost = 0;
	int tied = 0;
	int teamSize = getTeamSize();
	
	public int getWon() {
		return won;
	}
	
	public int getLost() {
		return lost;
	}
	
	
	
	
	List<T> team = new LinkedList<>();
	
	public Team(String teamName) {
		this.teamName = teamName;
	}
	
	public boolean addPlayer(T player) {
		if ( !team.contains(player) ) {
			if ( player instanceof BasketBallPlayer1 && teamSize <= 5 ) {
				team.add(player);
				return true;
			}else if ( player instanceof Generics.Challange.FootballPlayer2 && teamSize <= 11 ) {
				team.add(player);
				return true;
			} else {
				System.out.println("No empty spots please remove players");
				return false;
			}
		} else {
			System.out.println("player is already in the team");
			return false;
		}
		
	}
	public int getTeamSize(){
		return team.size();
	}
	
	public boolean removePlayer (T player){
		return team.remove(player);
		
	}
	
	public void match(Team opponent, int ourScore, int theirScore) {
		if ( ourScore > theirScore ) { won++; } else if ( ourScore < theirScore ) { lost++; } else { tied++; }
		if ( opponent != null ) { match(opponent, theirScore, ourScore); }
		played++;
	}
	
	
}
