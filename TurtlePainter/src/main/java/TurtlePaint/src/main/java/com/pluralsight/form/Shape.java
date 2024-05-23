package TurtlePaint.src.main.java.com.pluralsight.form;

import java.awt.*;

public abstract class Shape {
    private World world;
    private Color color;
    private int borderWidth;
    private Point location;

    public Shape(World world, Color color, int borderWidth, Point location){
        this.world=world;
        this.color=color;
        this.borderWidth=borderWidth;
        this.location = location;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    // Abstract method
    public abstract void paint();

}
