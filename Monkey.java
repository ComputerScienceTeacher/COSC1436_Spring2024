public class Monkey extends Mammal
{
    private double tailLength;

    public Monkey(double tl)
    {
        tailLength = tl;
    }

    public void makeNoise()
    {
        System.out.println("oo ah ");
    }

    public String toString()
    {
        return name + age + tailLength;
    }
}