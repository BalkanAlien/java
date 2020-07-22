import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int m; 
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        m = input.nextInt();
        System.out.println("Enter the number of columns:");
        n = input.nextInt();
        int matrix[][] = new int[m][n];//can't declare int matrix[m][n], this is not c++ have to declare type when declaring arrays
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("The 2D array looks like this:");
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Transpose the matrix:");
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
