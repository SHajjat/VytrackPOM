package LinkedList.Challange;

public class Main {
	public static void main(String[] args) {
		Album album = new Album();
		album.addSong(new Song2("Sweet Child of mine", 4.34));
		album.addSong(new Song2("Bohemian raph", 5.24));
		album.addSong(new Song2("t3leelh", 7.5));
		System.out.println(album.playMusic("forward"));
		System.out.println(album.playMusic("forward"));
	}
}
