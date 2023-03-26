package musicApp;

import java.util.ArrayList;
import java.util.Date;

public class Album {
	
	private String albumName;
	private String artistName;
	private String releaseDate;
	private ArrayList<Song> songs;
	private double albumPrice;
	
	public Album(String albumName, String artistName, String releaseDate, ArrayList<Song> songs, double albumPrice) {
		super();
		this.albumName = albumName;
		this.artistName = artistName;
		this.releaseDate = releaseDate;
		this.songs = songs;
		this.albumPrice = albumPrice;
	}
	public Album() {}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public ArrayList<Song> getSongs() {
		return songs;
	}
	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
	public double getAlbumPrice() {
		return albumPrice;
	}
	public void setAlbumPrice(double albumPrice) {
		this.albumPrice = albumPrice;
	}
	
	
	

}
