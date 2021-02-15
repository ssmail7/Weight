//**************************************************************
//  Steven Smail
//  Weight.java
//
//  Compute the ideal weight for both males and females
//  who are over 5 feet tall.
//**************************************************************
import java.util.Scanner;

public class Weight
{
  public static void main(String[] args)
   {
    int feet, inches, heightInches, weightFemale, weightMale;

      Scanner scan = new Scanner (System.in);

    System.out.println("Please enter your height... ");
    System.out.print("feet: ");
    feet = scan.nextInt();
    System.out.print("inches: ");
    inches = scan.nextInt();

    heightInches = 12 * feet + inches;

    weightFemale = 100 + (heightInches - 60) * 5;

    weightMale = 106 + (heightInches - 60) * 6;

    System.out.println("The ideal weight for a female at " + feet +
    " ft. " + inches + " in. height is " + weightFemale + " lbs. ");

    System.out.println("The ideal weight for a male at " + feet +
    " ft. " + inches + " in. height is " + weightMale + " lbs. ");
   }
}
