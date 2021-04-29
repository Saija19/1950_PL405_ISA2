import java.util.Scanner;
 
public class Calculations
{
    public static void main(String args[])
  {
    int a=2, b=4, add, subtract, multiply;
    float divide;
    
    add = a + b;
    subtract = a - b;
    multiply = a * b;
    divide = (float) a / b;
    
    System.out.println("The 2 numbers are 2 and 4 \n");
    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + divide);
  }
}

