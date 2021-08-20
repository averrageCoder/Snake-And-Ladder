package com.bridgelabz.sankeandladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		int pos = 0;
		int dice = (int) Math.floor(Math.random()*100)%6+1;
		System.out.println("Dice Rolled : "+dice);
		pos+=dice;
		System.out.println("Current Position : "+pos);

	}

}
