import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Compute interior coordinates
        Insets myInsets = this.getInsets();
        int x1 = myInsets.left;
        int y1 = myInsets.top;
        int x2 = getWidth() - myInsets.right - 1;
        int y2 = getHeight() - myInsets.bottom - 1;
        int width = x2 - x1;
        int height = y2 - y1;
        int i=1;
        //Paint the background
        g.setColor(Color.WHITE);
        g.fillRect(x1, y1, width + 1, height + 1);
        
//        //Draw a border
//        g.setColor(Color.YELLOW);
//        g.drawRect(x1, y1, width, height);
//        
//        //Draw a second border
//        g.setColor(Color.ORANGE);
//        g.drawRect(x1 + 4, y1 + 4, width - 8, height - 8);
//        
//        //Draw diagonal line1
//        g.setColor(Color.WHITE);
//        g.drawLine(x1, y1, x2, y2);
//        
//        //Draw diagonal line2
//        g.setColor(Color.RED);
//        g.drawLine(x2, y1, x1, y2);

//         g.setColor(Color.LIGHT_GRAY);
//         g.fillOval(x1 + this.getWidth()/2 - 55/2, y1 + this.getHeight()/2 - 55/2,55, 55);
    
//        Polygon p = new Polygon();
//        p.addPoint(x1 + 5, y1 + 25);
//        p.addPoint(x1 + 20, y1 + 10);
//        p.addPoint(x1 + 35, y1 + 25);
//        p.addPoint(x1 + 25, y1 + 25);
//        p.addPoint(x1 + 25, y1 + 45);
//        p.addPoint(x1 + 15, y1 + 45);
//        p.addPoint(x1 + 15, y1 + 25);
//        g.setColor(Color.YELLOW);
//        g.fillPolygon(p);
        
 //       Rectangle Rec = new Rectangle(300,200);
        
       
        
        g.setColor(Color.RED);
        g.fillRect(10, 10, 500, 300);
        
        g.setColor(Color.WHITE);
        g.fillRect(10, 70, 500, 60);
        g.setColor(Color.BLACK);
        g.drawRect(10, 70, 500, 60);
        g.setColor(Color.WHITE);
        g.fillRect(10, 190, 500, 60);
        g.setColor(Color.BLACK);
        g.drawRect(10, 190, 500, 60);
        
        Polygon tri = new Polygon();
        tri.addPoint(x1 + 10, y1 + 10);
        tri.addPoint(x1 + 250, y1 + 150);
        tri.addPoint(x1 + 10, y1 + 310);
        g.setColor(Color.BLUE);
        g.fillPolygon(tri);
        g.setColor(Color.BLACK);
        g.drawPolygon(tri);
        
        Polygon p2 = new Polygon();
        p2.addPoint(x1 + 110, y1 + 110);
        p2.addPoint(x1 + 85, y1 + 190);
        p2.addPoint(x1 + 110, y1 + 165);
        g.setColor(Color.WHITE);
        g.fillPolygon(p2);
        p2.addPoint(x1 + 110, y1 + 110);
        p2.addPoint(x1 + 135, y1 + 190);
        p2.addPoint(x1 + 110, y1 + 165);
        g.setColor(Color.WHITE);
        g.fillPolygon(p2);
        p2.addPoint(x1 + 70, y1 + 140);
        p2.addPoint(x1 + 150, y1 + 140);
        p2.addPoint(x1 + 110, y1 + 165);
        g.setColor(Color.WHITE);
        g.drawPolygon(p2);
        g.fillPolygon(p2);
    
        g.setColor(Color.BLACK);
        g.drawRect(10, 10, 500, 300);
	}
	
}
