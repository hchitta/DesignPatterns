public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public void getMessage(String msg) {
        System.out.println(msg + "Hello I am singleton instance");
    }

    public static void main(String[] args) {
        System.out.println("Design Patterns::");
        System.out.println("Creational Design Patterns::");
        System.out.println("=============================");
        System.out.println("1. Singleton Design Pattern::");
        System.out.println("=============================");

        Singleton instance1 = Singleton.getInstance();
        instance1.getMessage("First::");
        Singleton instance2 = Singleton.getInstance();
        instance2.getMessage("Second::");
        System.out.println(instance1.hashCode() == instance2.hashCode());
    }
}
