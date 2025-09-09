import javax.swing.*;
import java.awt.*;

public class AppLauncher {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My first JFrame");
        frame.setSize(600, 600);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a custom JPanel to draw the shape
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Shape circle = new Circle("MyCircle", Color.RED, 50.0);
                Shape rectangle = new Rectangle("MyRectangle", Color.BLUE, 100.0, 50.0);
                circle.draw(g);
                rectangle.draw(g);
                System.out.println("Area: " + circle.getArea());
                System.out.println("Area: " + rectangle.getArea());
            }
        };
        frame.add(panel);
        frame.setVisible(true);

    }
}