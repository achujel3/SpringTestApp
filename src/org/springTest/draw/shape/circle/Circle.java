package org.springTest.draw.shape.circle;

import org.springTest.draw.shape.Shape;
import org.springTest.draw.shape.triangle.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class Circle implements Shape {

    private Point center;
    @Autowired
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCenter() {
        return center;
    }

    @Resource(name = "point0")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println(this.messageSource.getMessage("drawing.circle", null,
                "Default drawing message", null));
        System.out.println(this.messageSource.getMessage("drawing.point",
                new Object[]{this.getCenter().getX(), this.getCenter().getY()},
                "Default drawing point message", null));
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
