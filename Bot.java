import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {

        informationAboutString ();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Please indicate the number of shipments you would like to send. Please note, you can send any number of shipments, but they all should be of the same size and the same weight.");
int number = scanner.nextInt();
        System.out.println("Thank you! Please indicate the weight of one shipment in the format 'kg,gr'");
float weight = scanner.nextFloat();
        System.out.println("Thank you! Now please indicate the first name of the recipient of your shipment");
        Scanner reader = new Scanner(System.in);
        String firstName = reader.nextLine();
        if (firstName.isBlank()) {
            System.out.println("You cannot leave this field empty. Please indicate the first name of the recipient");
            firstName = reader.nextLine(); }
        System.out.println("Thank you! Now please indicate the last name of the recipient of your shipment");
        String lastName = reader.nextLine();
        if (lastName.isBlank()) {
            System.out.println("You cannot leave this field empty. Please indicate the last name of the recipient");
            lastName = reader.nextLine(); }
        System.out.println("Please indicate the address of the recipient");
        String address = reader.nextLine();
        if (address.isBlank()) {
            System.out.println("You cannot leave this field empty. Please indicate the address of the recipient");
            address = reader.nextLine(); }
System.out.println("Thank you! Please check if all information is correct:");
        System.out.println("Recipient name: \"" + firstName.toUpperCase() + " " + lastName.toUpperCase() + "\"");
System.out.println("Recipients address: \"" + address.toUpperCase() + "\"");
float total = number * weight;
System.out.println("Total Shipment Weight: " + total + " kg");
        System.out.println("Is this information correct? True or false");
        boolean validate = reader.nextBoolean();
        System.out.println("Thanks for using our service! Validation = " + validate);
    }

    static void informationAboutString() {
    }

}
