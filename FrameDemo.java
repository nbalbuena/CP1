import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  // title of the frame. Creating the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates program
		frame.setSize(400, 400); // sets the width and height
        
		Shapes r = new Shapes(); Creating the Shapes Object
		frame.add(r); adding r to the frame

		frame.setVisible(true); // show frame 
	}
}
