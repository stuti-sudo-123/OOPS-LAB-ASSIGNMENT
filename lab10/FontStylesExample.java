import javax.swing.*;
import java.awt.*;

public class FontStylesExample extends JFrame {

    public FontStylesExample() {
        setTitle("Font Styles Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        String name = "Stuti Gupta"; // change to your name if needed

        // Font 1: Plain, small size
        Font f1 = new Font("Arial", Font.PLAIN, 20);
        g.setFont(f1);
        g.drawString(name, 100, 100);

        // Font 2: Bold, medium size
        Font f2 = new Font("Times New Roman", Font.BOLD, 30);
        g.setFont(f2);
        g.drawString(name, 100, 160);

        // Font 3: Italic, large size
        Font f3 = new Font("Courier", Font.ITALIC, 40);
        g.setFont(f3);
        g.drawString(name, 100, 230);
    }

    public static void main(String[] args) {
        new FontStylesExample();
    }
}