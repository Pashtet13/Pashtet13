package test;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JPanel;

public class Paintingpanel extends JPanel {
        private Point clickPoint;
         Main net;
         Dialog wd= new Dialog();
        private Shape shape;
        Color color;
        public Paintingpanel(int n) {  
                    if(!wd.isVisible()){
                        wd.setVisible(true);
                    }else{
                        wd.setVisible(false);
                        wd.dispose();
                    }
            Random r = new Random();
             color= new Color(r.nextInt(128), r.nextInt(128), r.nextInt(128), r.nextInt(128)+100);
            MouseAdapter ma = new MouseAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    int minX = Math.min(e.getX(), clickPoint.x);
                    int minY = Math.min(e.getY(), clickPoint.y);
                    int maxX = Math.max(e.getX(), clickPoint.x);
                    int maxY = Math.max(e.getY(), clickPoint.y);
                    int size = Math.min(maxX - minX, maxY - minY);
                     if (minX < clickPoint.x) {
                        minX = clickPoint.x - size;
                    }
                    if (minY < clickPoint.y) {
                        minY = clickPoint.y - size;
                    }
                    perevirca( n, minX, minY, size);
                    repaint();
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    clickPoint = new Point(e.getPoint());
                }
            };  
            addMouseListener(ma);
            addMouseMotionListener(ma);
        }
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(600, 600);
        }   
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (shape != null) {
                 Graphics2D g2d = (Graphics2D)g;
                g2d.setColor(color);
                g2d.fill(shape);
                g2d.setColor(color);
                g2d.draw(shape);
            }
        }
         void perevirca(int n,int minX,int minY,int size){
                    wd.bottomert(n,size,color,minX,minY);
                    if(n==1){
                     shape = new Rectangle2D.Double(minX, minY, size, size);
                    }else if(n==2){
                    shape = new TriangleShape(new Point2D.Double(minX, minY),
                    new Point2D.Double(size, size), new Point2D.Double(minY, size)); 

                    }else if(n==3){
                     shape = new Ellipse2D.Double(minX, minY, size, size);
                    }else if(n==4){
                    shape = new TriangleShape1(new Point2D.Double(minX, minY),
                    new Point2D.Double(minY, size), new Point2D.Double(size,size), new Point2D.Double(size, minX));
                    }
        }
         class TriangleShape extends Path2D.Double {
  public TriangleShape(Point2D... points) {
    moveTo(points[0].getX(), points[0].getY());
    lineTo(points[1].getX(), points[1].getY());
    lineTo(points[2].getX(), points[2].getY());
    closePath();
  }
    }
  class TriangleShape1 extends Path2D.Double {
  public TriangleShape1(Point2D... points) {
    moveTo(points[0].getX(), points[0].getY());
    lineTo(points[1].getX(), points[1].getY());
    lineTo(points[2].getX(), points[2].getY());
    lineTo(points[3].getX(), points[3].getY());
    closePath();
  }
}
}
  