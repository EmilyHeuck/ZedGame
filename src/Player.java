import java.util.ArrayList;

public class Player {
	public int job;
	public static String name;
	public static String gender;
	public int agility;
	public int strength;
	public int intelligence;
	public int healthPoints = 100;
	public ArrayList<Item> item;
	public String fellowTribute;
	public int luck;

	public Player() {
		job = 0;
		gender = "";
		name = "";
		agility = 0;
		strength = 0;
		intelligence = 0;
		item = new ArrayList<Item>();
		fellowTribute = "";
		luck = 0;

		jobs();

	}

	public void jobs() {
		if (job == 1) {
			System.out.println("You are a professional athlete!");
			agility = agility + 50;
			strength = strength + 20;
			intelligence = intelligence + 5;
		} else if (job == 2) {
			System.out.println("You work in the construction industry.");
			strength = strength + 40;
			agility = agility + 10;
			intelligence = intelligence + 10;
		} else if (job == 3) {
			System.out.println("You are a Scientist!");
			agility = agility + 10;
			strength = strength + 10;
			intelligence = intelligence + 50;
		} else if (job == 4) {
			System.out.println("You are a fisherman.");
			agility = agility + 10;
			strength = strength + 40;
			intelligence = intelligence + 10;
		} else if (job == 5) {
			System.out.println("You work in a factory");
			agility = agility + 5;
			strength = strength + 10;
			intelligence = intelligence + 10;
		} else if (job == 6) {
			System.out.println("You are a taxi driver.");
			agility = agility + 5;
			strength = strength + 5;
			intelligence = intelligence + 5;
		} else if (job == 7) {
			System.out.println("You are an old fashioned lumberjack!");
			agility = agility + 10;
			strength = strength + 50;
			intelligence = intelligence + 15;
		} else if (job == 8) {
			if (Player.gender.contains("female")) {
				System.out.println("You are a seamstress!");
			} else {
				System.out.println("You are a tailor!");
			}
			agility = agility + 5;
			strength = strength + 5;
			intelligence = intelligence + 10;
		} else if (job == 9) {
			System.out.println("You are just a simple farmer.");
			agility = agility + 20;
			strength = strength + 35;
			intelligence = intelligence + 7;
		} else if (job == 10) {
			System.out.println("You are a veteranarian!");
			agility = agility + 15;
			strength = strength + 15;
			intelligence = intelligence + 45;
		} else if (job == 11) {
			System.out.println("You are a Pizza delivery man.");
			agility = agility + 10;
			strength = strength + 5;
			intelligence = intelligence + 15;
		} else if (job == 12) {
			System.out.println(
					"You are an unemployed person living in your parents' basement. Even though you should have moved out years ago. ");
			System.out.println(
					"Though, you are a doomsday prepper and have been wating for this day to come. Your time is now!");
			System.out.println("You have a strong advantage in this world. ");
			System.out.println("Your luck is + 3 instantly! ");
			System.out.println("That's what you get when all you do with your life is prep for this thing.");
			strength = strength + 20;
			agility = agility + 10;
			luck = luck + 3;
			intelligence = intelligence + 30;
		}
	if (agility != 0) {
		System.out.println("Your agility level is: " + agility);
		System.out.println("Your strength level is: " + strength);
		System.out.println("Your intelligence level is: " + intelligence);
		System.out.println("You have " + healthPoints + " HP!");
		}
	}

}