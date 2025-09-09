import java.awt.*;

interface Calculable {
    double calculateArea();
}

interface Drawable {
    void draw(Graphics g);
}

class Circle implements Calculable, Drawable {
    private double radius;
    Color color;
    String name;

    public Circle(String name, Color color, double radius) {
        this.name = name;
        this.color = color;
        this.radius = radius;
    }

    @Override public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(100, 100, (int)(2 * radius), (int)(2 * radius));
    }
}

class Rectangle implements Calculable, Drawable {
    private double width;
    private double height;
    Color color;
    String name;

    public Rectangle(String name, Color color, double width, double height) {
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override public double calculateArea() {
        return width * height;
    }

    @Override public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(200, 200, (int)width, (int)height);
    }
}

