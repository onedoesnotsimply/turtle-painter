package TurtlePaint.src.main.java.com.pluralsight.form;

import java.awt.*;

public class Hexagon extends Shape {
    private int length;

    public Hexagon(World world, Color color, int border, Point location, int length){
        super(world,color,border,location);
        this.length=length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void paint() {
        Turtle charlie = new Turtle(getWorld(), getLocation().x, getLocation().y);
        charlie.turnLeft(60);
        charlie.forward(getLength());
        charlie.turnRight(60);
        charlie.forward(getLength());
        charlie.turnRight(60);
        charlie.forward(getLength());
        charlie.turnRight(60);
        charlie.forward(getLength());
        charlie.turnRight(60);
        charlie.forward(getLength());
        charlie.turnRight(60);
        charlie.forward(getLength());
    }
}
