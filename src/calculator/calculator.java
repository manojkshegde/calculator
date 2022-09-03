package calculator;
import java.util.*;

public class calculator {
	public static void main(String[] args) {
	      double num1;
	      double num2;
	     
	      char op;
	      
	      //input two numbers, separate with space 
	      Scanner reader = new Scanner(System.in);
	      System.out.print("Enter two numbers: ");
	      num1 = reader.nextDouble();
	      num2 = reader.nextDouble();
	      
	      //enter operator to be applied to the numbers
	      System.out.print("\nEnter an operator (+, -, *, /): ");
	      op = reader.next().charAt(0);
	      
	      //take input for calculation
	      compute math = new compute();
	      math.calcCompute(num1, num2, op);
	      
	      
	   }
}
