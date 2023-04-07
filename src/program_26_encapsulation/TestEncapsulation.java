package program_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // Setting values of the variables
        obj.setName("Roopen");
        obj.setAge(19);
        obj.setRollNo(51);
        // Displaying the variables
        System.out.println("Prime's Name : " + obj.getName());
        System.out.println("Prime's Age : " + obj.getAge());
        System.out.println("Prime's RollNo : " + obj.getRollNo());
        // Direct access to rollNo isn't possible due to encapsulation
    }
}
