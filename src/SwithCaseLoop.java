import java.util.Scanner;

public class SwithCaseLoop {
    public static void main(String[] args) {

        //Введите номер дня недели (от 1 до 7) с клавиатуры. По порядковому номеру дня недели необходимо вывести его название на экран.

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели:");
        String weekDay = inputValue.nextLine();

        int intWeekDay = Integer.valueOf(weekDay);
        switch (intWeekDay) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default: System.out.println("День недели с таким номером не найден");
        }

        System.out.println("Input the month number here");
        int monthNumber = inputValue.nextInt();

        switch (monthNumber) {
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("There is no month with such ID");
        }


    }
}
