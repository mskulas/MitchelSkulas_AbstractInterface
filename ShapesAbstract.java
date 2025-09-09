import java.awt.*;


abstract class Shape {
    String name;
    Color color;
    abstract double getArea();
    abstract void draw(Graphics g);
}

class Circle extends Shape {
    double radius;

    Circle(String name, Color color, double radius) {
        this.name = name;
        this.color = color;
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(100, 100, (int)(2 * radius), (int)(2 * radius));
        
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(String name, Color color, double width, double height) {
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(200, 200, (int)width, (int)height);
        
    }
}

