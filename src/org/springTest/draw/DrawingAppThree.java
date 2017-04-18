package org.springTest.draw;

import org.springTest.draw.shape.Shape;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppThree {

    public static void main(String[] args) {

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        applicationContext.registerShutdownHook();
        Shape shape= (Shape) applicationContext.getBean("circle");
        shape.draw();

    }

}
