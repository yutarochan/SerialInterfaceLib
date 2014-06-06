import org.zu.ardulink.Link;
import org.zu.ardulink.gui.SerialConnectionPanel;

/*
 * To make this work:
 * - Must be in root
 * - Add the device to the corresponding system under dev!!
 * Resource: http://forum.arduino.cc/index.php/topic,125852.0.html
 */

public class ArduLink {

	private static SerialConnectionPanel serialConnectionPanel;
	
	public static void main(String[] args) {
		String port = Link.getDefaultInstance().getPortList().get(0);
		final String keyPort = port; 
				
		Thread t = new Thread(new Runnable() {

			public void run() {
				while (true) {
					if (keyPort.equals(Link.getDefaultInstance().getPortList().get(0)))
						System.out.println(keyPort + " LIKNED!");
					else System.out.println(keyPort + " UNLINK!");
					
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		t.start();
	}
}
