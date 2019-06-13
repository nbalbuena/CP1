/**
 * Snowman
 *
 * @Natalie Balbuena
 * @1/17/19
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.Polygon;
public class DrawingPicture extends JComponent
{

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        
        g2.setColor(Color.black);
        Ellipse2D.Double circle = new Ellipse2D.Double(200, 200, 100, 75);
        g2.draw(circle);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(205, 125, 85, 75);
        g2.draw(circle2);
        Ellipse2D.Double circle3 = new Ellipse2D.Double(210, 50, 70, 75);
        g2.draw(circle3);
        g2.setColor(Color.black);
        Ellipse2D.Double circle4 = new Ellipse2D.Double(220, 75, 10, 10);
        g2.fill(circle4);
        Ellipse2D.Double circle5 = new Ellipse2D.Double(260, 75, 10, 10);
        g2.fill(circle5);
        
        g2.setColor(Color.orange);
        int x[] = {240, 245, 250};
        int y[] = {85, 85, 110};
        int numberofpoints = 3;
        
        Polygon nose = new Polygon(x, y, numberofpoints);
        g2.fillPolygon(nose);
        
        g2.setColor(Color.black);
        Rectangle box = new Rectangle(210, 150, 45, 2);
        g2.fill(box);
        
        Rectangle bottom = new Rectangle(290, 150, 45, 2);
        g2.fill(bottom);
        
        g2.setColor(Color.green);
        int x2[] = {240, 245, 250};
        int y2[] = {20, 20, 30};
        int numberofpoints2 = 3;
        
        
        
    }
}
 
