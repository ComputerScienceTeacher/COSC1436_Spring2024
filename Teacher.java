// 9.3 Creating Instance Methods in a Class (4 of 5)
// 9.3 Creating Instance Methods in a Class (5 of 5)
public class Teacher extends Person {
    // Static field
    private static int teacherCount = 0;
    private static int teacherIDSeed = 100;
    private int teacherID;

    // Instance field
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call superclass constructor
        this.subject = subject;
        teacherID = teacherIDSeed;
        teacherIDSeed ++;
        teacherCount++; // Increment teacher count when a new teacher is created
    }

    // Static method
    public static int getTeacherCount() {
        return teacherCount;
    }

    // Non-static method
    public void teach() {
        System.out.println(getName() + " is teaching " + subject + ".");
    }

    // Non-static method
    public String getSubject() {
        return subject;
    }


    /**
     * returns - teacherID
     */
    public int getTeacherID()
    {
        return teacherID;
    }

    // Static method
    public static void displayTeacherInfo(Teacher teacher) {
        System.out.println("Name: " + teacher.getName());
        System.out.println("Age: " + teacher.getAge());
        System.out.println("Subject: " + teacher.getSubject());
    }
}
