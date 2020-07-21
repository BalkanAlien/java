public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Index\tValue");
        int bucky[] = {32, 12, 18, 54, 2};

        for (int i=0; i<bucky.length; i++) // array.length stores the length of the array
        {
            System.out.println(i + "\t" + bucky[i]);
        }

    }
}
