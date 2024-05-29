import java.util.Random;

public class Friend {

	Random r = new Random();
	int paper;

	public void friend_answer() {
		paper = r.nextInt(100)+1;
	}
}
