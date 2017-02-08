import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		
		JFrame myframe = new JFrame("Brian");
		myframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenSize.getHeight();
		screenSize.getWidth();
		
		myframe.setLocation(screenSize.width/2,screenSize.height/2);
		myframe.setSize(200, 200);
		myframe.setVisible(true);
		
	}
}