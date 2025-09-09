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

class Triangle implements Calculable, Drawable {
    private double base;
    private double height;
    Color color;
    String name;

    public Triangle(String name, Color color, double base, double height) {
        this.name = name;
        this.color = color;
        this.base = base;
        this.height = height;
    }

    @Override public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override public void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = {300, 300 + (int)(base / 2), 300 - (int)(base / 2)};
        int[] yPoints = {300, 300 + (int)height, 300 + (int)height};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}