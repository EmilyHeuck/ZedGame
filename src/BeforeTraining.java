
public class BeforeTraining {

	public void beforeTraining() {
		Zed.instance.player.agility = (int) (Math.random() * 49 + 1);
		Zed.instance.player.strength = (int) (Math.random() * 49 + 1);
		Zed.instance.player.intelligence = (int) (Math.random() * 49 + 1);
		System.out.println("Now, onto your job.");

		Zed.instance.player.job = (int) (Math.random() * 11 + 1);

		Zed.instance.player.jobs();

	}
}
