public class PersonTest
{
    public static void main(String[] args) {
        // Creating objects of Person class
        Teacher person1 = new Teacher("Alice", 25, "math");
        Teacher person2 = new Teacher("Bob", 30, "poetry");
        Teacher person3 = new Teacher("Veronica", 30, "logic");

        // Accessing and printing information using getter methods
        System.out.println("Teacher 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("ID: " + person1.getTeacherID());

        System.out.println();

        System.out.println("Teacher 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("ID: " + person2.getTeacherID());

        System.out.println();


        System.out.println("Teacher 1:");
        System.out.println("Name: " + person3.getName());
        System.out.println("Age: " + person3.getAge());
        System.out.println("ID: " + person3.getTeacherID());

        System.out.println();

        // Changing information using setter methods
        person1.setName("Charlie");
        person1.setAge(35);

        // Printing updated information
        System.out.println("Updated Person 1:");
        person1.printInfo();
    }
}