public class App {
    public static void main(String[] args) throws Exception {
        int bucky[] = {3, 4, 5, 6, 7};
        change(bucky); //method call

        for (int y : bucky)
        {
            System.out.println(y);
        }
    }

    //method which adds 5 to the value of each element of the array
    public static void change (int x[]) //arrays are passed by reference, no need of return statement
    {
        for (int counter = 0; counter < x.length; counter++)
        {
            x[counter]+=5; 
        }
    }
}
