public class Lion extends Cat
{
    private double weight;

    public Lion(int age, String name, double weight)
    {
        super(age, name);
        this.weight = weight;
    }

    public void makeNoise()
    {
        System.out.println("ROAR!!!");
    }
}