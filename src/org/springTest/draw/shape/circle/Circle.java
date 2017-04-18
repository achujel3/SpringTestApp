package org.springTest.draw.shape.circle;

import org.springTest.draw.shape.Shape;
import org.springTest.draw.shape.triangle.Point;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {

    private Point center;

    public Point getCenter() {
        return center;
    }

    @Resource(name = "point0")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle = (" + this.getCenter().getX() + ", " + this.getCenter().getY() + ").");
    }

    @PostConstruct
    public void initializeCircle() {
        System.out.println("Init of circle");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("Destroy of Circle");
    }

}
