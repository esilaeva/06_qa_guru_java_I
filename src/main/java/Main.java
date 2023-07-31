public class Main {
    public static void main(String[] args) {

        //1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях,
        // посмотреть результаты (вывести в консоль)

        byte varByte = 0;  // -128 ... 127
        short varShort = 0; // -32.768 ... 32.767
        int varInt = 0; // -2.147.483.648 ... 2.147.483.647
        long varLong = 0; // -9.223.372.036.854.775.808 ... 9.223.372.036.854.775.807

        int a = Integer.MAX_VALUE;
        int b = 10;
        System.out.println("Overflow: " + (a + 1));

        a = 45670;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        if (a > b) {
            System.out.println("a + b = " + (a + b));
        } else {
            System.out.println("a - b = " + (a - b));
        }

        if (a > 0 && b < 100) {
            System.out.println("a * b = " + (a * b));
        }

        a = -12345;
        if (a > 0 || b < 100) {
            System.out.println("a / b = " + (a / b));
        }

        System.out.println("=============");
        //2) попробовать вычисления комбинаций типов данных (int и double)
        double c = 100.5;
        System.out.println("b + c = " + (b + c));
        System.out.println("b - c = " + (b - c));
        System.out.println("b * c = " + (b * c));
        System.out.println("b / c = " + (b / c));
        System.out.println(10 + 6.5);
    }
}
