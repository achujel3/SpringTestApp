package org.springTest.draw.triangle;

import java.util.List;

public class Triangle {

    private String type;
    private int height;
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw() {
        System.out.println(this.getHeight() + ", " + this.getType() + ". drawing triangle");
        for (Point point : this.getPoints()) {
            System.out.println("PointA: (" + point.getX() + ", " + point.getY() + ").");
        }
    }

}
