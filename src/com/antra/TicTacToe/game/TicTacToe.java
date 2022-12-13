package com.antra.TicTacToe.game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
	static String[]board;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String turn="X";
		String winner=null;
		String[] board=new String[9];
		for(int i =0;i<9;i++) {
			board[i]=String.valueOf(i+1);
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("      Welcom to Tic Tac Toe      ");
		System.out.println("+++++++++++++++++++++++++++++++++");
		Board.plybord(board);
		System.out.println("X's will play first.Enter a slot number to place X in:");
		while(winner == null) {
			int numinput;
			try {
				numinput=in.nextInt();
				if(!(numinput>0 && numinput<10)) {
					System.out.println("Invelid input-re-enter the slot no-");
					continue;
				}
			}
				catch(InputMismatchException x){
					System.out.println("Invelid input-re-enter the slot no-");
					continue;
				}
			if(board[numinput-1].equals(String.valueOf(numinput))) {
				board[numinput-1]=turn;
				if(turn.equals("X")) {
					turn= "0";
				}
				else {
					turn ="X";
				}
				Board.plybord(board);
				winner=Winner.checkwinner(board, turn);
			}
			else {
				System.out.println("slot already taken re-enter the slot no-");
				continue;
			}
			}
		if(winner.equalsIgnoreCase("draw")) {
			System.out.println("it's draw ! Thanks for playing .");
		}
		else {
			System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
		}
		in.close();
		}
	}
