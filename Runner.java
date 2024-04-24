public class Runner
{
    public static void main(String [] args)
    {
        Cat cat1 = new Cat();
        cat1.setName("Snickers");
        Cat cat2 = new Cat(4);
        cat2.setName("Tabby");
        Cat cat3 = new Cat(4, "Whiskers");
        cat3.makeNoise();
        Lion cat4 = new Lion(12, "Big Guy", 250.2);
        cat4.makeNoise();
        System.out.println(cat4.getName());

        Monkey monkey1 = new Monkey(15.2);
        monkey1.makeNoise();
        System.out.println(monkey1);

        Cat [] cats = {cat1, cat2, cat3, cat4};
        for(Cat cat : cats)
        {
            System.out.println(cat);
        }
    }

}