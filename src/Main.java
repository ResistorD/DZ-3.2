//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Домашка 3.2");

        System.out.println("Задача 1");

        int clientOS;

        clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println("Задача 2");

        int clientOS1 = 0;
        int clientDeviceYear = 2015;

        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println("Задача 3");

        int year = 2021;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int deliveryDays;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("Доставка не доступна для расстояния более 100 км.");
            return;
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        System.out.println("Задача 5");

        int monthNumber = 12;

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Некорректный номер месяца. Пожалуйста, введите число от 1 до 12.");
            return;
        }

        String season = "";

        switch (monthNumber) {
            case 12: // Декабрь
            case 1:  // Январь
            case 2:  // Февраль
                season = "зима";
                break;
            case 3:  // Март
            case 4:  // Апрель
            case 5:  // Май
                season = "весна";
                break;
            case 6:  // Июнь
            case 7:  // Июль
            case 8:  // Август
                season = "лето";
                break;
            case 9:  // Сентябрь
            case 10: // Октябрь
            case 11: // Ноябрь
                season = "осень";
                break;
            default:
                System.out.println("Нет такого месяца.");
        }

        System.out.println(monthNumber + "-й месяц принадлежит к сезону " + season + ".");

    }
}

