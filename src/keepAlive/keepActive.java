package keepAlive;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class keepActive {
public static void main(String...args) throws AWTException, InterruptedException{
	Robot r = new Robot();	
	boolean a = true;
	do{
		r.keyPress(KeyEvent.VK_PRINTSCREEN);
		r.keyRelease(KeyEvent.VK_PRINTSCREEN);
		TimeUnit.SECONDS.sleep(60);
		System.out.println("this is running");
	}
	while(a=true);
	
}
}
