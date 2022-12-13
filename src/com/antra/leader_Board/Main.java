package com.antra.leader_Board;

public class Main {
	private static Leader_BoardDb lb = new Leader_BoardDb();

	public static void executeOpertion(String code) {
		switch (code) {
		case "UPSET_USER":
			lb.add_User(new User("Pankj", "pk123@gmail.com", "India"));
			break;
		case "UPSET_USER1":
			lb.add_User(new User("Ajya", "aj123@gmail.com", "Florida"));
			break;
		case "UPSET_USER2":
			lb.add_User(new User("Samar", "sm123@gmail.com", "Carlifornia"));
			break;
		case "UPSET_USER3":
			lb.add_User(new User("Sanjya", "sj123@gmail.com", "Miami"));
			break;
		case "UPSET_SCORE":
			lb.upset_Score(552, "pk123@gmail.com");
			break;
		case "GIVN_SCORE":
			lb.getUser_Score(100);
			break;
		case "SRCH_USER":
			lb.search_User("samar", 100, "India");
			break;
		case "TOP_SCORE":
			lb.top_Scorer(300, "India");
			break;
		}

	}

	public static void main(String[] args) {
		Main.executeOpertion("UPSET_USER");
		Main.executeOpertion("UPSET_USER1");
		Main.executeOpertion("UPSET_USER2");
		Main.executeOpertion("UPSET_USER3");
		Main.executeOpertion("GIVN_SCORE");
		
//		Main.executeOpertion("UPSET_SCORE");
		Main.executeOpertion("SRCH_USER");
		Main.executeOpertion("TOP_SCORE");
		lb.user();

	}

}
