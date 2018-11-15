package com.training.Entity;

public class Player {
	int playerId;
	String playerName;
	int noOfMatches;
	int totalRunScore;
	int noOfWickets;
	boolean captain;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	public int getTotalRunScore() {
		return totalRunScore;
	}

	public void setTotalRunScore(int totalRunScore) {
		this.totalRunScore = totalRunScore;
	}

	public int getNoOfWickets() {
		return noOfWickets;
	}

	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}

	public boolean isCaptain() {
		return captain;
	}

	public void setCaptain(boolean captain) {
		this.captain = captain;
	}

	public Player(int playerId, String playerName, int noOfMatches,
			int totalRunScore, int noOfWickets, boolean captain) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.noOfMatches = noOfMatches;
		this.totalRunScore = totalRunScore;
		this.noOfWickets = noOfWickets;
		this.captain = captain;
	}

	public Player() {
		super();
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName
				+ ", noOfMatches=" + noOfMatches + ", totalRunScore="
				+ totalRunScore + ", noOfWickets=" + noOfWickets + ", captain="
				+ captain + "]";
	}

	public String getBatingRating() {
		double avg = this.totalRunScore / this.noOfMatches;
		if (avg > 90) {
			return "Best";
		} else if (avg >= 50) {
			return "Good";
		} else if (avg >= 25) {
			return "Average";
		} else {
			return "poor";
		}
	}
	
	public String getBowlingRating() {
		double avg = this.noOfWickets / this.noOfMatches;
		if (avg > 90) {
			return "Best";
		} else if (avg >= 50) {
			return "Good";
		} else if (avg >= 25) {
			return "Average";
		} else {
			return "poor";
		}
	}

}
