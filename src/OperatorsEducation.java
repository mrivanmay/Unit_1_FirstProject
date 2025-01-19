package PACKAGE_NAME;

public class OperatorsEducation {
    public static void main(String[] args) {
        int i = 3;                      // line 1
        byte b = 1;                     // line 2
        byte b1 = 1 + 2;                // line 3
        short s = 30111;                // line 4
        short s1 = (short) 30111;       // line 5
        b = (byte) (b1 + 1);            // line 7
        b = (byte) -b;                  // line 9
        b1 *= 2;                        // line 10
        b = (byte) i;                   // line 12
        b += i++;                       // line 13
        System.out.println(b);
        System.out.println(i);
        float f = 1.1f;                 // line 14
        b /= f;                         // line 15
        System.out.println(b);
    }
}
