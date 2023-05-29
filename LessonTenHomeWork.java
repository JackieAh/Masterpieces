public class LessonTenHomeWork {
    public static void main(String[] args) {
        int floor = 200;
        int stepUp = 50;
        int stepDown = 1;
        int lifts = numberOfLifts(floor, stepUp, stepDown);
        System.out.println("Количество подъемов, необходимых лифту: " + lifts);
    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int lifts = 0;
        int currentFloor = 0;

        while (currentFloor < floor) {
            currentFloor += stepUp;
            lifts++;

            if (currentFloor >= floor) {
                break;
            }

            currentFloor -= stepDown;
        }

        return lifts;
    }

}
