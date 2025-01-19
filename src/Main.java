import java.lang.reflect.Type;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte a = 44;
        //byte b = 128; //max numeral is 127
        byte c = 5 + 7 * 5;

        short d = 123 + 3210;
        //short e = d - 1; - ошибка, потому что при любой числовой операции Java приводит к типу int. Нужно задавать тип явно:
        short e = (short) (d - 1);

        int f = 1024768;
        int g = 455 / 10;
        //int h = 78 + 8L; - Ошибка как и с short e. Нужно явно указывать тип:
        int h = (int) (78 + 8L);

        long i = 611942;
        //long j = '6934930'; - ошибка, потому что 1) long - числовой тип данных, 2) '' - используется только для char 3) сам char может содержать в себе только один символ. Нужно:
        long j = 6_934_930;
        long zb = '3';
        long k = 7684849303l;
        long l = 1234567890123456789L;

        double m = 99;
        double n = 122224.56623423;
        double o = 333f;
        double p = 0D;

        float q = 2 * 3;
        float r = 67 / 31;
        float s = (float) (77 * 9d);
        float t = 1.01F;
        float u = 5F;

        char v = 'a';
        char w = 115;
        System.out.println(w);
        char x = 'f' + 3;
        System.out.println(x);
        char z = 'z' - 'A';
        System.out.println(z);
        char za = 'b' - 'a';
        System.out.println((int) za); // почему A?

        Integer days = 759;
        System.out.println(days);

        byte b = 1;
        b = (byte) -b;
        System.out.println(b);
        b *= 2;
        System.out.println(b);
        b += 3;
        System.out.println(b);
        b /= 2;
        System.out.println(b);

        int inh = 3;                      // line 1
        byte bi = 1;                     // line 2
        bi = (byte)  inh;                // line 12
        bi += inh++;                       // line 13
        System.out.println(bi);
        float fiu = 1.1f;               // line 14
        bi /= fiu;                       // line 15
        System.out.println(bi);

    }
}