import java.util.Scanner;

public class ScannerDemo
{
    //variable declarations;
    private static String name;
    private static double favNum = 5;
    private static final Scanner kb = new Scanner(System.in);

    /** This is the main method for running the program
     * @param  String [] args - the array that is passed in to run the program
     * @return nothing
     */
    public static void main (String [] args)
    {
        //obtaining input from user
        userInput(); 

        //outputting stuff to the screen
        outputStuff();  
    }

    /*
     * This method allows the user to input stuff
     */
    private static void userInput()
    {
        // asking the user for their favorite number
        System.out.print("What is your favorite number  : ");

        // getting a double using the scanner
        favNum = kb.nextDouble();

        //clearing out the Scanner stream
        kb.nextLine();

        // asking the user for their name
        System.out.print("What is your name? : ");
        name = kb.nextLine();
    }

    /**
     * This method outputs stuff to the screen
     */
    public static void outputStuff()
    {
        System.out.print("what value do you want to mutiply by : ");
        int multiplier = kb.nextInt();
        processInput(multiplier);
        System.out.println(name + ", your favorite number when multiplied by " + multiplier + " is " + favNum);
    }
    
    /*
     * this method calls the inputs to be processed
     * @param int multi - the multiplier that is coming in from the user
     */
    private static void processInput(int multi)
    {
        favNum *= multi;
    }
}