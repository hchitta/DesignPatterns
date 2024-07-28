package AbstractFactoryMethod;

import FactoryMethod.Shape;

public abstract class AbstractFactory {

    abstract Shape getShape(String type);

}
