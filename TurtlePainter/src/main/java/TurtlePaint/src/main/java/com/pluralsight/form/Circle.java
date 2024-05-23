package TurtlePaint.src.main.java.com.pluralsight.form;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(World world, Color color, int border, Point location, int radius) {
        super(world,color,border,location);
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void paint() {
        Turtle turtle = new Turtle(getWorld(), getLocation().x, getLocation().y);

        double circumference = (2 * Math.PI * getRadius());
        int sides = (int) circumference/5;
        double angle = 360.0/sides;

        for (int i = 0; i < sides; i++) {
            turtle.forward(circumference/sides);
            turtle.turnRight(angle);
        }
    }
}
