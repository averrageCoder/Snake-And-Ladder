package com.bridgelabz.sankeandladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		int pos1 = 0, pos2=0,pos,iteration=0;
		
		while(pos1<100 && pos2<100) {
			
			if(iteration%2==0) {
				pos=pos1;
				System.out.println("Player 1's turn who is at: "+pos1);
			}
			else {
				pos=pos2;
				System.out.println("Player 2's turn who is at: "+pos2);
			}
			iteration++;
			
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
			
			if((iteration-1)%2==0)
				pos1=pos;
			else
				pos2=pos;
			
			System.out.println("Current Position of player 1: "+pos1);
			System.out.println("Current Position of player 2: "+pos2+"\n");
			
			if(option==1)
				iteration--;
		}
		
		if(pos1==100)
			System.out.println("PLAYER 1 is WINNER!");
		else
			System.out.println("PLAYER 2 is WINNER!");
		
	}

}
