package com.fil.multi_threading;

import java.util.List;

public class Playlist {
	
	List<String> songs;
	private boolean flag = false;
	int count = 0;
	
	public Playlist(List<String> songs) {
		super();
		this.songs = songs;
	}

	synchronized public String readSong() {
		
		if ( flag ) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		String song = songs.get(count);
		flag = true;
		count++;
		return song;
		
	}
	
	synchronized public void addSong(String args) {
		
		
		
	}
	
	
	

}
