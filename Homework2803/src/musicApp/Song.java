package musicApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Song extends Album {
	
	private String songName;
	private double length;
	private double songPrice;

	
	public Song(String albumName, String artistName, String releaseDate, ArrayList<Song> songs, double albumPrice,
			String songName, double length, double songPrice) {
		super(albumName, artistName, releaseDate, songs, albumPrice);
		this.songName = songName;
		this.length = length;
		this.songPrice = songPrice;
	}


	public Song(String songName, double length, double songPrice) {
	    super();
		this.songName = songName;
		this.length = length;
		this.songPrice = songPrice;
	}

	public void search(ArrayList<Song> songs) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		for (Song song : songs) {
			names.add(song.songName);
		}
		System.out.println("Aramak istediğiniz şarkı ismini giriniz");
		String searchSongName=scan.nextLine().toLowerCase();
		boolean result = names.contains(searchSongName);
		if(result) {
			System.out.println("Aradığınız şarkı  vardır");
		}else {
			System.out.println("Aradığınız şarkı yoktur.");
		}
		
	}


	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		this.songName = songName;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getSongPrice() {
		return songPrice;
	}


	public void setSongPrice(double songPrice) {
		this.songPrice = songPrice;
	}
	

	
}
