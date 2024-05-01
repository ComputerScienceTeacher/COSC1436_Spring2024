public class Bat extends Mammal implements Flying{
    
    /**
     * This is the default constructor for my Bat
     */
    public Bat()
    {

    }

    /**
     * This is the constructor for the bat with one parameter
     * @param age
     */
    public Bat(int age)
    {
        this.age = age;
    }

    /**
     * This is the constructor for the bat with two parameters
     * @param age
     * @param name
     */
    public Bat (int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    /**
     * This is the overriden makeNoise method
     */
    @Override
    public void makeNoise()
    {
        System.out.println("screeeeech");
    }

    /*
     * This is a sample private method that makes no 
     * sense at all. It is here to show a private comment.
     * Private comments are not public to the user via docs.
     */
    private String saySomethingWeird(String thing)
    {
        //this outputs to the console stuff
        System.out.println("Pizzas are not actually " + thing);
    }

}