package AbstractFactoryMethod;

import FactoryMethod.Shape;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        System.out.println("Design Patterns::");
        System.out.println("Creational Design Patterns::");
        System.out.println("=============================");
        System.out.println("3. Abstract Factory Design Pattern::");
        System.out.println("=============================");


        AbstractFactory abstractFactory2d = FactoryProducer.getFactory("2D");

        Shape triangle =  abstractFactory2d.getShape("TRIANGLE");
        triangle.draw();

        Shape pentagon =  abstractFactory2d.getShape("PENTAGON");
        pentagon.draw();

        AbstractFactory abstractFactory3d = FactoryProducer.getFactory("3D");

        Shape sphere =  abstractFactory3d.getShape("SPHERE");
        sphere.draw();

        Shape cuboid =  abstractFactory3d.getShape("CUBOID");
        cuboid.draw();

        Shape test =  abstractFactory3d.getShape("PENTAGON");
        System.out.println(test);
        
    }

}
