package com.it.pradhan.beans;

public class Players {
	
	private int uniquePlayerNo;
	private String playersName;
	
	public int getUniquePlayerNo() {
		return uniquePlayerNo;
	}
	public void setUniquePlayerNo(int uniquePlayerNo) {
		this.uniquePlayerNo = uniquePlayerNo;
	}
	public String getPlayersName() {
		return playersName;
	}
	public void setPlayersName(String playersName) {
		this.playersName = playersName;
	}
	@Override
	public String toString() {
		return "Players [uniquePlayerNo=" + uniquePlayerNo + ", playersName=" + playersName + "]";
	}
	
	

}
