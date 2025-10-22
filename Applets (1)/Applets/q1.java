import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class q1 extends Applet {

  public void init() {
    try {
      System.out.println("init function");
    } catch (Exception e) {
      System.out.println("Exception in init(): " + e);
    }
  }

  public void start() {
    try {
      System.out.println("start function");
    } catch (Exception e) {
      System.out.println("Exception in start(): " + e);
    }
  }

  public void paint(Graphics g) {
    try {
      g.setColor(Color.red);
      g.drawString("Hello World", 100, 150);
    } catch (Exception e) {
      System.out.println("Exception in paint(): " + e);
      g.setColor(Color.black);
      g.drawString("Error displaying text", 100, 150);
    }
  }

  public void stop() {
    try {
      System.out.println("stop function");
    } catch (Exception e) {
      System.out.println("Exception in stop(): " + e);
    }
  }

  public void destroy() {
    try {
      System.out.println("destroy function");
    } catch (Exception e) {
      System.out.println("Exception in destroy(): " + e);
    }
  }
}
