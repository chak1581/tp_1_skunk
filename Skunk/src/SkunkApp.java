
	import java.util.Random;
	import java.util.Scanner;

	public class SkunkApp {

		public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);
			int chip = 50;
			int score = 0;

			System.out.println("************Welcome to Skunk Game*************");
			System.out.print("Please enter how many players: ");
			int player = reader.nextInt();
			int[] diceArr1 = { 1, 2, 3, 4, 5, 6 };// 1 represent skunk
			int[] diceArr2 = { 1, 2, 3, 4, 5, 6 };// 1 represent skunk
			while (player >= 2) {
				Random r = new Random();
				int r1 = (diceArr1[new Random().nextInt(diceArr1.length)]);
				int r2 = (diceArr2[new Random().nextInt(diceArr2.length)]);
				if (r1 > 1 && r2 > 1) {
					System.out.println("You got from Dice1: " + r1);
					System.out.println("You got from Dice2: " + r2);
				} else if (r1 > 1 && r2 == 1) {
					System.out.println("You got 0 point from this round");
				}

			}
		}
	}

	
	
	

