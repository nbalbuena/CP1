import javax.swing.JFrame;

public class DrawingFrame
{
    public static void main(String[] args) {
	
	// Snowman
    JFrame frame = new JFrame ("Frame for Picture");
	frame.setSize (400, 400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	DrawingPicture picture = new DrawingPicture();
	frame.add(picture);

	frame.setVisible(true);
    }
}
