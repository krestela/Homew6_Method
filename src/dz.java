import java.time.Instant;
import java.time.LocalDate;

public class dz {

    public static void printIsEachYear(int year) {
        boolean eachYear = isEachYear(year);
        printIsEachYearResult(year, eachYear);
    }

    public static boolean isEachYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printIsEachYearResult(int year, boolean eachYear) {
        if (eachYear) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static void printOS(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("lite");
        }
        System.out.print("версию для");
        if (clientOS == 0) {
            System.out.println("IOS");
        } else {
            System.out.print("Android");
        }
    }

    public static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    public static void main(String[] args) {
    }
    public static void deliveryCalculate(int deliveryDistance){
        int day = 1;
        if (deliveryDistance>20){
            day++;
        }
        if (deliveryDistance>60){
            day++;
        }
        System.out.println("Потребуется дней: "+day);
    }
}
