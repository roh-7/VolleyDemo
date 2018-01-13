package in.example.android.volleydemo;

/**
 * Created by rohitramaswamy on 13/01/18.
 */

public class Song
{
	String name,artist;
	
	public Song(String name, String artist)
	{
		this.name = name;
		this.artist = artist;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public void setArtist(String artist)
	{
		this.artist = artist;
	}
}
