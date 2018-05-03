
public class Zombie {
	  public int heal;//i think some super hard ones should have minor healing abilities but we can work on that later.
	  public int damageTaken;//how much damage the player does to the zombie.
	  public int damageDealt;//how much damage the zombie does in one hit to the player
	  public int hp;//hp that the zombie has
	  public String type;
	  public int armor;//armor == extra hp seperate from actual hp------ only for super hard zombles 
	  public int strength, agility, intelligence;//zombie stats
	  public int xpGiven;//how much xp you get from beating the zombie.
	  public Zombie walker, crawler, runner, screamer, projectile, swat, squirrel, hipster, mutation;
	
	//  
  public Zombie(){
	  heal = 0;
	  damageTaken = 0;
	  type = "";
	  armor = 0;
	  xpGiven = 0;//i think base should be like 3? that's the minimum you can get from killing one 
    //*I'd say baseline 3 is a solid option. 5 could work too, to make some math easier*
	  damageDealt = 0; //Derive this from Strength, plus a variable bonus based on the type maybe?
	  hp=0;									//^good idea but we should do a bit of a roll to see how much damage it deals per hit. like have a low base
    //and then add like 0-10 bonus damage based on the roll
	  strength = 0;
	  agility=0;
	  intelligence=0;//i think max 50 intelligence but that is for like the super duper hard and smart ones. average would be less than 15
  }
	public void types() {
		
		walker = new Zombie();
		walker.hp=80;
    	walker.type = "Walker";
    	walker.xpGiven = 10;
    	walker.strength = 30;
    	walker.agility = 20;
    	walker.intelligence = 5;	
    //no armor or regen abilities
    //agility =~ speed
    
     crawler = new Zombie();
    	crawler.hp= 60;
    	crawler.type = "Crawler";
    	crawler.xpGiven=6;
    	crawler.strength = 15;
    	crawler.agility = 4;
    	crawler.intelligence = 5;
    //no armor or regen abilities 
    
     runner = new Zombie();
    	runner.hp = 80;
    	runner.type="Runner";
    	runner.xpGiven=15;
    	runner.strength = 35;
    	runner.agility = 40;
    	runner.intelligence = 4;
    //no armor or regen
  	 screamer = new Zombie();
    	screamer.hp = 60;
    	screamer.type="Screamer";
    	screamer.xpGiven = 15;
    	screamer.strength=10;
    	screamer.agility=10;
    	screamer.intelligence = 20;
    //no armor, maybe regen? 
    	//they don't normally attack but they let out a very loud scream that attracts other zombies to the spot
     projectile = new Zombie();
    	projectile.hp=70;
    	projectile.type="Puker";
    	projectile.xpGiven = 20;
    	projectile.strength = 20;
    	projectile.agility = 20;
    	projectile.intelligence = 10;
    //ranged attacker. they vomit/spit/puke bodily fluids onto humans to infect them.
    
     swat = new Zombie(); //All stats here are placeholders, adjust for balance later
    // Slightly stronger and slightly slower than normal walkers, with armor. Still dumb.
    	swat.hp = 80;
    	swat.type = "Infected SWAT";
    	swat.xpGiven = 30;
    	swat.strength = 35;
    	swat.agility = 15;
    	swat.intelligence = 5;
    	swat.armor = 20;
     squirrel = new Zombie();
    	squirrel.hp = 10;
    	squirrel.type = "Zombie Squirrel";
    	squirrel.xpGiven = 5;
    	squirrel.strength = 5;
    	squirrel.agility = 20;
    	squirrel.intelligence = 2;
    	//a zombie squirrel. they travel in packs. 
     hipster = new Zombie();
    	hipster.hp = 70;
    	hipster.type="Hipster";
    	hipster.xpGiven = 25;
    	hipster.strength = 25;
    	hipster.agility = 15;
    	hipster.intelligence = 10;
    	hipster.heal = 2;//heal per minute
    	//the most annoying and pretentious zombies ever. they all wear too much flannel and have finely groomed facial hair.
     mutation = new Zombie();
    	mutation.hp = 150;
    	mutation.type="Horriffic Mutant";
    	mutation.xpGiven = 50;
    	mutation.strength = 50;
    	mutation.agility = 15;
    	mutation.intelligence = 5;
    	mutation.heal=5;//heal per minute
    	//this is like a boss or something that is very rare. you have to be in a specific place to meet one. like a science lab
  }
  
}
