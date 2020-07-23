public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(average(43,56,76,8,65,76,2,31));
    }
    public static int average(int...numbers) //... means we can add however arguments we want to the method call
    {
        int total=0;
        for (int x : numbers)
            total+=x;
        
        return total/numbers.length;

    }
}
