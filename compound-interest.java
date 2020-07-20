public class App {
    public static void main(String[] args) throws Exception {
        
        //Amount = Principal (1 + Rate) ^ NumberOfDays
        double amount;
        double principal = 10000;
        double rate = .01;

        for (int day = 1; day <= 20; day++)
        {
            amount = principal * Math.pow(1 + rate, day);
            System.out.println(day + "   " + amount); //prints out day 1-20 and the total number of subscribers we have that day
        }



    }
}
