public class tuna {

    private String boyName; //private means that this variable can be used only inside of this class called 'tuna'

    public tuna (String name) // creating a constructor object 
    {
        boyName = name;
    }

    public void setName (String name) //function which sets the value of the parameter as the value of boyName variable
    {
        boyName = name;
    }

    public String getName () //function which returns the value of the boyName variable
    {
        return boyName;
    }

    public void Saying() //function which prints out the name of your first boyfriend
    {
        System.out.printf("Your first boyfriend was %s\n", getName()); //C feature here
    }
}