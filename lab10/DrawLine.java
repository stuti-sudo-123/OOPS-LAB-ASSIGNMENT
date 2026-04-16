import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawLine extends JFrame implements MouseListener, MouseMotionListener {

    int x1, y1, x2, y2;

    public DrawLine() {
        setTitle("Draw Line using Mouse");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(this);
        addMouseMotionListener(this);

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(x1, y1, x2, y2);
    }

    // Mouse pressed → starting point
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    // Mouse dragged → ending point
    public void mouseDragged(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        repaint(); // redraw line
    }

    // Unused methods (must override)
    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args) {
        new DrawLine();
    }
}