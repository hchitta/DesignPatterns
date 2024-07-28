package Prototype;

public class Square implements Shape{

    private int length;

    @Override
    public String toString() {
        return "Square [length=" + length + "]";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square of length::"+this.length);
    }

   public Square(int length) {
    this.length = length;
     }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
