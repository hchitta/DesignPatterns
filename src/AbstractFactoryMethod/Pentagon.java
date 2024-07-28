package AbstractFactoryMethod;

import FactoryMethod.Shape;

public class Pentagon implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Pentagon::draw() method.");
    }

}
