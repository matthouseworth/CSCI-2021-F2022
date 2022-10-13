package week4;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello World");

        Person p1 = new Person("Gina");

        System.out.println(p1.name); //Access p1's name

        System.out.println(p1.age);

        Person p2 = new Person(); //instnatiate a Person object

        System.out.println(p2.name); //Access p2's name

        Person p3 = new Person("Alex");

        System.out.println(p3.name);

        Person p4 = new Person("Bob", 22, "Black" 200);
    
    }
}
