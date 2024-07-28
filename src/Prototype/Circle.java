package Prototype;

public class Circle implements Shape{

    private int radius;

    @Override
    public String toString() {
        return "Circle [length=" + radius + "]";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle of length::"+this.radius);
    }

   public Circle(int radius) {
    this.radius = radius;
     }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


}
