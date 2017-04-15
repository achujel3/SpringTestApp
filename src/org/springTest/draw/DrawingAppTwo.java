package org.springTest.draw;

import org.springTest.draw.shape.Shape;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppTwo {

    public static void main(String[] args) {

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Shape shape= (Shape) applicationContext.getBean("circle");
        shape.draw();


    }

}
