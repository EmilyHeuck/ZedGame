import java.util.Arrays;
import java.util.Scanner;

public class Item {
	public int heal;
	public int damage;
	public String name;
	public int armor;// armor == extra hp seperate from actual hp
	public String stats;
	public int xpUp;
	// public static int number;
	public boolean have;
	public Item knife, bar, cleaver, brock;

	public Item() {
		heal = 0;
		damage = 0;
		armor = 0;
		stats = "";
		xpUp = 0;
		have = false;
		name = "";
		// Item knife;
	}

	public void weapons() { // All weapons held here
		// Scanner keyboard = new Scanner(System.in);
		// Knife

		knife = new Item();
		knife.damage = 12;
		knife.name = "Knife";
		knife.xpUp = 300;
		knife.stats = "damage = 12, No defense advantage, Raises Player Level by 3 ";
		knife.have = true;

		// Crowbar
		bar = new Item();
		bar.damage = 14;
		bar.name = "Crowbar";
		bar.xpUp = 400;
		bar.stats = "damage = 14, No defense advantage, Raises Player Level by 4";

		// Meat Cleaver
		cleaver = new Item();
		cleaver.damage = 9;
		cleaver.name = "Meat cleaver";
		cleaver.xpUp = 200;
		cleaver.stats = "damage = 9, No defense advantage, Raises player level by 2";

		// Half a Brick In A Sock
		brock = new Item();
		brock.damage = 10;
		brock.name = "Half a brick inside a tube sock. You call him Gerald.";
		brock.xpUp = 700;
		brock.stats = "damage = 10, No defense advantages besides the foul odor, Raises Player Level by 7.";
	}

	public void display(String command) {
		// Item item = new Item();

		Scanner keyboard = new Scanner(System.in);
		if (command.equalsIgnoreCase("display")) {
			System.out.println("You asked to display an item.");
			System.out.println("What would you like to display?");
			String display = keyboard.nextLine();
			// display = new display(display);
			displays(display);
		}
	}

	// Item items = new Item();
	public void displays(String command) {
		// Item Zed.instance.item = new Item();
		// weapons weapons = new weapons();
		if (command.equalsIgnoreCase("knife") && Zed.instance.item.knife.have == true) {
			System.out.println("your knife's satats are: " + Zed.instance.item.knife.stats);
		}
		if (command.equalsIgnoreCase("crowbar") && Zed.instance.item.bar.have == true) {
			System.out.println("your crowbar's stats are: " + Zed.instance.item.bar.stats);
		}
		if (command.equalsIgnoreCase("cleaver") && Zed.instance.item.cleaver.have == true) {
			System.out.println("your cleaver's stats are: " + Zed.instance.item.cleaver.stats);
		}
		if (command.equalsIgnoreCase("gerald") || command.equalsIgnoreCase("brock")
				|| command.contains("brick") && Zed.instance.item.brock.have == true) {
			System.out.println("Gerald's stats are: " + Zed.instance.item.brock.stats);
		}

	}

	public void Armor() {// All defensive wear here
		// Flak Jacket
		Item flak = new Item();
		flak.name = "Flak Jacket";
		flak.armor = 5; // Temporary, change when we figure out balance
		flak.xpUp = 500;// Ditto above comment
		flak.stats = "Armor = 5, Raises Player Level by 5 xp";
	}

	public void Meds() {// Healing Items
		// Bandages
		Item bandage = new Item();
		bandage.name = "Bandages";
		bandage.heal = 2;
		bandage.xpUp = 10;
		bandage.stats = "Heals 2 HP";

		// Potato Chips
		Item chips = new Item();
		chips.name = "Fringles Brand Potato Chips";
		chips.heal = 1;
		chips.xpUp = 10;
		chips.stats = "Heals 1 HP, and tastes like clogged arteries.";
		String random = "Pop the top, fun don't stop.";

		// Honey
		Item honey = new Item();
		honey.name = "Honey";
		honey.heal = 5;
		honey.xpUp = 50;
		honey.stats = "A natural antibiotic, heals 5 HP";

		// Pain Killer

	}

	public void Misc() {
		// backpack (increases storage by 10)

		// magnifying glass (can light fires if the sun is out)

		// small bic lighter(you get 10 uses)

		//
	}

	public static void displayStats(String name) {
		if (name == "knife") {

			// System.out.println("Your "+name+"'s damage is:");
		}
	}

}
