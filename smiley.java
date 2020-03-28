import java.awt.*;
import java.applet.*;

/*<applet code="Smiley.class" width=800 height=600>
  </applet>*/

public class Smiley extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(20,20,140,140);
		g.setColor(Color.black);
		g.fillOval(55,50,20,20);
		g.fillOval(105,50,20,20);
		g.drawLine(90,70,90,110);
		g.drawLine(60,125,120,125);
	}
}
