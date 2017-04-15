package org.springTest.draw.triangle;

public class TriangleOnlyPoints {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public TriangleOnlyPoints(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
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
        System.out.println("TriangleOnlyPoints");
        System.out.println("PointA: (" + this.getPointA().getX() + ", " + this.getPointA().getY() + ").");
        System.out.println("PointB: (" + this.getPointB().getX() + ", " + this.getPointB().getY() + ").");
        System.out.println("PointC: (" + this.getPointC().getX() + ", " + this.getPointC().getY() + ").");
        System.out.println();
    }
}
