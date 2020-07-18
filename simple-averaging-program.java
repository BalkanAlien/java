import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter = 0;

        while (counter < 10)
        {
            grade = input.nextInt(); //inputting 10 grades from keyboard
            total += grade;
            counter++;
        }
        input.close();
        average = total / 10;
        System.out.println("Your average is " + average);


    }
}
