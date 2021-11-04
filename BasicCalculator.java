import java.util.Scanner;

public class BasicCalculator {
  public static void main(String[] arg){
      int num1;
      int num2;
      int sum;
      int subt;
      float div;
      int mult;
      float remain;
      Scanner sc = new Scanner(System.in);
      System.out.print("Please Enter the first number- ");
      num1 = sc.nextInt();
      System.out.print("Please enter the second number- ");
      num2 = sc.nextInt();
      sum = num1 + num2;
      subt = num1 - num2;
      div = num1/num2;
      mult = num2*num1;
      remain =num1%num2;

      System.out.println("The sum of numbers are "+ sum);
      System.out.println("The Subtraction of numbers are "+ subt);
      System.out.println("The multiplication of numbers are "+ mult);
      System.out.println("The divsion of numbers are "+ div);
      System.out.println("The remainder of numbers are "+ remain);


  }   
}
