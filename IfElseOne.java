import java.util.Scanner;

public class IfElseOne {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        //checkNumber();
        // checkEven();


        // System.out.println("Please enter any year and we'll tell you if it's a leap year or not");
        //int year = SCANNER.nextInt();
        //boolean isLeap = leapYear(year);
        // System.out.println("The year you entered is a leap year: this is " + isLeap);


        // System.out.println("Please enter the points you scored to get to know your grade");
        // int points = SCANNER.nextInt();
        // String gradeLetter = checkGrade(points);
        // System.out.println("Your grade is " + gradeLetter);

        System.out.println("Please enter any month name");
        String month = SCANNER.nextLine();
        String season = checkSeason(month);
        System.out.println("The season your month belongs to is: " + season);

    }

    //Напишите метод, который проверяет, является ли заданное число положительным,
// отрицательным или нулём и печатает ответ в консоль
    static void checkNumber() {
        int input;
        System.out.println("Please enter any number");
        input = SCANNER.nextInt();

        if (input < 0) {
            System.out.println("Looks like it's a negative number");
        } else if (input > 0) {
            System.out.println("Looks like it's a positive number");
        } else if (input == 0) {
            System.out.println("Looks like it's a zero");
        } else {
            System.out.println("Sorry, it doesn't seem to be a number. Please try again.");
        }
    }

    // Напишите метод, который определяет, является ли заданное число чётным или нечётным
// и печатает ответ в консоль
    static void checkEven() {
        int input;
        System.out.println("Please enter any number");
        input = SCANNER.nextInt();

        if (input % 2 == 0) {
            System.out.println("Looks like it's an even number");
        } else if (input == 0) {
            System.out.println("Looks like it's a zero");
        } else if (input % 2 != 0) {
            System.out.println("Looks like it's an odd number");
        } else {
            System.out.println("Sorry, it doesn't seem to be a number. Please try again.");
        }
    }

    // Напишите метод, который проверяет, является ли заданный год високосным или нет.Метод возвращает boolean
    //Год, который делится на 4 без остатка, является високосным, за исключением:
    //-Годов, которые делятся на 100 без остатка. Они не являются високосными, за исключением:
    //-Годов, которые делятся на 400 без остатка. Они являются високосными.
    //для решения используйте вложенные if-else
    public static boolean leapYear(int year) {
        boolean isLeap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // Напишите метод, который определяет оценку студента в зависимости от полученного балла:
//90-100 - A, 80-89 - B, 70-79 - C, 60-69 - D, меньше 60 - F.
//Метод принимает число в качестве аргумента и возвращает строку
    public static String checkGrade(int grade) {
        if (grade < 60) {
            return "F";
        } else if (grade >= 60 && grade <= 69) {
            return "D";
        } else if (grade >= 70 && grade <= 79) {
            return "C";
        } else if (grade >= 80 && grade <= 89) {
            return "B";
        } else if (grade >= 90 && grade <= 100) {
            return "A";
        } else {
            return "Error. The score point range is between 0 and 100. Try again";
        }
    }
// Напишите метод, который определяет время года (весна, лето, осень, зима) в зависимости от заданного месяца.
//используйте конструкции if-else-if. Метод принимает строку и возвращает тоже строку

    public static String checkSeason(String month) {

        if (month.equals("January") || month.equals("February") || month.equals("December"));

        {
            return "winter";
        }
        else if (month.equals("March") || month.equals("April") || month.equals("May"));
        {
            return "spring";
        }
        else if (month.equals("June") || month.equals("July") || month.equals("August"));
        {
            return "summer";
        }
        else if (month.equals("September") || month.equals("October") || month.equals("November"));
        {
            return "autumn";
        }
        else {
            return "Error, invalid month";
        }
    }

}



