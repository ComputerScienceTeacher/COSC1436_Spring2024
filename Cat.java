public class Cat extends Mammal
{
    public Cat()
    {

    }

    public Cat(int age)
    {
        this.age = age;
    }

    public Cat (int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "This cat's name is " + name + ". This cat has been alive for " +
               age + " years.";
    }

    public void makeNoise()
    {
        System.out.println("meow!!!!!");
    }

}