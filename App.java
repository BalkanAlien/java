public class App {
    static void saySomething()
    {
        System.out.println("Something!");
    }
    static void saySomethingElse(String text)
    {
        System.out.println(text);
    }
    static int methodSum (int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args) throws Exception {
        saySomething();
        saySomethingElse("Hi, Marija!");

        int sum = methodSum(4,5);
        System.out.println(sum);
    }
}
