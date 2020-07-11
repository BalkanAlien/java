import java.util.Scanner; 

class apples{
public static void main(String args[]) {
    Scanner bucky = new Scanner(System.in); 
    double num1, num2, answer;
    System.out.println("Enter first number:");
    num1 = bucky.nextDouble(); // variable = scannerVariable.nextVariableType() that user inputs from keyboard
    System.out.println("Enter second number:");
    num2 = bucky.nextDouble();
    answer = num1 + num2;
    System.out.println(answer);


}
}