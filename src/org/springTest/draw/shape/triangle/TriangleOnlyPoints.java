package org.springTest.draw.shape.triangle;

import org.springTest.draw.shape.Shape;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TriangleOnlyPoints implements InitializingBean, DisposableBean, Shape {

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

    @Override
    public void draw() {
        System.out.println("TriangleOnlyPoints");
        System.out.println("PointA: (" + this.getPointA().getX() + ", " + this.getPointA().getY() + ").");
        System.out.println("PointB: (" + this.getPointB().getX() + ", " + this.getPointB().getY() + ").");
        System.out.println("PointC: (" + this.getPointC().getX() + ", " + this.getPointC().getY() + ").");
        System.out.println();
    }

    public void cleanUp() {
        System.out.println("This is a cleanUp method in TriangleOnlyPoints class (set in xml)");
    }

    public void onInit() {
        System.out.println("This is an onInit method in TraingleOnlyPoints class (set in xml)");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("This is a destroy method in TriangleOnlyPoints class");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is after property setting method in TriangleOnlyPoints class");
    }
}
