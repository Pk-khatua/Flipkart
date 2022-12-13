package com.antra.leader_Board;

public class User {
	String name;
	String email;
	String country;
	int score;

	public User(String name, String email, String country) {
		this.name = name;
		this.email = email;
		this.country = country;
		this.score = 0;
	}

	public void upset_Score(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getCountry() {
		return country;
	}

	public int getScore() {
		return score;
	}

}
