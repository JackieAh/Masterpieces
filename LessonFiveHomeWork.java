public class LessonFiveHomeWork {
    public static void main(String[] args) {

// Создайте две переменные isWeekend и isRain. Создайте переменную canWalk, значение которой должно быть истинным,
// если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
boolean isWeekend = true;
boolean isRain = false;
boolean canWalk = isWeekend == true && isRain == false;
        System.out.println(canWalk);

        // Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
        // Реализует логический метод canBuy,, возвращающий true ** Значение этой переменной должно быть true,
        // если хотя бы один магазин открыт, иначе false. Отобразите строку «Я могу купить еду,
        // это ……» и значение.

boolean isEdekaOpen = false;
boolean isReweOpen = true;
boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println("I can go get food at a supermarket, this is " + canBuy);

        // Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно, если температура
        // первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов. Вы должны написать метод,
        // который проверяет это устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2.
        // В результате он выводит сообщение true или false.

 double temperature1 = 99;
 double temperature2 = 101;
 boolean ok = temperature1 > 100 && temperature2 < 100;
        System.out.println("Based on the temperature measurements, this device will work, this is " + ok);


        // Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня.
        // Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
        // когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов —
        // на табло отображается «0» (т.е. рабочий день закончился). Некоторый сотрудники не умеют оценивать
        // остаток рабочего дня в секундах. Итак: требуется написать программу, которая вместо секунд будет
        // выводить на табло понятные фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
        //Например: «осталось 7 час/а/ов», «осталось 4 час/а/ов», «остался 1 час/а/ов»
        //Обьяснение: в переменную n должно записываться случайное (на время тестирования программы) целое число
        // из диапазона от 0 до 28800, далее оно должно выводиться на экран (для тех, кто понимает в секундах)
        // и на следующей строке (для тех кто не понимает) должна выводиться фраза о количестве полных часов,
        // содержащихся в n секундах.

        int min = 0;
        int max = 28800;
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Working time left for today is: " + random_int + " seconds");
        System.out.println("Working time left for today is: " + random_int / 3600 + " hours");

    }
}