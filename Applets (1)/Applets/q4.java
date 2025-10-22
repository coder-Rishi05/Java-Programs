// 4. Create an applet in Java to draw a polygon.

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="q4.class" width="500" height="500">
</applet>
*/

public class q4 extends Applet {

  public void init() {
    System.out.println("init function");
  }

  public void start() {
    System.out.println("start function");
  }

  public void paint(Graphics g) {
    try {
      // Define x and y coordinates of the polygon
      int x[] = {100, 150, 200, 250, 300, 200};
      int y[] = {300, 200, 150, 200, 300, 350};
      int n = 6; // Number of points

      // Set color and draw polygon outline
      g.setColor(Color.blue);
      g.drawPolygon(x, y, n);

      // Fill the polygon with a color
      g.setColor(Color.cyan);
      g.fillPolygon(x, y, n);

    } catch (Exception e) {
      System.out.println("Exception in paint(): " + e);
    }
  }

  public void stop() {
    System.out.println("stop function");
  }

  public void destroy() {
    System.out.println("destroy function");
  }
}
