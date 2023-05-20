public class EnumHw {
    enum Months {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    }

    public static void main(String[] args) {
        Months month = Months.DECEMBER;
        int days = daysInAMonth(month);
        System.out.println("The number of days in that month is: " + days);
    }

    public static int daysInAMonth(Months month) {
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                return 31;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            case FEBRUARY:
                return 28;
            default:
                return 0;
        }
    }
}
