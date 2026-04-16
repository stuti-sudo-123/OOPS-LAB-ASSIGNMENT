import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovingText extends JFrame implements KeyListener, Runnable {

    String text = "HELLOOO!!";
    int x = 500; // starting from right side

    public MovingText() {
        setTitle("Moving Text");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addKeyListener(this);
        setVisible(true);

        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString(text, x, 200);
    }

    public void run() {
        while (true) {
            try {
                x -= 5; // move left

                // reset position when text goes out of screen
                if (x < -200) {
                    x = getWidth();
                }

                repaint();
                Thread.sleep(50);

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    // Capture keyboard input
    public void keyTyped(KeyEvent e) {
        text += e.getKeyChar(); // append typed character
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new MovingText();
    }
}
