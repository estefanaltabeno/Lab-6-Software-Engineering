import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
    {
        //Template Line
        System.out.println("Hello. What is your name?");

        //Introducing the scanner and identifying the variable "name", accepting user input for the variable name.
        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.next();

        //Template Line
        System.out.println("It's nice to meet you, " + name + ". How old are you? ");

        //Next variable being age, identifying age as an integer and accepting user input for their age.
        String age;
        age = scanner.next();

        //Template Lines
        System.out.println("I see that you are still quite young at only " + age + ".");
        System.out.println("Where do you live? ");

        //Next variable being where they live, introducing it as a String and accepting user input.
        String location;
        location = scanner.next();

        //Template Lines
        System.out.println("Wow! I've always wanted to go to " + location + ". Thanks for chatting with me. Bye!");

        //this is the change in the goods yeye


    }
}
