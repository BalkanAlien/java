import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /*int bucky[] = new int[10]; //array initialization
        

        bucky[0] = 87;
        bucky[1] = 543;
        bucky[9] = 65;

        System.out.println(bucky[1]);
        
        int bucky[] = {2,4,5,7,9};
        System.out.println(bucky[2]);
        */
        Scanner bucky = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = bucky.nextInt();

        //entering the elements of the array
        int array[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0; i<n; i++)
        {
            array[i] = bucky.nextInt();
        }
        bucky.close();

        //printing out the elements of the array
        System.out.println("You have entered:");
        for (int i=0; i<n; i++)
        {
            System.out.println(array[i]);
        }



    }
}
