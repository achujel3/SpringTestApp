package org.springTest.draw;

import org.springTest.draw.triangle.Triangle;
import org.springTest.draw.triangle.TriangleOnlyPoints;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) throws Exception {

//        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) applicationContext.getBean("triangle-alias");
        triangle.draw();

        TriangleOnlyPoints triangleOnlyPoints = (TriangleOnlyPoints) applicationContext.getBean("triangleWithPoints");
        applicationContext.registerShutdownHook();
        triangleOnlyPoints.draw();

        Triangle childTriangle1 = (Triangle) applicationContext.getBean("childTriangle1");
        childTriangle1.draw();

        Triangle childTriangle2 = (Triangle) applicationContext.getBean("childTriangle2");
        childTriangle2.draw();

    }

}
