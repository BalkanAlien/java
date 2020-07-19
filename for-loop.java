import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to print out?");
        int n = input.nextInt();
        System.out.println("Here you go ...");
        for (int i=1; i<=n; i++)
        {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
