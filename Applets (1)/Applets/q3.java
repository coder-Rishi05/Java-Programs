// 3. Create an applet in Java to draw a circle.

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="q3.class" width="400" height="400">
</applet>
*/

public class q3 extends Applet {

  public void init() {
    System.out.println("init function");
  }

  public void start() {
    System.out.println("start function");
  }

  public void paint(Graphics g) {
    try {
      g.setColor(Color.red);
      // Draw circle outline
      g.drawOval(100, 100, 150, 150);
      // Fill the circle
      g.fillOval(100, 100, 150, 150);
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
