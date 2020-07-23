import jdk.javadoc.internal.doclets.toolkit.taglets.SystemPropertyTaglet;

public class main {
    public static void main(String[] args)
    {
        tuna tunaObject = new tuna(); //creating object of class tuna
        System.out.println(tunaObject.toMilitary());
        tunaObject.setTime(13, 27, 6);
        System.out.println(tunaObject.toMilitary());
    }
}