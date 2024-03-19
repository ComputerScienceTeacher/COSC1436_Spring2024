import java.util.*;

class LoopDemo
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int sum = 0;
        
        while(x != -1)
        {
            System.out.print ("Type a number or -1 to quit: ");
            x = sc.nextInt();
            sum += x;
        }

        System.out.println("The sum of all the numbers you entered is " + sum + ".");
    }
}