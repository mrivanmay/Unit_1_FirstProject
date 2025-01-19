import java.util.Scanner;

public class U2OperatorsTasks {

    public static void main(String[] args) {
        // 1) Введите число с клавиатуры. Выведите последнюю цифру числа на экран.

        // Сначала логика: нужно знать, сколько разрядов у числа. Как?? Хз, сделаем пока до 10 знаков и будем делать проверки в if loop
        // Ввод и обработка введенного в консоли числа (строка приводится в тип инт)
        Scanner needInputOne = new Scanner(System.in);
        System.out.println("Введите число (до 9 знаков): ");
        int numOne = needInputOne.nextInt();
        int result = numOne % 10;

        if (result < 0) {
            numOne = -numOne % 10;
        }

        System.out.println("Последния цифра: " + result);

    // -----------------------------------------------------------
        // 2) Введите трехзначное число с клавиатуры. Найдите сумму и произведение цифр числа.

        Scanner needInputTwo = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int numTwo = needInputTwo.nextInt();

        if (numTwo < 0) {
            numTwo = - numTwo;
        }

        int a = numTwo / 100;
        int c = numTwo % 10;
        int b = (numTwo / 10) % 10;
        int resultSum = a+b+c;
        int resultMul = a*b*c;
        System.out.println("Сумма трех чисел: " + resultSum + ". Произведение трех чисел: " + resultMul + ".");

    // -----------------------------------------------------------
        // 3) Вывести длину отрезка AB, проходящей через две точки A и B числовой прямой.
        Scanner needInputThree = new Scanner(System.in);
        System.out.println("Введите значение точки А: ");
        int numThree = needInputThree.nextInt();

        Scanner needInputFour = new Scanner(System.in);
        System.out.println("Введите значение точки В: ");
        int numFour = needInputFour.nextInt();
        int lineResult = numFour - numThree;

        if (lineResult < 0) {
            lineResult = -lineResult;
        }

        System.out.println("Длина отрезка: " + lineResult);

    // -----------------------------------------------------------
        // 4) Найти сумму цифр ab + cd четырехзначного числа abcd

        Scanner needInputFive = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        int numFive = needInputFive.nextInt();

        //7777 abcd
        int cd = numFive % 100;
        int ab = (numFive - cd) / 100;
        System.out.println("Сумма первых двух и последних двух чисел: " + (ab + cd));

    // -----------------------------------------------------------
        // 5) Вывести 3-юю цифру 5ти-значного числа

        Scanner needInputSix = new Scanner(System.in);
        System.out.println("Введите пятизначное число: ");
        int numSix = needInputSix.nextInt();
        //33233
        int resultSix = ((numSix % 1000) - (numSix % 100)) / 100;
        System.out.println("Центральное число: " + resultSix);

    // -----------------------------------------------------------
        // 6) Как с помощью побитовой операции привести число типа int в byte не используя приведения типов?

        //Думаю, нужно обрезать лишние 3 байта от int, чтобы получить один байт.
        //То есть допустим 16. 16 это 2 в 4, то есть:
        //INT:  00000000 00000000 00000000 00010000
        //BYTE: 00010000
        //Вопрос: как обрезать первые три байта?

        int testInstanceOf = 89; // 00000000 00000000 00000000 01011001
        System.out.println(testInstanceOf instanceof Integer);

        int test;
        int am = 5;
        int im = 1;
        test = (--am) + 81 >> 2 - (im++) % 6;
        System.out.println(test);
        System.out.println(1%6);

    }
}