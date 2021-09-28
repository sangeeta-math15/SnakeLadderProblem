package com.SnakeLadder;

public class SnakeLadder {
	static int position = 0;
	static int new_position = 0;
	static int number = 0;
	static int counter = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to SnakeLadder Problem");
		System.out.println("Welcome to Player");
//		int number=(int) ((Math.random()*6)+1);
//		System.out.println("num you recieved==>" +number);
		while (position < 100) {
			int choice = (int) ((Math.random() * 3) + 1);
			switch (choice) {
			case 1:
				System.out.println("Ladder is here");
				int number = (int) (Math.random() * 6) + 1;
				System.out.println("Number you received==>" + number);
				position = position + number;
				if (position > 100) {
					position = position - number;

				}
				counter++;

				break;
			case 2:
				System.out.println("Snake is here");
				number = (int) (Math.random() * 6) + 1;
				System.out.println("Number you received==>" + number);
				if (position == 0) {
					position = 0;
				} else {
					position = position - number;
				}
				if (position < 0) {
					position = 0;
				}
				counter++;
				break;
			default:
				System.out.println("no switch");
				break;

			}
			System.out.println("you are on the position==>" + position);
			System.out.println();
		}

		System.out.println("you are now reached at the position==>" + position);
		System.out.println();

		if (position > 100)

		{
			// int counter=0;
			int choice2 = 0; // die rolled
			// save the position to new position i.e 95 old save to new position=95
			new_position = position - number;
			int number_need = new_position - 100;
			System.out.println("you are  :" + new_position);
			System.out.println("you are need :" + number_need);
			int choice1 = (int) (Math.random() * 3) + 1;
			System.out.println("you ar get number:" + choice1);
			if (choice1 != number_need) {
				// roll the dice
				choice2 = (int) (Math.random() * 3) + 1;
				while (choice1 == choice2) {
					choice2 = (int) (Math.random() * 3) + 1;
					System.out.println("you ar getting number:" + choice2);
					if (number_need == choice2) {
						System.out.println("you are win");
						System.out.println("you ar getting number:" + choice2);
						break;
					} else

						continue;

				}
			}
		}

		System.out.println("you are win");
		System.out.println("you are win and counter is==>" + counter);
	}

}
