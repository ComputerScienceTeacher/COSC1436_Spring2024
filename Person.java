// 9.2 Creating a Class (1 of 4)
// Class header with optional access specifier
public class Person {
    // 9.2 Creating a Class (2 of 4)
    // Data fields
    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 9.2 Creating a Class (3 of 4)
    // Private access and Information hiding
    // Only methods of the same class can access private variables
    // Private data can be changed only by a class’s own methods

    // Method to print person's information
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // 9.2 Creating a Class (4 of 4)
    // Class's data fields are private
    // Class's methods are not static
}