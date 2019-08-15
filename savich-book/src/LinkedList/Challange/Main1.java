package LinkedList.Challange;

public class Main1 {
	public static void main(String[] args) {
		LinkedList.Challange.Album album = new LinkedList.Challange.Album();
		album.addSong(new LinkedList.Challange.Song2("Sweet Child of mine", 4.34));
		album.addSong(new LinkedList.Challange.Song2("Bohemian raph", 5.24));
		album.addSong(new LinkedList.Challange.Song2("t3leelh", 7.5));
		System.out.println(album.playMusic("forward"));
		System.out.println(album.playMusic("forward"));
	}
}
