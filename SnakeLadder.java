package com.SnakeLadder;

public class SnakeLadder 
{
	static int position=0;
	public static void main(String[] args) 
	{
		System.out.println("Welcome to SnakeLadder Problem");
		System.out.println("Welcome to Player");
//		int number=(int) ((Math.random()*6)+1);
//		System.out.println("num you recieved==>" +number);
	
		int choice=(int) ((Math.random()*3)+1);
		switch(choice)
		{
		case 1:
			System.out.println("Ladder is here");
			int num=(int) (Math.random()*6)+1;
			System.out.println("Number you received==>" +num);
			position=position+num;
			break;
		case 2:
			System.out.println("Snake is here");
			int num1=(int) (Math.random()*6)+1;
			System.out.println("Number you received==>" +num1);
			if(position<0)
				position=1;
			else
				position=position-num1;
			if(position==0)
				position=0;
			break;
		default:
			System.out.println("no switch");
			break;
			
		
		}
		
	}

}

