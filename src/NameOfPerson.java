import java.util.Scanner;

public class NameOfPerson {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your first name, middle initial and last name one by one");
        String fName, mInitial, lName;
        fName = keyboard.next();
        mInitial = keyboard.next();
        lName = keyboard.next();
        System.out.println("Your name is: "+fName+" "+mInitial+"."+" "+lName);
    }
}
