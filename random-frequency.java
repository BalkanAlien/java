import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        
        Random rand = new Random();
        int freq[] = new int[7];

        for (int roll = 1; roll < 1000; roll++)
        {
            ++freq[1+rand.nextInt(6)]; //generating random numbers from 1 to 6 and storing their frequency in an array
        }

        System.out.println("Face\tFrequency");

        for (int face = 1; face < freq.length; face++)
        {
            System.out.println(face + "\t" + freq[face]);
        }

    }
}
