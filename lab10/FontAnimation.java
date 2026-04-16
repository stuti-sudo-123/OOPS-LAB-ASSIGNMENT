import javax.swing.*;
import java.awt.*;

public class FontAnimation extends JFrame implements Runnable {

    int fontSize = 6;
    boolean increasing = true; // controls expand/collapse

    public FontAnimation() {
        setTitle("Font Animation");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        Font f = new Font("Arial", Font.BOLD, fontSize);
        g.setFont(f);

        g.drawString("HELLO", 200, 200);
    }

    public void run() {
        while (true) {
            try {
                if (increasing) {
                    fontSize++;
                    if (fontSize >= 96) {
                        increasing = false; // start shrinking
                    }
                } else {
                    fontSize--;
                    if (fontSize <= 6) {
                        increasing = true; // start growing
                    }
                }

                repaint(); // update display
                Thread.sleep(50); // control speed

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new FontAnimation();
    }
}