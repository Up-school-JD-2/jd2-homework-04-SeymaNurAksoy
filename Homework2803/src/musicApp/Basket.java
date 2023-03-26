package musicApp;

import java.util.ArrayList;

public class Basket {
	
	public  ArrayList<Album> albums =new ArrayList<>();
	public ArrayList<Song> songs=new ArrayList<>();
	
	public void add(ArrayList<Album> addAlbums,ArrayList<Song> addSongs,User user) {
		
		System.out.println("Sepet  ile ilişkilendirilen kullanıcımız:" +user.getUserFullName() );
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
			totalPriceSong=song.getSongPrice()+totalPriceSong;
		}
		for (Album album : albums) {
			totalPriceAlbum=album.getAlbumPrice()+totalPriceAlbum;
		}	
		return totalPriceAlbum+totalPriceSong;
	}
	
	public void basketList(ArrayList<Album> albums, ArrayList<Song> songs) {
		
		System.out.println("🎵 Satın Alınan Şarkılar");
		
		for (Song song : songs) {
			System.out.println("Şarkı ismi:" + song.getSongName() + " Şarkının Bulunduğu Albüm: "+song.getAlbumName() +
					"Şarkının uzunluğu: "+ song.getLength()+" dk "+ "Ücreti: "+song.getSongPrice());
		}
		System.out.println("🎵 Satın Alınan Albümler");
		for (Album album : albums) {
			System.out.println("Albüm ismi: "+album.getAlbumName()+ " Albüm ücreti: "+album.getAlbumPrice());
		}
	}
	
	

}
