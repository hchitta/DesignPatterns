package AbstractFactoryMethod;

import FactoryMethod.Shape;

public class Cuboid implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Cuboid::draw() method.");
    }

}
