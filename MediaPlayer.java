package day6;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {	
	public void playList(List<? extends Media> list)
	{
//		list.add(new Video());
		for(Media m : list)
		{
			m.play();
		}
	}
	public static void main(String[] args) {
		List<Song> songlist = new ArrayList<>();
		songlist.add(new Song(3434, "sssd"));
		songlist.add(new Song(657, "pifiey"));
		
		MediaPlayer player = new MediaPlayer();
		player.playList(songlist);
	}
}
