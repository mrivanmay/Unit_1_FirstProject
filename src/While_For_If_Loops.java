public class While_For_If_Loops {
    public static void main(String[] args) {
        int value = 1;
        boolean ba;

        while (value <= 10) { // цикл будет выполняться до тех пор, пока условие будет выполняться
            System.out.println("This is " + value);
            value += 1;
        }

        for (int i = 10; i > 0; i--) {  // три блока: 1) декларация и инициализация пременной счетчика; 2) условие (до каких пор); 3) изменение переменной счетчика на каждой итерации
            System.out.println("Hello " + i);
        }

        if (5<4) {
            System.out.println("true");
        } else if (5>100) {
            System.out.println("false");
        } else {
            System.out.println("no one");
        }

    }
}
