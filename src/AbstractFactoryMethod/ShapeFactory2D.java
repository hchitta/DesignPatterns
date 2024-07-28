package AbstractFactoryMethod;

import FactoryMethod.Shape;

public class ShapeFactory2D extends AbstractFactory{

    @Override
    Shape getShape(String type) {
       switch (type) {
        case "TRIANGLE":
              return new Triangle();
        case "PENTAGON":
              return new Pentagon();
        default:
            return null;
       }
    }



}
