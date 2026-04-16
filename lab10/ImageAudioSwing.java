import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;

public class ImageAudioSwing extends JFrame {

    Image img;
    Clip clip;

    public ImageAudioSwing() {
        setTitle("Image + Audio Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load image
        img = Toolkit.getDefaultToolkit().getImage("image.png");

        // Load and play audio
        try {
            File audioFile = new File("sound.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // play in loop

        } catch (Exception e) {
            System.out.println(e);
        }

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        // Draw image
        g.drawImage(img, 50, 100, this);
    }

    public static void main(String[] args) {
        new ImageAudioSwing();
    }
}