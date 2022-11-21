////////////////////////
// Imports
////////////////////////

import java.util.Random;
import java.util.Scanner;

public class num_guess_6do 
{
    
    /////////////////////////////////////////////
    // Function to Play Guess Random Number Game
    /////////////////////////////////////////////
    public static void main(String[] args) 
    {

        //create random class
        Random random = new Random();

        // declare global variables
        int tries = 0;
        String guess = "";
        String response ="";

        //create scanner class and close it with a try with resource statement
        try (Scanner scanner = new Scanner(System.in))
        {
            do
            {
                tries = 0;
                // declare random number integer variable from 1 to 10
                int ranum = random.nextInt(10)+1;
                //testing only to verify random number is being created
                System.out.println("The random number is " + ranum);
            
                        while(true)
                        {
                            System.out.println("Please enter a number 1 through 10?");

                            // variable to hold input from user
                            guess = scanner.nextLine();

                            //loop will check if input is a digit and if not then will keep asking the user for a digit
                            while(true)
                            {
                                if (guess.matches("\\d+"))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid number 1 to 10 ");
                                    //clear the scanner of the invalid input
                                    guess = scanner.nextLine();
                                }
                            }

                            // convert the string  to an integer
                            int guessnum=Integer.parseInt(guess);
                            //iterate tries by 1
                            tries ++;

                            // conditions to test if you match the random number
                            if (guessnum == ranum) 
                            {
                                System.out.println("Your Guess was Correct!");
                                System.out.println("It took you " + tries + " tries");
                                break;
                            }
                            else if (guessnum < ranum) 
                            {
                                System.out.println("Your Guess is too low.");
                            }
                            else if (guessnum > ranum)
                            {
                                System.out.println("Your Guess is higher.");
                            }
                        }
                    
                        System.out.println("Do you want to Play Again:  Y/N ");
                        response = scanner.nextLine();
                        if (response != "Y")
                        {
                            System.out.println("Thank You for Playing");
                        }
            }
            //while (response == "Y");
            while (response.equals("Y"));
        }                                      
        
    }
}
            
