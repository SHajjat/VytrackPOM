package LinkedList.Challange;

public class Main {
	public static void main(String[] args) {
		Album album = new Album();
		album.addSong(new Song("Sweet Child of mine", 4.34));
		album.addSong(new Song("Bohemian raph", 5.24));
		album.addSong(new Song("t3leelh", 7.5));
		System.out.println(album.playMusic("forward"));
		System.out.println(album.playMusic("forward"));
	}
}
