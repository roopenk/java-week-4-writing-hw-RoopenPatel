// Java program to overload constructors

public class Program_25_ConstructorOverloadingExample {
    int id;
    String name;
    int age;

    // Creating two args constructor
    Program_25_ConstructorOverloadingExample(int i, String n) {
        id = i;
        name = n;
    }

    // Creating three args constructor
    Program_25_ConstructorOverloadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Program_25_ConstructorOverloadingExample s1 = new Program_25_ConstructorOverloadingExample(111, "Karan");
        Program_25_ConstructorOverloadingExample s2 = new Program_25_ConstructorOverloadingExample(222, "Aryan");
        s1.display();
        s2.display();
    }
}
