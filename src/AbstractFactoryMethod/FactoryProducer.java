package AbstractFactoryMethod;

public class FactoryProducer {

    public static AbstractFactory getFactory(String shapeCategory) {
        switch (shapeCategory) {
            case "2D":
                  return new ShapeFactory2D();
            case "3D":
                  return new ShapeFactory3D();
            default:
                return null;
           }
    }

}
