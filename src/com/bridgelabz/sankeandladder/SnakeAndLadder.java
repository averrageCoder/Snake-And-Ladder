package com.bridgelabz.sankeandladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		int pos = 0;
		
		while(pos<100) {
			
			int dice = (int) Math.floor(Math.random()*100)%6+1;
			int option = (int) Math.floor(Math.random()*100)%3;
			
			switch(option) {
			
			case 0: 
				System.out.println("NO PLAY!");
				break;
				
			case 1:
				System.out.println("HURRAY! - LADDER!");
				pos+=dice;
				if(pos>100)
					pos-=dice;
				break;
				
			case 2:
				System.out.println("OOPS! - SNAKE!");
				pos-=dice;
				if(pos<0)
					pos=0;
				break;
			
			}
			System.out.println("Dice Rolled : "+dice);
			System.out.println("Current Position : "+pos);
			
		}
		
		System.out.println("WINNER!");
		
	}

}
