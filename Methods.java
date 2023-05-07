
import java.util.Scanner;

public class Methods {

    public static void main(String[]  args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any word that consists of an even number of characters");
        String lineOne = scanner.nextLine();


        System.out.println("Thank you! Please enter another word that consists of an even number of characters");
        String lineTwo = scanner.nextLine();

        String sum = returnNewWord(lineOne, lineTwo);
        System.out.println("Your hybrid word is: " + sum);

int numberOne = 10;
int numberTwo = 5;
        int resultOne = operationAddition(numberOne, numberTwo);
        System.out.println("The result of the addition of two numbers = " + resultOne);

        int resultTwo = operationSubtraction(numberOne, numberTwo);
        System.out.println("The result of the subtraction of two numbers = " + resultTwo);

        int resultThree = operationMultiplication(numberOne, numberTwo);
        System.out.println("The result of the multiplication of two numbers = " + resultThree);

        int resultFour = operationDivision(numberOne, numberTwo);
        System.out.println("The result of the division of two numbers = " + resultFour);

        float amountEur = 100;
        float rateUsd = 1.12F;

        operationConversion();

    }
        static String returnNewWord(String lineOne, String lineTwo) {
            int lineOneLength = lineOne.length();
            int halfLineOneLength = lineOne.length() / 2;
            String halfLineOne = lineOne.substring(0, halfLineOneLength);
            int lineTwoLength = lineTwo.length();
            int halfLineTwoLength = lineTwo.length() / 2;
            String halfLineTwo = lineTwo.substring(halfLineTwoLength, lineTwoLength);
            String newWord = halfLineOne + halfLineTwo;
            return newWord;
                }

static int operationAddition(int numberOne, int numberTwo) {
    int resultOne = numberOne + numberTwo;
    return resultOne;
    }

    static int operationSubtraction(int numberOne, int numberTwo) {
        int resultTwo = numberOne - numberTwo;
        return resultTwo;
    }
    static int operationMultiplication(int numberOne, int numberTwo) {
        int resultThree = numberOne * numberTwo;
        return resultThree;
    }
    static int operationDivision(int numberOne, int numberTwo) {
        int resultFour = numberOne / numberTwo;
        return resultFour;
    }



    public static void operationConversion() {
        float amountEur = 100;
        float rateUsd = 1.12F;
        float resultConversion = amountEur * rateUsd;
        System.out.println("With the current exchange rate 1 EUR = 1.12 USD, for " + amountEur + " EUR, you will get " + resultConversion + " USD");
    }


}