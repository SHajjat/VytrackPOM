package LinkedList.Challange;

import java.util.*;

public class Album {
	boolean forward = true;
	List<LinkedList.Challange.Song2> album = new LinkedList<>();
	
	public boolean addSong(LinkedList.Challange.Song2 song){
		return album.add(song);
	}
	
	public String playMusic(String direction){
		ListIterator <LinkedList.Challange.Song2> player = album.listIterator();
		
		switch (direction.toLowerCase()){
			case "quite":
				return "Quiting";
				
			case "forward":
				if(player.hasNext()){
					if(forward) { return player.next().title;
					}else{
						player.next();
						forward = true;
						return player.next().title;
					}
				}else{ return "you are at the end of the Album"; }
			case "backward":
				if(player.hasPrevious()){
					if(!forward){ player.previous();
					}else{
						player.previous();
						forward =false;
						return player.previous().title;
					}
					
					}else{ return "You are at the beginning of the album"; }
			case "replay":
				if(player.hasPrevious()){
					return player.previous().title;
				}else{
					return "Play song first";
				}
			case "remove":
			if(player.hasPrevious()){
				player.remove();
				return "Song Removed";
			}
			default:
				return "invalid entery";
		}
		
	
	}
	
}

