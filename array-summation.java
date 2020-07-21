public class App {
    public static void main(String[] args) throws Exception {
        int bucky[] = {21, 16, 86, 21, 3};
        int sum = 0;
        int product = 1;
        
        for (int i=0; i<bucky.length; i++)
        {
            sum+=bucky[i];
            product*=bucky[i];
        }


        System.out.println("The sum of these numbers is: " + sum);
        System.out.println("The product of these numbers is: " + product);
    }   
}
