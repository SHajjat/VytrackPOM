package LinkedList.Challange;

public class Song {
	String title;
	double duration;
	public Song(String title, double duration){
		this.title = title;
		this.duration = duration;
	}
	
	@Override
	public String toString(){
		return this.title + ":"+this.duration;
	}
}
