import java.util.Scanner;

public class NewJavaClass {

    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Hi! What's your first name?");
        String FirstName = reader.nextLine();

        System.out.println("Thanks! What's your last name?");
        String LastName = reader.nextLine();

        System.out.println("Cool! This is your full name:");
        String FullName = FirstName + " " + LastName;
        System.out.println(FullName);

    System.out.println("hello " + FullName + "!");

}
}
