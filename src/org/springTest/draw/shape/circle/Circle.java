package org.springTest.draw.shape.circle;

import org.springTest.draw.event.DrawEvent;
import org.springTest.draw.shape.Shape;
import org.springTest.draw.shape.triangle.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

    private Point center;
    private ApplicationEventPublisher applicationEventPublisher;
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
        DrawEvent drawEvent = new DrawEvent(this);
        applicationEventPublisher.publishEvent(drawEvent);
    }

    @PostConstruct
    public void initializeCircle() {
        System.out.println("Init of circle");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("Destroy of Circle");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
