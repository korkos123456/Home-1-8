import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       // пиши наш код тут
        printIsLeap(2020);
        printInstallationMessage(1, 2020);
        printCalculateDay(90);

        //task1();
    }

    private static void printIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Висакосный год");
        } else {
            System.out.println("Не выисакосный год");
        }
    }

    //task2();
    private static void printInstallationMessage(int os, int productionYear) {
        if (!(os == 0 || os == 1)) {

        }
        var currentYear = LocalDate.now().getYear();
        String versionMessage = productionYear < currentYear ? "облегченную" : "";
        String osMessage = os == 0 ? "iOS" : "android";
        System.out.printf("Установите %s версию  приложения для %s по ссылке", versionMessage, osMessage);


    }

    private static void printCalculateDay(int distance) {
        int start = 20;
        int step = 40;
        int result; // кол во дней
        if (distance < start) {
            result = 1;
        } else {
            result = (Math.abs((distance - start) / step) + 2);
        }
        System.out.println("Потребуется для доставки дней:" + result);
    }
}













