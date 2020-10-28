import java.util.Random;
import java.util.Scanner;
/**
*
* class RollDie
*
* @author  Andrew Kuekam
* @version 1.0
* @since   2020-18-09
*/
 
public class RollDie {
  
  //Declare var
  static int maxVal;
  int num = 1;
  
    public static void main(String[] args) {
      
      //procedure
      GenerateRandNum(maxVal);
    }  
    
    public static void GenerateRandNum(int maxVal) {
      
      //This read the input from the console
      Scanner usermaxInput = new Scanner(System.in);
      
      System.out.println("Please enter the max value for the random number:");
      
      //This generate a number between 1 and max
      Random randomNum = new Random();
      
      //get userinput to max val
      int maxval = usermaxInput.nextInt();
      
      //number between 0 and 49
      int num = randomNum.nextInt(maxVal);
      
      //Display the num
      System.out.println(" The random number is " + num);
    }  
}
