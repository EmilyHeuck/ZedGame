import java.util.Scanner;

public class Tutorial {
	public void tutorial() {
		System.out.println("-You wake up in a daze, unsure of where you are or how you got there.-");
		System.out.println("What do you do? Examine yourself, Get up, or go back to sleep?");
		Scanner keyboard = new Scanner(System.in);
		String action = keyboard.nextLine();
	//	Zombie zombie = new Zombie();
		Zed.instance.zombie.types();
		// int walkerhp = zombie.walker.hp;
		// System.out.println(walkerhp);
		basicAction(action);

	}

	public void basicAction(String action) {
		Scanner keyboard = new Scanner(System.in);

		if (action.contains("examine") || action.contains("Examine")) {
			System.out.println("You choose to examine yourself.");
			System.out.println("-You feel your pockets for anything useful and find a knife.-");
			System.out.println("-You sit up and look at your clothes. They are slightly ripped but otherwise in good shape.-");
			System.out.println("What do you do next?");
			String next = keyboard.nextLine();
			basicAction(next);
		}
		if (action.contains("up")) {
			System.out.println("-You stand up and look around, seing an open door and a room full of broken items with no use.-");
			System.out.println("Do you go through the door?");
			String next = keyboard.nextLine();
			if (next.contains("yes") || next.contains("Yes")) {
				System.out.println("-You walk through the doorway and hear a low groaning sound-");
				System.out.println("What do you do? Examine the noise or head away from the noise?");
				String noise = keyboard.nextLine();
				if (noise.contains("examine") || noise.contains("Examine")) {
					String move = "towards";
					firstEncounter(move);
				} else {
					System.out.println("You can not avoid the noise. You head towards it.");
					String move = "towards";
					firstEncounter(move);
				}

			} else {
				System.out.println("-You do not leave the room and decided to go back to sleep.-");
				System.out.println("While you sleep you are eaten by the undead. Game Over.");
			}
		} else {
			System.out.println("You go back to sleep. While you sleep you are eaten by the undead. Game Over.");
		}

	}

	public void firstEncounter(String move) {
		if (move.contains("towards")) {
			//Zombie zombie = new Zombie();
			//Zombie crawler = new Zombie();
			Zed.instance.zombie.types();
			Scanner keyboard = new Scanner(System.in);
			System.out.println("-you move towards the source of the noise and see a disembodied zombie torso with arms and a head-");
			System.out.println("-The zombie crawls towards you-");
			System.out.println("Do you want to attack the zombie?");
			String yn = keyboard.nextLine();
			if (yn.contains("yes") || yn.contains("Yes")) {
				System.out.println("You decide to attack the zombie.");
				System.out.println("Do you want to punch it or stab it?");
				yn = keyboard.nextLine();
				int damage = Zed.instance.player.strength;
				if (yn.contains("punch") || yn.contains("Punch")) {
					System.out.println("You punch the zombie.");
					System.out.println("You deal " + damage + " damage.");
					Zed.instance.zombie.crawler.hp=Zed.instance.zombie.crawler.hp- damage;
				}
				if (yn.contains("stab") || yn.contains("Stab")) {
					System.out.println("You grab your knife and stab the zombie.");
					damage = damage + Zed.instance.item.knife.damage;
					System.out.println("You deal " + damage + " damage");
					Zed.instance.zombie.crawler.hp=Zed.instance.zombie.crawler.hp- damage;
				}
				while (Zed.instance.zombie.crawler.hp >= 0) {
					System.out.println("the zombie is still not dead. It hits you and deals " + Zed.instance.zombie.crawler.strength+ " damage");
					Zed.instance.player.healthPoints = Zed.instance.player.healthPoints - 15;
					System.out.println("You now have "+Zed.instance.player.healthPoints+" HP.");
					System.out.println("");
					System.out.println("-You attack the zombie again.-");
					System.out.println("You deal another "+damage+" damage.");
					Zed.instance.zombie.crawler.hp=Zed.instance.zombie.crawler.hp - damage;
				}
				if (damage >= Zed.instance.zombie.crawler.hp) {
					System.out.println("You have killed the zombie and gained " + Zed.instance.zombie.crawler.xpGiven + "xp.");
					LevelManager.addXP(Zed.instance.zombie.crawler.xpGiven);
				}

			}
		}
	}
}
