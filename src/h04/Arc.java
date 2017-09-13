package h04;

import java.applet.Applet;
import java.awt.*;

public class Arc extends Applet {




    public void paint(Graphics g) {
      setBackground(Color.blue);

      g.setColor(Color.yellow);
      g.fillArc(100,100,150,130,0,360);

    }
}

