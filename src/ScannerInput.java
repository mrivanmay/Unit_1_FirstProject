import java.util.Scanner;

public class ScannerInput {

    //Классы пакета java.lang импортируются по умолчанию
    //Классы пакета java.util импортируются сами (либо идея сама, либо разраб вручную)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число (не более 10 знаков): ");
        String inputedString = scanner.nextLine();


    }
}
