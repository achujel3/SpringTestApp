package org.springTest.draw.triangle;

public class Triangle {

    private String type;
    private int height;
    private Point pointA;
    private Point pointB;
    private Point pointC;

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

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println(this.getHeight() + ", " + this.getType() + ". drawing triangle");
        System.out.println("PointA: (" + this.getPointA().getX() + ", " + this.getPointA().getY() + ").");
        System.out.println("PointB: (" + this.getPointB().getX() + ", " + this.getPointB().getY() + ").");
        System.out.println("PointC: (" + this.getPointC().getX() + ", " + this.getPointC().getY() + ").");
    }

}
