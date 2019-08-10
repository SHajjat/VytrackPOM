package Generics;

import java.util.ArrayList;

public class Team <T extends Player >  implements Comparable<Team<T>> {
	private String name ;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<T> members = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean addPlayer (T player){
		if (members.contains(player)){
			System.out.println((player).getName()+" is already on the team");
			return false;
		}else{
			members.add(player);
			System.out.println(((Player)player).getName()+" picked for team "+this.name);
			return true;
		}
	}
	public  int numPlayers(){
		return this.members.size();
	}
	public void matchResult(Team <T>opponent, int outScore, int theirScore){
		if(outScore > theirScore){
			won++;
		}else if (outScore<theirScore){
			lost++;
		}else{
			tied++;
		}
		played++;
		if(opponent != null){
			opponent.matchResult(null,theirScore,outScore);
		}
	}
	
	public int ranking(){
		return (won *2)+tied;
	}
	
	
	@Override
	public int compareTo(Team<T> team) {
		if (this.ranking()>team.ranking()){
			return -1;
		}else if (this.ranking()<team.ranking()){
			return 1;
		}else {
			return 0;
		}
	}
}

