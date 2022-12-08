package com.day4SnakeLadder;

public class SnakeLadder {

	private static int RandomDieValue() {
		int RandomValue = (int) Math.floor((Math.random()*6)+1);
		return RandomValue;
	}
	
	public static void main(String[] args) {
		
		int playerPosition = 0;
		int numberOnDie = 0;
		System.out.println("Initial position of Player is : " + playerPosition);
		numberOnDie = RandomDieValue();
		System.out.println("Number on die is : " + numberOnDie);
	
	}
}
