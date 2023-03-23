package musicApp;

import java.util.ArrayList;

public class Basket {
	
	public  ArrayList<Album> albums =new ArrayList<>();
	public ArrayList<Song> songs=new ArrayList<>();
	
	public void add(ArrayList<Album> addAlbums,ArrayList<Song> addSongs,User user) {
		
		System.out.println("Sepet  ile ilişkilendirilen kullanıcımız:" +user.userFullName );
		for (Song song : addSongs) {
			songs.add(song);
		}
		for (Album album : addAlbums) {
			albums.add(album);
		}
		System.out.println("Sepete Eklendi 🛍");
		 
	}
	public double  totalBasket(ArrayList<Album> albums, ArrayList<Song> songs) {
		double totalPriceSong=0;
		double totalPriceAlbum=0;

		for (Song song : songs) {
			totalPriceSong=song.songPrice+totalPriceSong;
		}
		for (Album album : albums) {
			totalPriceAlbum=album.albumPrice+totalPriceAlbum;
		}	
		return totalPriceAlbum+totalPriceSong;
	}
	
	public void basketList(ArrayList<Album> albums, ArrayList<Song> songs) {
		
		System.out.println("🎵 Satın Alınan Şarkılar");
		
		for (Song song : songs) {
			System.out.println("Şarkı ismi:" + song.songName + " Şarkının Bulunduğu Albüm: "+song.albumName +
					"Şarkının uzunluğu: "+ song.length+" dk "+ "Ücreti: "+song.songPrice );
		}
		System.out.println("🎵 Satın Alınan Albümler");
		for (Album album : albums) {
			System.out.println("Albüm ismi: "+album.albumName+ " Albüm ücreti: "+album.albumPrice);
		}
	}
	
	

}
