package musicApp;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {


		ArrayList<Song> songs = new ArrayList<>();
		songs.add(new Song("deli bile albüm", "hande yener", "11.02.2000", songs, 9.0,"deli bile", 3.0, 6));
		songs.add(new Song("hadi çal  albüm", "derya uluğ", "13.02.2033", songs, 4.0,"hadi çal", 3.0, 6));
		
		ArrayList<Album> albums = new ArrayList<>();
		albums.add(new Album("kol düğmeleri", "barış manço", "14.02.2040", songs, 4.0));
		
		Song song = new Song("sevdalar  albüm", "buray", "13.02.2033", songs, 4.0,"hadi çal", 3.0, 6);
		song.search(songs);
		
		Basket basket =new Basket();
	
		User user = new User(basket,"şeyma nur aksoy");
		user.addUser(user);
		
		basket.add(albums,songs,user);
		basket.basketList(albums,songs);
		
		System.out.println("Sepet Tutarı : "+basket.totalBasket(albums, songs));
		

	}
}
