public class App {
    public static void main(String[] args) throws Exception {
        int bucky[] = {3,4,5,6,7};
        int total = 0;
        int product = 1;

        for (int x : bucky) //for each loop which loops through each element of the array
        {
            total+=x;
        }

        for (int x : bucky) //data type identifier : array name
        {
            product*=x;
        }

        System.out.println("The sum of the elements is " + total);
        System.out.println("The product of the elements is " + product);
    }
}
