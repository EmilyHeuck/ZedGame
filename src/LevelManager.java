public class LevelManager {
	public static double level;
	public BeforeTraining theStart;
	public InTheCapital playerStats;
	public Player player;

	public LevelManager() {
		level = (int) 0;
		theStart = new BeforeTraining();
		playerStats = new InTheCapital();
		player = new Player();

	}

	public static int addXP(double xp) {// x is the variable stating how many levels you have gone up in one moment when
										// you level up.
		level = (xp / 100) + level; // x will also work in increments of XP going up in levels. so it's a double.
		System.out.println("You are now level: " + level);
		return (int) level;
	}

}