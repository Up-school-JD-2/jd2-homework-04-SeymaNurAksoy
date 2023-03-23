package musicApp;

import java.util.ArrayList;
import java.util.Date;

public class Album {
	
	public String albumName;
	public String artistName;
	public String releaseDate;
	public ArrayList<Song> songs;
	public double albumPrice;
	
	public Album(String albumName, String artistName, String releaseDate, ArrayList<Song> songs, double albumPrice) {
		super();
		this.albumName = albumName;
		this.artistName = artistName;
		this.releaseDate = releaseDate;
		this.songs = songs;
		this.albumPrice = albumPrice;
	}
	public Album() {}
	
	

}
