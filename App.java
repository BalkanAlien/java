import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner (System.in); // input stream
        tuna tunaObject = new tuna(); // object of type 'class tuna'
        System.out.println("Enter the name of your first boyfriend:");
        String temp = input.nextLine(); //temp stores whatever the user inputs
        tunaObject.setName(temp); //takes the name entered and sets it equal to boyName
        tunaObject.Saying(); 




    }
}
