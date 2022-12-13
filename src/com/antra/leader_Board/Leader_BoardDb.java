package com.antra.leader_Board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Leader_BoardDb {
	private List<User> lst = new ArrayList<>();

	public void add_User(User user) {
		for (int i = 0; i < lst.size(); i++) {
			if (lst.get(i).getEmail().equals(user.getEmail())) {
				lst.set(i, user);
				break;
			}
			else {
				lst.add(user);
				break;
			}
		}
	}

	public void upset_Score(int score, String email) {
		User user = lst.stream().filter((u) -> u.getEmail().equals(email)).findFirst().get();
		user.upset_Score(score);
	}

	public List<User> getUser_Score(int score) {
		return lst.stream().filter((u) -> u.getScore() == score).collect(Collectors.toList());
	}

	public List<User> search_User(String name, int score, String country) {
		List<User> users = null;
		users = lst.stream().filter((u) -> u.getName().equals(name)).filter((u) -> u.getScore() == score)
				.filter((u) -> u.getCountry().equals(country)).collect(Collectors.toList());
		return users;
	}

	public List<User> top_Scorer(int top, String Country) {
		List<User> lst1 = null;
		Collections.sort(lst, (u1, u2) -> u2.getScore() - u1.getScore());
		lst1 = lst.stream().filter((u) -> u.getCountry().equals(Country)).limit(top).collect(Collectors.toList());
		return lst1;
	}
	public void user() {
		System.out.println(lst);
	}
}
