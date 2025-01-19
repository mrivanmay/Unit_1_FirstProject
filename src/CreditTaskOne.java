import java.util.Scanner;

public class CreditTaskOne {

    public static void main(String[] args) {
        //Имеется прямоугольное отверстие размером a на b. Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r.

        Scanner input = new Scanner(System.in);

        System.out.println("Введите длину стороны A: ");
        double aSide = input.nextDouble();
        System.out.println("Введите длину стороны B: ");
        double bSide = input.nextDouble();
        System.out.println("Введите длину радиуса R: ");
        double radius = input.nextDouble();

        if (radius * 2 >= aSide && radius * 2 >= bSide) {
            System.out.println("Картонка с радиусом " + radius + " закрывает полностью отверстие размера " + aSide + " * " + bSide);
        } else {
            System.out.println("Картонка с радиусом " + radius + " НЕ закрывает полностью отверстие размера " + aSide + " * " + bSide);
        }



    }

}
