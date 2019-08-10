package LinkedList.Challange;

import java.util.*;

public class Album {
	boolean forward = true;
	List<Song> album = new LinkedList<>();
	
	public boolean addSong(Song song){
		return album.add(song);
	}
	
	public String playMusic(String direction){
		ListIterator <Song> player = album.listIterator();
		
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

