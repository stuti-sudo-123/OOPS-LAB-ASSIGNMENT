import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.Date;

public class DigitalClockApplet extends JPanel implements Runnable {

    Thread t;
    String time;

    public DigitalClockApplet() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            time = new Date().toString(); // get current date & time
            repaint(); // refresh display

            try {
                Thread.sleep(1000); // update every second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Current Date & Time:", 50, 50);
        g.drawString(time, 50, 80);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Digital Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DigitalClockApplet());
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
