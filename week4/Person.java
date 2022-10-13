package week4;

public class Person {
    // this is a Person class
    // this is a blueprint for a Person object
    // this is a template for a Person object
    public String name = "";
    public String namenew; // another way to declare a variable
    public int age = 18;
    public String favColor = "";
    public double giftTotal = 0.0;
    public static int count = 0; // static variable 
    // static variables are shard by all objects of the class

    public Person(String name) {
        this.name = name; //same as name = name;, this is just better for own sake

        //count++;
    }
    public Person(){
        name = "Rob";
        //count ++;
    }
    public Person(String name, int age){
        this.age= age;
        //count ++;
    }

    public Person(String name, int age, String favColor, double GiftTotal){
        this.name = name;
        this.age = age;
        this.favColor = favColor;
        this.giftTotal = giftTotal;
        //count ++;
    }

    //Getters and Setters
    public String( getName)
}