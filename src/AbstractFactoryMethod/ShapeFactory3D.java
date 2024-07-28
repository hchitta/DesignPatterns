package AbstractFactoryMethod;

import FactoryMethod.Shape;

public class ShapeFactory3D extends AbstractFactory {

    @Override
    Shape getShape(String type) {
        switch (type) {
            case "SPHERE":
                  return new Sphere();
            case "CUBOID":
                  return new Cuboid();
            default:
                return null;
    }
}

}
