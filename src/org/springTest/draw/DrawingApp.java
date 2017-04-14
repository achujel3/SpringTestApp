package org.springTest.draw;

import org.springTest.draw.triangle.Triangle;
import org.springTest.draw.triangle.TriangleOnlyPoints;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {

//        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) applicationContext.getBean("triangle-alias");
        triangle.draw();

        TriangleOnlyPoints triangleOnlyPoints = (TriangleOnlyPoints) applicationContext.getBean("triangleWithPoints");
        triangleOnlyPoints.draw();

    }

}
