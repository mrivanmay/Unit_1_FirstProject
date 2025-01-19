//        Напишите программу, которая будет переводить секунды в отформатированный вид - часы, минуты, секунды. Слова должны иметь правильное окончание.
//
//        Для более высокого балла добавьте недели и сутки.
//
//        Постарайтесь не выводить данные, значение которых равно 0

import java.util.Scanner;

public class TaskForMarkOne {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            //впервые юзанем лонг
            //        //в одном часе 60 минут
            //        //в одной минуте 60 секунд
            //        //в одном часе 60*60=3600 секунд
            //        //в сутках 24 часа = 3600*24 = 86400
            //        //в неделе 7 суток = 86400*7 = 604800
            // секунды [0;59]                          |
            // минуты  [0;59][60;3599]                 |
            // часы    [0;23][3600;86399]              |
            // сутки   [0; 6][86400; 604799]           |
            // недели  [0; Infinity][604800; Infinity] |

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество секунд");
            long totalAmount = scanner.nextLong();

            if (totalAmount < 0) {
                System.out.println("А время вспять не обернуть, братан!");
                return;
            } else if (totalAmount == 0) {
                System.out.println("По нулям");
                return;
            }

            long remainder;

            long weeksAmount = totalAmount / 604800;
            remainder = totalAmount % 604800;

            long daysAmount = remainder / 86400;
            remainder = remainder % 86400;

            long hoursAmount = remainder / 3600;
            remainder = remainder % 3600;

            long minutesAmount = remainder / 60;
            remainder = remainder % 60;

            long secondsAmount = remainder;

            // проверка System.out.println(weeksAmount + "   " + daysAmount + "   " + hoursAmount + "   " + minutesAmount + "   " + secondsAmount);

            // А теперь окончания и офрмирование строки
            String result = "";

            if (weeksAmount > 0) {
                result += weeksAmount;

                if ((weeksAmount % 10 == 0) || (10 < weeksAmount % 100 && weeksAmount % 100 <= 20)) {
                    result += " недель ";
                } else if (weeksAmount % 10 == 1) {
                    result += " неделя ";
                } else if (2 <= weeksAmount % 10 && weeksAmount % 10 <= 4) {
                    result += " недели ";
                } else {
                    result += " недель ";
                }

            }

            if (daysAmount > 0) {
                result += daysAmount;

                if ((daysAmount % 10 == 0) || (10 < daysAmount % 100 && daysAmount % 100 <= 20)) {
                    result += " дней ";
                } else if (daysAmount % 10 == 1) {
                    result += " день ";
                } else if (2 <= daysAmount % 10 && daysAmount % 10 <= 4) {
                    result += " дня ";
                } else {
                    result += " дней ";
                }
            }

            if (hoursAmount > 0) {
                result += hoursAmount;

                if ((hoursAmount % 10 == 0) || (10 < hoursAmount % 100 && hoursAmount % 100 <= 20)) {
                    result += " часов ";
                } else if (hoursAmount % 10 == 1) {
                    result += " час ";
                } else if (2 <= hoursAmount % 10 && hoursAmount % 10 <= 4) {
                    result += " часа ";
                } else {
                    result += " часов ";
                }

            }

            if (minutesAmount > 0) {
                result += minutesAmount;

                if ((minutesAmount % 10 == 0) || (10 < minutesAmount % 100 && minutesAmount % 100 <= 20)) {
                    result += " минут ";
                } else if (minutesAmount % 10 == 1) {
                    result += " минута ";
                } else if (2 <= minutesAmount % 10 && minutesAmount % 10 <= 4) {
                    result += " минуты ";
                } else {
                    result += " минут ";
                }

            }

            if (secondsAmount > 0) {
                result += secondsAmount;

                if ((secondsAmount % 10 == 0) || (10 < secondsAmount % 100 && secondsAmount % 100 <= 20)) {
                    result += " секунд ";
                } else if (secondsAmount % 10 == 1) {
                    result += " секунда ";
                } else if (2 <= secondsAmount % 10 && secondsAmount % 10 <= 4) {
                    result += " секунды ";
                } else {
                    result += " секунд ";
                }

            }

            System.out.println(result);
        }
    }
}
