package TurtlePaint.src.main.java.com.pluralsight.form;

import java.awt.*;

public class Square extends Shape {
    private int size;

    public Square(World world, Color color, int border, Point location, int size){
        super(world,color,border,location);
        this.size=size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void paint() {
        Turtle turtle = new Turtle(getWorld(), getLocation().x, getLocation().y);
        turtle.forward(size);
        turtle.turnRight(90);
        turtle.forward(size);
        turtle.turnRight(90);
        turtle.forward(size);
        turtle.turnRight(90);
        turtle.forward(size);
    }
}
