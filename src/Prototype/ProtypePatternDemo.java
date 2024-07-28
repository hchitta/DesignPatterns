package Prototype;

public class ProtypePatternDemo {

    public static void main(String[] args) {

        System.out.println("Design Patterns::");
        System.out.println("Creational Design Patterns::");
        System.out.println("=============================");
        System.out.println("1. Prototype Design Pattern::");
        System.out.println("=============================");

        Square square = new Square(10);
        Square clonedSquare = (Square)square.clone();
        
        clonedSquare.setLength(20);
        System.out.println(square);
        System.out.println(clonedSquare);

        Circle circle = new Circle(50);
        Circle clonedCircle = (Circle)circle.clone();
        
        clonedCircle.setRadius(100);
        System.out.println(circle);
        System.out.println(clonedCircle);
        
        
    }

}
