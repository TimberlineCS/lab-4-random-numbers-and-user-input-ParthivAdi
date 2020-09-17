import java.io.*;
import java.text.spi.DecimalFormatSymbolsProvider;
import java.util.*;
public class Lab4{
  public static void main(String args[]){
    //Challenge 1

        Scanner RandNumb = new Scanner(System.in); 

    System.out.println("Type in a negative number");
    int firstNumb = RandNumb.nextInt();
    int a = firstNumb * -1;
    System.out.println("Type in a positive number that is greater than " + a );
    int secondNumb = RandNumb.nextInt();
    int range = secondNumb - firstNumb;
    int answer1 = (int)(Math.random()*range + firstNumb);
    int answer2 = (int)(Math.random()*range + firstNumb);
    System.out.println("You got " + answer1 + " and " + answer2 );
    
    //Challenge 2
    Scanner madLibs = new Scanner(System.in);

    System.out.println("A name?");
    String name = madLibs.nextLine();
    System.out.println("An object?)");
    String object = madLibs.nextLine();
    System.out.println("A number with 2 decimal places?");
    double decimal = madLibs.nextdouble();
    System.out.println("A number?");
    int number = madLibs.nextInt();
    
    System.out.println("Last year, " + name + " bought " + number + " " + object + "for $" + decimal);   
  }
}