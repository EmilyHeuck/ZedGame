import java.util.Random;
import java.util.Scanner;

public class InTheCapital {

	private LevelManager levelManager;
	private Player player;

	public void PlayerStats(LevelManager lm, Player p) {
		levelManager = lm;
		player = p;
		doTraining();
	}

	private void doTraining() {
		intelligenceTraning();
		agilityTraining();
		strengthTraining();

	}

	private void agilityTraining() {
		long startTime = 0;
		long elapsedTime = 0;
		Scanner keyboard = new Scanner(System.in);
		float totalDiff = 0;
		float timeDiff = 0;

		// print message regarding the agility training
		// tell them to press enter to start then press again to stop
		// closest to the goal is better
		System.out.println("Begin Training. Second activity: Agility");
		System.out.println("Press enter to start and stop a timer.");
		System.out.println("There are 5 rounds, good luck!");

		System.out
				.println("Round 1, try to be as close to 3 seconds as possible!");
		System.out.println("Press enter...");
		keyboard.nextLine();
		startTime = System.currentTimeMillis();
		keyboard.nextLine();
		elapsedTime = System.currentTimeMillis() - startTime;
		timeDiff = (float) elapsedTime - 3000;
		totalDiff += timeDiff;
		System.out.println("You were off by: " + timeDiff / 1000 + " seconds");

		System.out
				.println("Round 2, try to be as close to 5 seconds as possible!");
		System.out.println("Press enter...");
		keyboard.nextLine();
		startTime = System.currentTimeMillis();
		keyboard.nextLine();
		elapsedTime = System.currentTimeMillis() - startTime;
		timeDiff = (float) elapsedTime - 5000;
		totalDiff += timeDiff;
		System.out.println("You were off by: " + timeDiff / 1000 + " seconds");

		System.out
				.println("Round 3, try to be as close to 7 seconds as possible!");
		System.out.println("Press enter...");
		keyboard.nextLine();
		startTime = System.currentTimeMillis();
		keyboard.nextLine();
		elapsedTime = System.currentTimeMillis() - startTime;
		timeDiff = (float) elapsedTime - 7000;
		totalDiff += timeDiff;
		System.out.println("You were off by: " + timeDiff / 1000 + " seconds");

		System.out
				.println("Round 4, try to be as close to 9 seconds as possible!");
		System.out.println("Press enter...");
		keyboard.nextLine();
		startTime = System.currentTimeMillis();
		keyboard.nextLine();
		elapsedTime = System.currentTimeMillis() - startTime;
		timeDiff = (float) elapsedTime - 9000;
		totalDiff += timeDiff;
		System.out.println("You were off by: " + timeDiff / 1000 + " seconds");

		System.out
				.println("Final round, try to be as close to 20 seconds as possible!");
		System.out.println("Press enter...");
		keyboard.nextLine();
		startTime = System.currentTimeMillis();
		keyboard.nextLine();
		elapsedTime = System.currentTimeMillis() - startTime;
		timeDiff = (float) elapsedTime - 20000;
		totalDiff += timeDiff;
		System.out.println("You were off by: " + timeDiff / 1000 + " seconds");

		System.out.println("Agility training complete.");
		System.out.println("Your total time difference is: " + totalDiff / 1000
				+ "seconds.");

		if (totalDiff / 1000 > 5) {
			System.out.println("Your agaility level is 2.");
			player.agility = 2;
		} else if (totalDiff / 1000 > 3) {
			System.out.println("Your agaility level is 4.");
			player.agility = 4;
		} else if (totalDiff / 1000 > 1) {
			System.out.println("Your agaility level is 6.");
			player.agility = 6;
		} else {
			System.out.println("Your agaility level is 10.");
			player.agility = 10;
		}

	}

	private void strengthTraining() {
		System.out.println("Begin training. Last activity: Strength");
		System.out
				.println("guess the number. It can be any number between 1 and 1000.");

		int secretNumber = (int) (Math.random() * 999 + 1);
		int numberOfGuesses = 0;

		Scanner keyboard = new Scanner(System.in);
		int guess = -1;

		while (guess != secretNumber) {
			System.out.print("Enter guess: ");
			guess = keyboard.nextInt();

			numberOfGuesses++;

			// check if guess is correct and print message

			// if smaller, print smaller message
			if (guess > secretNumber) {
				System.out.println("Try a smaller one.");

			}

			if (guess < secretNumber) {
				System.out.println("Try a bigger one.");

			}
			// if larger, print larger message

			if (guess == secretNumber) {
				System.out.println("Correct! Strength training complete.");
			}
		}

		if (numberOfGuesses > 15) {
			System.out.println("You are weak.");
			player.strength = 2;
		} else if (numberOfGuesses > 10) {
			System.out.println("Average Strength.");
			player.strength = 6;
		} else {
			System.out.println("Superhuman!");
			player.strength = 10;
		}

	}

	private void intelligenceTraning() {
		int choice;
		int score = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out
				.println("When you finally reach the capitol you are prepared for the tribute parade.");
		System.out
				.println("After the parade you dive into the trainig courses.");
		System.out
				.println("The training activities are for: Intelligence, Strength, and Agility.");

		System.out.println(" ");
		System.out.println("Begin training. First activity: Intelligence");
		System.out.println("Identify if the object is edible or inedible");
		System.out.println("Choose 1 for edible, 2 for inedible.");
		System.out.println("Nightshade: ");
		choice = keyboard.nextInt();
		
		if (choice == 1) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
		}
		System.out.println("Katniss: ");
		choice = keyboard.nextInt();
		
		if (choice == 2) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
		}
		System.out.println("the root of a pond Lilly: ");
		choice = keyboard.nextInt();
		
		if (choice == 2) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
		}
		System.out.println("The inner bark of a Pine tree: ");
		choice = keyboard.nextInt();
		
		if (choice == 2) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
		}
		System.out.println("Dandelion: ");
		choice = keyboard.nextInt();
		
		if (choice == 2) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
		}
		System.out.println("Narcissus: ");
		choice = keyboard.nextInt();
		
		if (choice == 1) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
		}
		System.out.println("Honeysuckle: ");
		choice = keyboard.nextInt();
		
		if (choice == 2) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
			
		}
		System.out.println("Lilium: ");
		choice = keyboard.nextInt();
		
		if (choice == 1) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
			
		}
		
		System.out.println("Aconitum: ");
		choice = keyboard.nextInt();
		
		if (choice == 1) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
			
		}
		
		System.out.println("Prickly Pear cactus fruit: ");
		choice = keyboard.nextInt();
		
		if (choice == 2) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
			
		}
		
		System.out.println("Pechit: ");
		choice = keyboard.nextInt();
		
		if (choice == 2) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
			
		}
		
		System.out.println("Yucca: ");
		choice = keyboard.nextInt();
		
		if (choice == 2) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
			
		}
		
		System.out.println("Rhubarb leaves: ");
		choice = keyboard.nextInt();
		
		if (choice == 1) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
			
		}
		
		System.out.println("Rhubarb stalks: ");
		choice = keyboard.nextInt();
		
		if (choice == 2) {
			System.out.println("Wrong...");
		}
		else {
			System.out.println("Correct!");
			score++;
			
		}
		
		System.out.println("Intelligence training complete.");
		System.out.println("Your total score is: " + score);
		
	
	if (score == 14) {

		player.intelligence = 10;
		System.out.println("Your intelegence level is: 10");
		
}
	
	if (score < 10) {
		player.intelligence = 4;
		System.out.println("Your intelegence level is: 4");
	} else {
		player.intelligence = 7;
		System.out.println("Your intelegence level is: 7");
	}
	}
}