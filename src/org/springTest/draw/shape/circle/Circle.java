package org.springTest.draw.shape.circle;

import org.springTest.draw.shape.Shape;
import org.springTest.draw.shape.triangle.Point;

public class Circle implements Shape {

    private Point center;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle = (" + this.getCenter().getX() + ", " + this.getCenter().getY() + ").");
    }
}
