package org.springTest.draw;

import org.springTest.draw.triangle.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) factory.getBean("triangle");
        triangle.draw();

    }

}
