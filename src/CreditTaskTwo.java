import java.util.Scanner;

public class CreditTaskTwo {
    public static void main(String[] args) {
        // Напишите программу расчета даты следующего дня введя 3 числа - день, месяц и год.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day");
        int day = scanner.nextInt();

        System.out.println("Enter month");
        int month = scanner.nextInt();

        System.out.println("Enter year");
        int year = scanner.nextInt();

        String outputText = "";

        //определяем тип года //"1 - simple, 2 - високосный"
        int yearType = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ? 2 : 1;

        //вычисляем, сколько дней в месяце
        int howManyDaysInMonth = switch (month) {
            case 1 -> 31;
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> 0;
        };

        if (month == 2 && yearType == 2) {
            howManyDaysInMonth = 29;
        } else if (month == 2 && yearType == 1) {
            howManyDaysInMonth = 28;
        }

        if ((day <= 0 || day > howManyDaysInMonth ) || (month <=0 || month > 12) || (year <= 0)) {
            System.out.println("Даты не существует");
            return;
        }

//            System.out.println(howManyDaysInMonth);
//            System.out.println(yearType);

        //задаем переменные результата
        int resultDay;
        int resultMonth;
        int resultYear;

        //хуярим условности
        if ((day == howManyDaysInMonth) && (month == 12)) {
            resultDay = 1;
            resultMonth = 1;
            resultYear = year + 1;
        } else if (day == howManyDaysInMonth) {
            resultDay = 1;
            resultMonth = month + 1;
            resultYear = year;
        } else {
            resultDay = day + 1;
            resultMonth = month;
            resultYear = year;
        }

        outputText = "Следующий день: " + resultDay + "/" + resultMonth + "/" + resultYear;
        System.out.println(outputText);

        // условие для високосного года: (yearNum % 4 == 0) && (yearNum / 100 != 0) || (yearNum / 400 == 100)
        // 01 31
        // 02 28 (29)
        // 03 31
        // 04 30
        // 05 31
        // 06 30
        // 07 31
        // 08 31
        // 09 30
        // 10 31
        // 11 30
        // 12 31




        // високосный год - //        // 4. Введите год с клавиатуры. Определить количество дней в году (високосный или нет).
        ////        System.out.println("Загадайте любой год: ");
        ////        int yearNum = inputValue.nextInt();
        ////
        ////        if (yearNum <= 0) {
        ////            System.out.println("Не существует такого года. Его никогда не было и не будет! Смирись");
        ////        } else if ((yearNum % 4 == 0) && (yearNum / 100 != 0) || (yearNum / 400 == 100)) {
        ////            System.out.println("Год високосный. Количество дней в году - 366");
        ////        } else {
        ////            System.out.println("Год не високосный. Количество дней в году - 365");
        ////        }


    }
}
