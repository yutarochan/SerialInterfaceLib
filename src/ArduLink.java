import org.zu.ardulink.Link;
import org.zu.ardulink.gui.SerialConnectionPanel;

public class ArduLink {

	private static SerialConnectionPanel serialConnectionPanel;
	
	public static void main(String[] args) {
		String connectionPort = (String) Link.getDefaultInstance().getPortList().get(0);
		int baudRate = 9600;
		
		
	}
}
