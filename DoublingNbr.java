import java.util.Scanner;
public class DoublingNbr{
 public static void main(String[] args){
 //declaration
 Scanner keyboard = new Scanner(System.in);
 double originalNumber;
 double calculatedNumber;
 
 // Get a number from a user to play the game
 System.out.print("Enter a number: ");
 originalNumber = keyboard.nextDouble();
 while (originalNumber != 0){
    //double the number
    calculatedNumber = originalNumber * 2;
    //display the results to the user
    System.out.println( originalNumber + " X 2 = " + calculatedNumber);
    // ask the user for another number or sentinal 0 to quit
     System.out.print("Enter a number or 0 to quit game: ");
 originalNumber = keyboard.nextDouble();
 } // end while 
 System.out.println(" Thanks for playing!");
 }//end main
}//end class