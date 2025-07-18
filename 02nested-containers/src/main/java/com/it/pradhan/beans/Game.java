package com.it.pradhan.beans;

public class Game {
	private String name;
	private Players players;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Players getPlayers() {
		return players;
	}
	public void setPlayers(Players players) {
		this.players = players;
	}
	@Override
	public String toString() {
		return "Game [name=" + name + ", players=" + players + "]";
	}
	
	

}
