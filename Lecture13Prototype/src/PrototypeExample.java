import java.awt.*;
import javax.swing.*;

// This class demonstrates the prototype pattern by using prototypes
// of fonts and colors.
// It also uses our ImageFactory class that demonstrates the Factory Method pattern.
public class PrototypeExample {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(600, 500);
        panel.setBorder(BorderFactory.createTitledBorder("Mikie Han"));

        Graphics g = panel.getGraphics();

        // deriving colors and fonts based on existing ones (prototypes)
        Color c = Color.GREEN.darker();
        g.setColor(c);
        g.fillOval(20, 70, 100, 50);

        Image img1 = ImageFactory.loadImage("tinman.png", panel);
        Image img2 = ImageFactory.loadImage("cutieicecream.jpg", panel);
        g.drawImage(img1, 100, 20, panel);
        g.drawImage(img2, 300, 50, 200, 300, panel);

        // derive new font, same as existing (prototype) font, but bigger and bold
        Font f = g.getFont();
        //f = new Font("Comic Sans MS", Font.BOLD, 64);
        f = f.deriveFont(Font.BOLD, 64); //use prototype
        g.setFont(f);
        g.drawString("I love EGR 326", 11, 200);
    }
}