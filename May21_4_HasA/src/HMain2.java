import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class HMain2 {

	public static void main(String[] args) {
		try {
			Robot r = new Robot();
			r.mouseMove(1900, 0);
			Thread.sleep(300);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.keyPress(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
