import java.util.Scanner;


public class Zee{
	public static Zee instance;
//	this = instance;
	public LevelManager levelManager;
	public Item item;// = new Item();
	public Player player;
	public BeforeTraining beforeTraining;
	public Tutorial tutorial;
	public Zee() {
		instance = this;
		beforeTraining = new BeforeTraining();
		item = new Item();
		player = new Player();
	//	levelManager = new LevelManager();
		item.weapons();
		item.Misc();
		item.Armor();
		item.Meds();
		tutorial = new Tutorial();
		//new Zee;
		Scanner keyboard = new Scanner(System.in);
	    System.out.println("Welcome! What is your name?");
	    Player.name = keyboard.nextLine();
	    System.out.println("Well, "+Player.name+", the appocalypse has begun. It's your chance to survive in this harsh new world.");
	    System.out.print("Now, "+Player.name);
		System.out.println(" let's learn about you. We shall start with your gender. What is it? ");
		Player.gender = keyboard.nextLine();
		System.out.println("Fantastic! You're a "+Player.gender+"!");
	    Zee.instance.beforeTraining.beforeTraining();	
	    System.out.println("I have added a knife to your inventory.");
	    LevelManager.addXP(300);
		System.out.println("Now, let's try looking at your inventory. Enter the word 'display'");
		String command = keyboard.nextLine(); 
		item.display(command);
		System.out.println("Great job. Now it's time to go out on your adventure. Good luck.");
		tutorial.tutorial();

	}
  public static void main(String[] args){
	//Item item = new Item();
	///Item();
	//new Zee();
	instance = new Zee();
	 }
}