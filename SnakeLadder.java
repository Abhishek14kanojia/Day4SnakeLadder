package com.day4SnakeLadder;
public class SnakeLadder {
	public static final int NO_Play = 0;
	public static final int Ladder = 1;
	public static final int Snake = 2;
	
	private static int RandomOption() {
		int RandomOption = (int) Math.floor((Math.random()*3));
		return RandomOption;
	}
	
	private static int RandomDieValue() {
		int RandomDieValue = (int) Math.floor((Math.random()*6)+1);
		return RandomDieValue;
	}
	
	public static void main(String[] args) {
		
		int playerPosition = 0;
		int numberOnDie = 0;
		System.out.println("Initial position of Player is : " + playerPosition);
		numberOnDie = RandomDieValue();
		System.out.println("Number on die is : " + numberOnDie);
		int option = RandomOption();
		System.out.println("The Option is : " + option);
		
		switch(option) {
		case Ladder:
			playerPosition += numberOnDie;
			break;
		case Snake:
			playerPosition += numberOnDie;
			break;
		default:
			System.out.println("No Play");
		}
		System.out.println(playerPosition);
		
	}
}
