// 9.3 Creating Instance Methods in a Class (1 of 5)
// 9.3 Creating Instance Methods in a Class (2 of 5)
// 9.3 Creating Instance Methods in a Class (3 of 5)
public class Student extends Person {
    // Additional fields specific to Student class
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        super(name, age); // Call superclass constructor
        this.studentId = studentId;
    }

    // Mutator method for setting student ID
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Accessor method for getting student ID
    public String getStudentId() {
        return studentId;
    }

    // Non-static method specific to Student class
    public void study() {
        System.out.println(getName() + " is studying.");
    }
}