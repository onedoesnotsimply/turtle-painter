package TurtlePaint.src.main.java.com.pluralsight.form;

import java.awt.*;

public class Triangle extends Shape {
    private int height;
    private int width;

    public Triangle(World world, Color color, int border, Point location, int height, int width){
        super(world,color,border,location);
        this.height=height;
        this.width=width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void paint() {
        Turtle turtle = new Turtle(getWorld(), getLocation().x,getLocation().y);
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);

        turtle.forward(hypotenuse);
        turtle.turnRight(90);
        turtle.forward(hypotenuse);
        turtle.turnRight(135);
        turtle.forward(hypotenuse);

    }
}
