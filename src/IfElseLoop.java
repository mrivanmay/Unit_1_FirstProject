import java.math.BigDecimal;
import java.util.Scanner;

public class IfElseLoop {

    static Scanner inputValue = new Scanner(System.in);

    public static void main(String[] args) {
//        //обычную конструкцию if-else можно заменить на тернарный оператор условия
//        //его синтаксис: ' Exp1 (условие) ? Exp2 (если истина) : Exp3 (если ложь); '
//
//        int exampleInt = 70;
//        int resultInt = 0;
//        int forOutput = exampleInt > 80 ? (resultInt += 1) : (resultInt -= 1);
//----------------------------------------------------------------------------------------------------------------------
//        // 1. Определить, является ли число четным или нечетным
//
//        System.out.println("Введите число: ");
//        int num1 = inputValue.nextInt();
//
//        if (num1 % 2 == 0) {
//            System.out.println(num1 + " - четное число");
//        } else if (num1 % 2 != 0) {
//            System.out.println(num1 + " - нечетное число");
//        } else {
//            System.out.println("Something went wrong");
//        }
//----------------------------------------------------------------------------------------------------------------------
//        // 2. Ввести число и проверить, кратно ли оно 7
//
//        System.out.println("Введите число: ");
//        int num2 = inputValue.nextInt();
//
//        if (num2 % 7 == 0) {
//            System.out.println(num2 + " - число кратно семи");
//        } else if (num2 % 7 != 0) {
//            System.out.println(num2 + " - число не кратно семи");
//        } else {
//            System.out.println("Something went wrong");
//        }
//----------------------------------------------------------------------------------------------------------------------
//        // 3. Введите 2 числа с клавиатуры. Найти ближайшее из их к 10.
//
//        System.out.println("Введите значение точки А: ");
//        int numA = inputValue.nextInt();
//
//        System.out.println("Введите значение точки B: ");
//        int numB = inputValue.nextInt();
//
//        // как узнать, какое число ближе к 10? 194 и 256
//        // Сначала узнаем длину отрезков.
//
//        int lineOne = 10 - numA;
//        int lineTwo = 10 - numB;
//
//        if (lineOne < 0) {
//            lineOne = -lineOne;
//        }
//
//        if (lineTwo < 0) {
//            lineTwo = -lineTwo;
//        }
//
//        if (lineOne < lineTwo) {
//            System.out.println(numA + " ближе к точке 10, чем " + numB);
//        } else if (lineTwo < lineOne) {
//            System.out.println(numB + " ближе к точке 10, чем " + numA);
//        } else if (lineOne == lineTwo) {
//            System.out.println("Обе точки равноудалены от точки 10");
//        } else {
//            System.out.println("Something went wrong");
//        }
//----------------------------------------------------------------------------------------------------------------------
//        // 4. Введите год с клавиатуры. Определить количество дней в году (високосный или нет).
//        System.out.println("Загадайте любой год: ");
//        int yearNum = inputValue.nextInt();
//
//        if (yearNum <= 0) {
//            System.out.println("Не существует такого года. Его никогда не было и не будет! Смирись");
//        } else if ((yearNum % 4 == 0) && (yearNum / 100 != 0) || (yearNum / 400 == 100)) {
//            System.out.println("Год високосный. Количество дней в году - 366");
//        } else {
//            System.out.println("Год не високосный. Количество дней в году - 365");
//        }
//----------------------------------------------------------------------------------------------------------------------
//        // 5. Введите 3 числа с клавиатуры. Найти наибольшее число.
//
//        System.out.println("Какое из трех чисел наибольшее?");
//
//        System.out.println("Введите первое число: ");
//        int valOne = inputValue.nextInt();
//
//        System.out.println("Введите второе число: ");
//        int valTwo = inputValue.nextInt();
//
//        System.out.println("Введите третье число: ");
//        int valThree = inputValue.nextInt();
//
//        //Как сравнивать их? наверное, будет тройное условие и три кейса
//        // a < b < c  ----  b < a < c  ----  c < b < a - не, хуйня какая-то
//
//        if (valOne > valTwo && valOne > valThree) {
//            System.out.println("Наибольшее число: " + valOne);
//        } else if (valTwo > valOne && valTwo > valThree) {
//            System.out.println("Наибольшее число: " + valTwo);
//        } else if (valThree > valOne && valThree > valTwo) {
//            System.out.println("Наибольшее число: " + valThree);
//        } else if (valOne == valTwo && valTwo == valThree) {
//            System.out.println("Все числа равны друг другу");
//        } else {
//            System.out.println("Чет хуйня какая-то, Ванька..");
//        }
//----------------------------------------------------------------------------------------------------------------------
//        // 6. Введите 3 числа с клавиатуры. Найти среднее число из трех
//
//        System.out.println("Какое из трех чисел среднее?");
//
//        System.out.println("Введите первое число: ");
//        int firstValue = inputValue.nextInt();
//
//        System.out.println("Введите второе число: ");
//        int secondValue = inputValue.nextInt();
//
//        System.out.println("Введите третье число: ");
//        int thirdValue = inputValue.nextInt();
//
//        if ((firstValue < secondValue && secondValue < thirdValue) || (thirdValue < secondValue && secondValue < firstValue)) {
//            System.out.println("Среднее число: " + secondValue);
//        } else if ((secondValue < firstValue && firstValue < thirdValue) || (thirdValue < firstValue && firstValue < secondValue)) {
//            System.out.println("Среднее число: " + firstValue);
//        } else if ((secondValue < thirdValue && thirdValue < firstValue) || (firstValue < thirdValue && thirdValue < secondValue)) {
//            System.out.println("Среднее число: " + thirdValue);
//        } else if (firstValue == secondValue && secondValue == thirdValue) {
//            System.out.println("Все числа равны друг другу");
//        } else {
//            System.out.println("Чет хуйня какая-то, Ванька..");
//        }
//----------------------------------------------------------------------------------------------------------------------
//        // 7.1 Введите 3 числа с клавиатуры. Выведите 3 числа в порядке возрастания. (ПИЗДЕЦ СЛОЖНО И НЕЧИТАЕМО)
//        System.out.println("Ща будут числа в порядке возрастания!");
//
//        System.out.println("Введите первое число: ");
//        int oneValue = inputValue.nextInt();
//
//        System.out.println("Введите второе число: ");
//        int twoValue = inputValue.nextInt();
//
//        System.out.println("Введите третье число: ");
//        int threeValue = inputValue.nextInt();
//
//        if (oneValue < twoValue && twoValue < threeValue) {
//            System.out.println("Числа в порядке возрастания: \n" + oneValue + "\n" + twoValue + "\n" + threeValue);
//        } else if (threeValue < twoValue && twoValue < oneValue) {
//            System.out.println("Числа в порядке возрастания: \n" + threeValue + "\n" + twoValue + "\n" + oneValue);
//        } else if (twoValue < oneValue && oneValue < threeValue) {
//            System.out.println("Числа в порядке возрастания: \n" + twoValue + "\n" + oneValue + "\n" + threeValue);
//        } else if (threeValue < oneValue && oneValue < twoValue) {
//            System.out.println("Числа в порядке возрастания: \n" + threeValue + "\n" + oneValue + "\n" + twoValue);
//        } else if (twoValue < threeValue && threeValue < oneValue) {
//            System.out.println("Числа в порядке возрастания: \n" + twoValue + "\n" + threeValue + "\n" + oneValue);
//        } else if (oneValue < threeValue && threeValue < twoValue) {
//            System.out.println("Числа в порядке возрастания: \n" + oneValue + "\n" + threeValue + "\n" + twoValue);
//        } else if (oneValue == twoValue && twoValue == threeValue) {
//            System.out.println("Все числа равны друг другу");
//        } else {
//            System.out.println("Чет хуйня какая-то, Ванька..");
//        }
//
//        // 7.2 Введите 3 числа с клавиатуры. Выведите 3 числа в порядке возрастания. (ПИЗДЕЦ ЛЕГКО И НЕЧИТАЕМО)
//        System.out.println("Ща ОПЯТЬ будут числа в порядке возрастания!");
//
//        System.out.println("Введите первое число: ");
//        int oneValue1 = inputValue.nextInt();
//
//        System.out.println("Введите второе число: ");
//        int twoValue2 = inputValue.nextInt();
//
//        System.out.println("Введите третье число: ");
//        int threeValue3 = inputValue.nextInt();
//
//        int maxValue = Math.max(Math.max(oneValue1, twoValue2), threeValue3);
//        int minValue = Math.min(Math.min(oneValue1, twoValue2), threeValue3);
//        int midValue = oneValue1 + twoValue2 + threeValue3 - minValue - maxValue;
//
//        System.out.println("Числа в порядке возрастания:\n" + minValue + "\n" + midValue + "\n" + maxValue);
//
//----------------------------------------------------------------------------------------------------------------------
//        // 8. Введите 3 числа с клавиатуры. Используя логические операторы, выведите на экран:
//        //    - Кратно ли 3 хотя бы одно число, введенное с клавиатуры
//        //    - Кратно ли 11 хотя бы одно число, введенное с клавиатуры
//        //    - Кратно ли 3 или 11 хотя бы одно число, введенное с клавиатуры
//
//        System.out.println("Ща посчитаем числа по-всякому");
//
//        //ввод
//        System.out.println("Введите первое число: ");
//        int value1 = inputValue.nextInt();
//        System.out.println("Введите второе число: ");
//        int value2 = inputValue.nextInt();
//        System.out.println("Введите третье число: ");
//        int value3 = inputValue.nextInt();
//
//        //кратно ли трем?
//        if (value1 % 3 == 0 || value2 % 3 == 0 || value3 % 3 == 0) {
//            System.out.println("Кратно ли 3 хотя бы одно число? \n ДА");
//        } else {
//            System.out.println("Кратно ли 3 хотя бы одно число? \n НЕТ");
//        }
//
//        //кратно ли одиннадцати?
//        if (value1 % 11 == 0 || value2 % 11 == 0 || value3 % 11 == 0) {
//            System.out.println("Кратно ли 11 хотя бы одно число? \n ДА");
//        } else {
//            System.out.println("Кратно ли 11 хотя бы одно число? \n НЕТ");
//        }
//
//        //кратно ли трем или 11?
//        if ((value1 % 3 == 0 || value1 % 11 == 0) || (value2 % 3 == 0 || value2 % 11 == 0) || (value3 % 3 == 0 || value3 % 11 == 0)) {
//            System.out.println("Кратно ли 3 или 11 хотя бы одно число? \n ДА");
//        } else {
//            System.out.println("Кратно ли 3 или 11 хотя бы одно число? \n НЕТ");
//        }
//
//----------------------------------------------------------------------------------------------------------------------
//        // 9. Определить возможность существования треугольника ABC по сторонам.
//        // Треугольник не может существовать, если одна из его сторон больше или равна суммы двух других сторон. В остальных случаях, вроде, может
//
//        System.out.println("Ща посмотрим, существует ли треугольник.");
//
//        //ввод
//        System.out.println("Введите значение стороны AB: ");
//        int odin = inputValue.nextInt();
//        System.out.println("Введите значение стороны BC: ");
//        int dwa = inputValue.nextInt();
//        System.out.println("Введите значение стороны AC: ");
//        int tri = inputValue.nextInt();
//
//        if ((odin + dwa > tri) && (odin + tri > dwa) && (tri + dwa > odin)) {
//            System.out.println("Треугольник со сторонами " + odin + ", " + dwa + ", " + tri + " существует");
//        } else {
//            System.out.println("Треугольник со сторонами " + odin + ", " + dwa + ", " + tri + " НЕ существует");
//        }
//----------------------------------------------------------------------------------------------------------------------
//         10. Создать программу, которая будет находить вещественные корни квадратного уравнения ax²+bx+c=0. Либо сообщать, что корней нет.
//         Вещественное число - число, у которого есть числитель и знаменатель.
//         Формулы:
//         D = b^2 - 4ac
//
//         D > 0 => два корня
//         x1 = (-b - корень_из_D) / 2a
//         x2 = (-b + корень_из_D) / 2a
//
//         D = 0 => два РАВНЫХ корня
//         x = -b / 2a
//
//         D < 0 => корней нет
//
//        //ввод коэффициентов
//        System.out.println("Ща будем вспоминать квадратные уравнения! ax^2 + bx + c. (a != 0)");
//
//        System.out.println("Введите коэффициент 'a': ");
//        double coefA = inputValue.nextDouble();
//
//        System.out.println("Введите коэффициент 'b': ");
//        double coefB = inputValue.nextDouble();
//
//        System.out.println("Введите коэффициент 'c': ");
//        double coefC = inputValue.nextDouble();
//
//        String equation = coefA + "x^2 " +
//                (coefB >= 0 ? "+ " : "- ") + Math.abs(coefB) + "x " +
//                (coefC >= 0 ? "+ " : "_ ") + Math.abs(coefC) + " = 0";
//
//
////  ЭТИ ПРОВЕРКИ - ПОЛНАЯ ХУ-Е-ТА как оказалось (но оно и было понятно +- ахах)
////            if (coefA < 0 && coefB < 0 && coefC < 0) {
////                double a = -coefA;
////                double b = -coefB;
////                double c = -coefC;
////                equation = "-" + a + "x^2 - " + b + "x - " + c + " = 0";
////            } else if (coefA < 0 && coefB < 0) {
////                double a = -coefA;
////                double b = -coefB;
////                equation = "-" + a + "x^2 - " + b + "x + " + coefC + " = 0";
////            } else if (coefA < 0) {
////                double a = -coefA;
////                equation = "-" + a + "x^2 + " + coefB + "x + " + coefC + " = 0";
////            } else {
////                equation = coefA + "x^2 + " + coefB + "x + " + coefC + " = 0";
////            }
//
//        if (coefA == 0) {
//            System.out.println("Старший коэффициент 'a' не может быть равен нулю");
//        } else {
//            double discriminant = coefB * coefB - 4 * coefA * coefC;
//
//            if (discriminant < 0) {
//                System.out.println("Уравнение (" + equation + ") не имеет корней");
//            } else if (discriminant == 0) {
//                // x = -b / 2a
//                double root = -coefB / (2 * coefA);
//                System.out.println("Уравнение (" + equation + ") имеет один корень: " + root);
//            } else if (discriminant > 0) {
//                // x1 = (-b - корень_из_D) / 2a
//                double root1 = (-coefB - Math.sqrt(discriminant)) / (2 * coefA);
//                // x2 = (-b + корень_из_D) / 2a
//                double root2 = (-coefB + Math.sqrt(discriminant)) / (2 * coefA);
//                System.out.println("Уравнение (" + equation + ") имеет два корня: \n 1) " + root1 + "\n2) " + root2);
//            }
//        }
//
//----------------------------------------------------------------------------------------------------------------------
//        // 11. Введите сумму с клавиатуры. Необходимо вывести сумму и в конце дописать название валюты с правильным окончанием.
//
//        System.out.println("Введите желаемую сумму в белорусских рублях: ");
//        double amount = inputValue.nextDouble();
//        double lastDigit = amount % 10;
//        double lastTwoDigits = amount % 100;
//
//        //printf - для вывода числа с двумя знаками после запятой. Но почему-то не работает
//        //Можно использовать еще 'String.format("%.2f", amount)'
//
//        if (amount < 0) {
//            System.out.println("Ты чё реально хочешь попросить у меня МИНУС денег? Ты адекват, чел?");
//        } else if (lastDigit == 1 && lastTwoDigits != 11) {
//            System.out.println("test" + lastDigit + ". Вы уверены, что вам хватит денег в размере " + String.format("%.2f", amount) + " Белорусский рубль?");
//        } else if ((lastDigit >= 2) && (lastDigit <= 4) && lastTwoDigits != 12 && lastTwoDigits != 13 && lastTwoDigits != 14) {
//            System.out.println("test" + lastDigit + ". Вы уверены, что вам хватит денег в размере " + String.format("%.2f", amount) + " Белорусских рубля?");
//        } else {
//            System.out.println("test" + lastDigit + ". Вы уверены, что вам хватит денег в размере " + String.format("%.2f", amount) + " Белорусских рублей?");
//        }
//
//----------------------------------------------------------------------------------------------------------------------
// 12-е задание вынесено в отдельный класс 'NumsToWords'
        // 12. Введите сумму с клавиатуры. Необходимо вывести словами введенную сумму и в конце дописать название валюты с правильным окончанием.
        // здесь нужна проверка на разрядность числа!! Я юзану встроенные механизмы.
        // int num = 12345;
        // int digitCount = (int) (Math.log10(num) + 1);
        // System.out.println("Разрядность числа " + num + " равна " + digitCount);
        // 1 - один
        // 2 - два
        // 3 - три
        // 4 - четыре
        // 5 - пять
        // 6 - шесть
        // 7 - семь
        // 8 - восемь
        // 9 - девять
        // 10 - десять
        // 11 - одиннадцать
        // 12 - двенадцать
        // 13 - тринадцать
        // 14 - четырнадцать
        // 15 - пятнадцать
        // 16 - шестнадцать
        // 17 - семнадцать
        // 18 - восемнадцать
        // 19 - девятнадцать
        // 20 - двадцать
        // 30 - тридцать
        // 40 - сорок
        // 50 - пятьдесят
        // 60 - шестьдесят
        // 70 - семьдесят
        // 80 - восемьдесят
        // 90 - девяноста
        // 100 - сто
        // 200 - двести
        // 300 - триста
        // 400 - четыреста
        // 500 - пятьсот
        // 600 - шестьсот
        // 700 - семьсот
        // 800 - восемьсот
        // 900 - девятьсот
        // 1000 - одна тысяча (21000, 31000, 51000 тысяча)
        // 2000 - две тысячи (3 и 4)
        // 5000 - пять тысяч

        System.out.println("Введите желаемую сумму в белорусских рублях (не более 6 знаков до запятой): ");
        BigDecimal amount = inputValue.nextBigDecimal();

        // вычисляем число на каждом разряде
        double lastDigit = amount.doubleValue() % 10;          // 4.xx
        double lastTwoDigits = amount.doubleValue() % 100;     // 74.xx
        double lastThreeDigits = amount.doubleValue() % 1000;  // 474.xx
        double lastFourDigits = amount.doubleValue() % 10000;  // 7474.xx
        double lastFiveDigits = amount.doubleValue() % 100000; // 57474.xx
        double lastSixDigits = amount.doubleValue() % 1000000; // 657474.xx

        int firstDigit = (int) (lastDigit);
        int secondDigit = (int) ((lastTwoDigits - lastDigit) / 10);
        int thirdDigit = (int) ((lastThreeDigits - lastTwoDigits) / 100);
        int fourthDigit = (int) ((lastFourDigits - lastThreeDigits) / 1000);
        int fifthDigit = (int) ((lastFiveDigits - lastFourDigits) / 10000);
        int sixthDigit = (int) ((lastSixDigits - lastFiveDigits) / 100000);

        //считаем копейки ёпта =(

        // Сначала умножим сумму на 100
        BigDecimal centsPart = amount;
        BigDecimal hundred = new BigDecimal(100);
        centsPart = amount.multiply(hundred);
        //теперь посчитаем значение правой и левой копейки и приведем к инту
        int amountMul100 = centsPart.intValue(); // переводим BigDecimal в Int
        int rightCentDigit = amountMul100 % 10; // правая копейка
        int leftCentDigit = ((amountMul100 % 100) - rightCentDigit) / 10; // левая копейка

//        System.out.println("Первая ----- " + firstDigit +
//                "\nВторая ----- " + secondDigit +
//                "\nТретья ----- " + thirdDigit +
//                "\nЧетвертая -- " + fourthDigit +
//                "\nПятая ------ " + fifthDigit +
//                "\nШестая ----- " + sixthDigit);

        String outputText = "";

        // if-else вывода чисел в текстовом формате
        double doubleAmount = amount.doubleValue();
        if (doubleAmount < 0) {
            System.out.println("Ты чё реально хочешь попросить у меня МИНУС денег? Ты адекват, чел?");
        } else if (doubleAmount > 999999) {
            System.out.println("Много хочешь и нихуя не получишь, Хо-Хо");
        } else if (doubleAmount == 0) {
            System.out.println("Сумма: Ноль Рублей Ноль Копеек");
        } else if (doubleAmount > 0) {

            // 6 разряд
            if (sixthDigit == 9) {
                outputText = "Девятьсот ";
            } else if (sixthDigit == 8) {
                outputText = "Восемьсот ";
            } else if (sixthDigit == 7) {
                outputText = "Семьсот ";
            } else if (sixthDigit == 6) {
                outputText = "Шестьсот ";
            } else if (sixthDigit == 5) {
                outputText = "Пятьсот ";
            } else if (sixthDigit == 4) {
                outputText = "Четыреста ";
            } else if (sixthDigit == 3) {
                outputText = "Триста ";
            } else if (sixthDigit == 2) {
                outputText = "Двести ";
            } else if (sixthDigit == 1) {
                outputText = "Сто ";
            }

            //5 и 4 разряд (сперва исключения 10-19, затем остальное в else)
            if ((fifthDigit == 1)) {

                if (fourthDigit == 9) {
                    outputText = outputText + "Девятнадцать Тысяч ";
                } else if (fourthDigit == 8) {
                    outputText = outputText + "Восемнадцать Тысяч ";
                } else if (fourthDigit == 7) {
                    outputText = outputText + "Семнадцать Тысяч ";
                } else if (fourthDigit == 6) {
                    outputText = outputText + "Шестнадцать Тысяч ";
                } else if (fourthDigit == 5) {
                    outputText = outputText + "Пятнадцать Тысяч ";
                } else if (fourthDigit == 4) {
                    outputText = outputText + "Четырнадцать Тысяч ";
                } else if (fourthDigit == 3) {
                    outputText = outputText + "Тринадцать Тысяч ";
                } else if (fourthDigit == 2) {
                    outputText = outputText + "Двенадцать Тысяч ";
                } else if (fourthDigit == 1) {
                    outputText = outputText + "Одиннадцать Тысяч ";
                } else if (fourthDigit == 0) {
                    outputText = outputText + "Десять Тысяч ";
                }

            } else {

                if (fifthDigit == 9) {
                    outputText = outputText + "Девяносто ";
                } else if (fifthDigit == 8) {
                    outputText = outputText + "Восемьдесят ";
                } else if (fifthDigit == 7) {
                    outputText = outputText + "Семьдесят ";
                } else if (fifthDigit == 6) {
                    outputText = outputText + "Шестьдесят ";
                } else if (fifthDigit == 5) {
                    outputText = outputText + "Пятьдесят ";
                } else if (fifthDigit == 4) {
                    outputText = outputText + "Сорок ";
                } else if (fifthDigit == 3) {
                    outputText = outputText + "Тридцать ";
                } else if (fifthDigit == 2) {
                    outputText = outputText + "Двадцать ";
                } else if (fifthDigit == 1) {
                    outputText = outputText + "Десять ";
                }

                if (fourthDigit == 9) {
                    outputText = outputText + "Девять Тысяч ";
                } else if (fourthDigit == 8) {
                    outputText = outputText + "Восемь Тысяч ";
                } else if (fourthDigit == 7) {
                    outputText = outputText + "Семь Тысяч ";
                } else if (fourthDigit == 6) {
                    outputText = outputText + "Шесть Тысяч ";
                } else if (fourthDigit == 5) {
                    outputText = outputText + "Пять Тысяч ";
                } else if (fourthDigit == 4) {
                    outputText = outputText + "Четыре Тысячи ";
                } else if (fourthDigit == 3) {
                    outputText = outputText + "Три Тысячи ";
                } else if (fourthDigit == 2) {
                    outputText = outputText + "Две Тысячи ";
                } else if (fourthDigit == 1) {
                    outputText = outputText + "Одна Тысяча ";
                } else if (fourthDigit == 0 && (fifthDigit > 0 || sixthDigit > 0)) {
                    outputText = outputText + "Тысяч ";
                }

            }


            //третий разряд
            if (thirdDigit == 9) {
                outputText = outputText + "Девятьсот ";
            } else if (thirdDigit == 8) {
                outputText = outputText + "Восемьсот ";
            } else if (thirdDigit == 7) {
                outputText = outputText + "Семьсот ";
            } else if (thirdDigit == 6) {
                outputText = outputText + "Шестьсот ";
            } else if (thirdDigit == 5) {
                outputText = outputText + "Пятьсот ";
            } else if (thirdDigit == 4) {
                outputText = outputText + "Четыреста ";
            } else if (thirdDigit == 3) {
                outputText = outputText + "Триста ";
            } else if (thirdDigit == 2) {
                outputText = outputText + "Двести ";
            } else if (thirdDigit == 1) {
                outputText = outputText + "Сто ";
            }

            //2 и 1 разряд (сперва исключения 10-19, затем остальное в else)
            if ((secondDigit == 1)) {

                if (firstDigit == 9) {
                    outputText = outputText + "Девятнадцать Рублей ";
                } else if (firstDigit == 8) {
                    outputText = outputText + "Восемнадцать Рублей ";
                } else if (firstDigit == 7) {
                    outputText = outputText + "Семнадцать Рублей ";
                } else if (firstDigit == 6) {
                    outputText = outputText + "Шестнадцать Рублей ";
                } else if (firstDigit == 5) {
                    outputText = outputText + "Пятнадцать Рублей ";
                } else if (firstDigit == 4) {
                    outputText = outputText + "Четырнадцать Рублей ";
                } else if (firstDigit == 3) {
                    outputText = outputText + "Тринадцать Рублей ";
                } else if (firstDigit == 2) {
                    outputText = outputText + "Двенадцать Рублей ";
                } else if (firstDigit == 1) {
                    outputText = outputText + "Одиннадцать Рублей ";
                } else if (firstDigit == 0) {
                    outputText = outputText + "Десять Рублей ";
                }

            } else {

                if (secondDigit == 9) {
                    outputText = outputText + "Девяносто ";
                } else if (secondDigit == 8) {
                    outputText = outputText + "Восемьдесят ";
                } else if (secondDigit == 7) {
                    outputText = outputText + "Семьдесят ";
                } else if (secondDigit == 6) {
                    outputText = outputText + "Шестьдесят ";
                } else if (secondDigit == 5) {
                    outputText = outputText + "Пятьдесят ";
                } else if (secondDigit == 4) {
                    outputText = outputText + "Сорок ";
                } else if (secondDigit == 3) {
                    outputText = outputText + "Тридцать ";
                } else if (secondDigit == 2) {
                    outputText = outputText + "Двадцать ";
                }

                if (firstDigit == 9) {
                    outputText = outputText + "Девять Рублей ";
                } else if (firstDigit == 8) {
                    outputText = outputText + "Восемь Рублей ";
                } else if (firstDigit == 7) {
                    outputText = outputText + "Семь Рублей ";
                } else if (firstDigit == 6) {
                    outputText = outputText + "Шесть Рублей ";
                } else if (firstDigit == 5) {
                    outputText = outputText + "Пять Рублей ";
                } else if (firstDigit == 4) {
                    outputText = outputText + "Четыре Рубля ";
                } else if (firstDigit == 3) {
                    outputText = outputText + "Три Рубля ";
                } else if (firstDigit == 2) {
                    outputText = outputText + "Два Рубля ";
                } else if (firstDigit == 1) {
                    outputText = outputText + "Один Рубль ";
                } else if (firstDigit == 0 && (secondDigit > 0 || thirdDigit > 0)) {
                    outputText = outputText + "Рублей ";
                }

            }

            //копейки (сперва исключения 10-19, затем остальное в else)
            if ((leftCentDigit == 1)) {

                if (rightCentDigit == 9) {
                    outputText = outputText + "Девятнадцать Копеек ";
                } else if (rightCentDigit == 8) {
                    outputText = outputText + "Восемнадцать Копеек ";
                } else if (rightCentDigit == 7) {
                    outputText = outputText + "Семнадцать Копеек ";
                } else if (rightCentDigit == 6) {
                    outputText = outputText + "Шестнадцать Копеек ";
                } else if (rightCentDigit == 5) {
                    outputText = outputText + "Пятнадцать Копеек ";
                } else if (rightCentDigit == 4) {
                    outputText = outputText + "Четырнадцать Копеек ";
                } else if (rightCentDigit == 3) {
                    outputText = outputText + "Тринадцать Копеек ";
                } else if (rightCentDigit == 2) {
                    outputText = outputText + "Двенадцать Копеек ";
                } else if (rightCentDigit == 1) {
                    outputText = outputText + "Одиннадцать Копеек ";
                } else if (rightCentDigit == 0) {
                    outputText = outputText + "Десять Копеек ";
                }

            } else {

                if (leftCentDigit == 9) {
                    outputText = outputText + "Девяносто ";
                } else if (leftCentDigit == 8) {
                    outputText = outputText + "Восемьдесят ";
                } else if (leftCentDigit == 7) {
                    outputText = outputText + "Семьдесят ";
                } else if (leftCentDigit == 6) {
                    outputText = outputText + "Шестьдесят ";
                } else if (leftCentDigit == 5) {
                    outputText = outputText + "Пятьдесят ";
                } else if (leftCentDigit == 4) {
                    outputText = outputText + "Сорок ";
                } else if (leftCentDigit == 3) {
                    outputText = outputText + "Тридцать ";
                } else if (leftCentDigit == 2) {
                    outputText = outputText + "Двадцать ";
                } else if (leftCentDigit == 1) {
                    outputText = outputText + "Десять ";
                }

                if (rightCentDigit == 9) {
                    outputText = outputText + "Девять Копеек ";
                } else if (rightCentDigit == 8) {
                    outputText = outputText + "Восемь Копеек ";
                } else if (rightCentDigit == 7) {
                    outputText = outputText + "Семь Копеек ";
                } else if (rightCentDigit == 6) {
                    outputText = outputText + "Шесть Копеек ";
                } else if (rightCentDigit == 5) {
                    outputText = outputText + "Пять Копеек ";
                } else if (rightCentDigit == 4) {
                    outputText = outputText + "Четыре Копейки ";
                } else if (rightCentDigit == 3) {
                    outputText = outputText + "Три Копейки ";
                } else if (rightCentDigit == 2) {
                    outputText = outputText + "Две Копейки ";
                } else if (rightCentDigit == 1) {
                    outputText = outputText + "Одна Копейка ";
                } else if (rightCentDigit == 0 && (leftCentDigit > 0 || rightCentDigit > 0)) {
                    outputText = outputText + "Копеек ";
                }

            }

        } else if (doubleAmount == 0) {
            System.out.println("Сумма: Ноль Рублей Ноль Копеек");
        } else {
            System.out.println("Something went wrong");
        }

        System.out.println(outputText);


    }
}
