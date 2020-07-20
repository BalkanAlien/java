import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        
        Random dice = new Random(); //creating an object dice of class Random
        int number;

        for (int counter = 1; counter <= 10; counter++)
        {
            number = 1 + dice.nextInt(6); // we add 1 because the compiler counts from 0
            System.out.println(number + " ");
        }
    }
}
