import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="RoundedRectangleApplet.class" width="400" height="400">
</applet>
*/

public class q12 extends Applet {

    public void init() {
        try {
            setBackground(Color.white); 
        } catch (Exception e) {
            System.out.println("Exception in init(): " + e);
        }
    }

    public void paint(Graphics g) {
        try {
            // Drawing an outlined rounded rectangle
            g.setColor(Color.blue);
            // Parameters: x, y, width, height, arcWidth, arcHeight
            g.drawRoundRect(50, 50, 200, 100, 30, 30);

            // Draw cyan filled rounded rectangle
            g.setColor(Color.cyan);
            g.fillRoundRect(50, 200, 200, 100, 50, 50);

        } catch (Exception e) {
            System.out.println("Exception in paint(): " + e);
        }
    }
}
