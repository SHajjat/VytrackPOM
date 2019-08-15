package LinkedList.Challange;

public class Song2 {
	String title;
	double duration;
	public Song2(String title, double duration){
		this.title = title;
		this.duration = duration;
	}
	
	@Override
	public String toString(){
		return this.title + ":"+this.duration;
	}
}
