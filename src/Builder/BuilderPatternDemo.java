package Builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        System.out.println("Design Patterns::");
        System.out.println("Creational Design Patterns::");
        System.out.println("=============================");
        System.out.println("4. Builder Design Pattern::");
        System.out.println("=============================");

        Person person = new Person.PersonBuilder("Narendra","Modi")
                        .age(70)
                        .address("Delhi")
                        .phoneNumber("91-73726")
                        .build();
        System.out.println(person.toString());
    }

}
