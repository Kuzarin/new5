public class VariablesTheme {
    public static void main(String[] args) {

        System.out.println("1. Создание переменных и вывод их значений на консоль.");
        byte proc = 3;
        short core = 2;
        int ddr = 8;
        long graphics = 1536;
        float ddrFrequency = 3733f;
        double date = 2020;
        char coreIndex = 'i';
        boolean color = true;

        System.out.println("Процессор Intel Core " + coreIndex
        + proc + " " + core + "-ядерный процессор");
        System.out.println("Память " + ddr + "ГБ " + ddrFrequency + "MHz");
        System.out.println("Графика Intel Iris Plus Graphics " +
        graphics + " МБ");
        System.out.println("Цвет ноутбука - Розовый " + color + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой.");
        int pricePen = 100;
        int priceBook = 200;
        double persentSale, sumPenBook;
        sumPenBook = (priceBook + pricePen)*0.11;
        persentSale = priceBook + pricePen - sumPenBook;
        System.out.println("Сумма скидки " + sumPenBook);
        System.out.println("Общая стоимость товаров со скидкой " + persentSale + "\n");

        System.out.println("3. Вывод на консоль слова JAVA.");
        System.out.println("   J    a  v     v  a     \n" + "   J   a a  v   v  a a     \n"
         + "J  J  aaaaa  V V  aaaaa     \n" + " JJ  a     a  V  a     a\n");

        System.out.println("4. Отображение min и max значений числовых типов данных.");
        byte xb = Byte.MAX_VALUE;
        short xs = Short.MAX_VALUE;
        int xi = Integer.MAX_VALUE;
        long xl = Long.MAX_VALUE;

        System.out.println(xb);
        xb ++;
        System.out.println(xb);
        xb --;
        System.out.println(xb);

        System.out.println(xs);
        xs ++;
        System.out.println(xs);
        xs --;
        System.out.println(xs);

        System.out.println(xi);
        xi ++;
        System.out.println(xi);
        xi --;
        System.out.println(xi);

        System.out.println(xl);
        xl ++;
        System.out.println(xl);
        xl --;
        System.out.println(xl + "\n");

        System.out.println("5. Перестановка значений переменных.");
        int a1 = 2, a2 = 5, a3;
        System.out.println("Замена переменных, через 3ю переменную:");
        System.out.println("Исходные значения: " + a1 + " " + a2);
        a3 = a1;
        a1 = a2;
        a2 = a3;
        System.out.println("Новые значения: " + a1 + " " + a2);
        System.out.println("Замена переменных, через арифметические операции:");
        System.out.println("Исходные значения: " + a1 + " " + a2);
        a1 -= a2;
        a2 += a1;
        a1 = a2 - a1;
        System.out.println("Новые значения: " + a1 + " " + a2);
        System.out.println("Замена переменных, через побитовую операцию:");
        System.out.println("Исходные значения: " + a1 + " " + a2);
        a1 ^= a2;
        a2 ^= a1;
        a1 ^= a2;
        System.out.println("Новые значения: " + a1 + " " + a2 + "\n");

        System.out.println("6. Вывод символов и их кодов.");
        char c1 = '$', c2 = '&', c3 = '@', c4 = '^', c5 = '_';
        System.out.println((int)c1 + " " + c1);
        System.out.println((int)c2 + " " + c2);
        System.out.println((int)c3 + " " + c3);
        System.out.println((int)c4 + " " + c4);
        System.out.println((int)c5 + " " + c5 + "\n");

        System.out.println("7. Отображение количества сотен, десятков и единиц числа.");
        int N = 123;
        int X, Y, Z;
        X = N / 100;
        Y = N / 10;
        Z = N / 1;
        System.out.println("Число " + N + " содержит: " + X + " сотню");
        System.out.println("Число " + N + " содержит: " + Y + " десятков");
        System.out.println("Число " + N + " содержит: " + Z + " единицы\n");

        System.out.println("8. Вывод на консоль ASCII-арт Дюка.");
        char s01 = '/';
        char s02 = (int)92;
        char s03 = '_';
        char s04 = '(';
        char s05 = ')';
        System.out.println("    " + s01 + s02);
        System.out.println("   " + s01 + "  " + s02);
        System.out.println("  " + s01 + s03 + s04 + " " + s05 + s02);
        System.out.println(" " + s01 + "      " + s02);
        System.out.println(s01 + "" + s03 + s03 + s03 + s03 + "" + s01 + s02 + s03 + s03 + s02 + "\n");

        System.out.println("9. Произведение и сумма цифр числа.");
        int p1 = 345, digit100, digit10, digit1;
        digit100 = p1 / 100;
        digit10 = p1 % 11;
        digit1 = p1 % 340;
        System.out.println(digit100);
        System.out.println(digit10);
        System.out.println(digit1 + "\n");

        System.out.println("10. Преобразование секунд.");
        int second = 86399, hh, hh1, mm, ss;
        hh = second / 3600;
        hh1 = second % 3600;
        mm = hh1 / 60;
        ss = hh1 % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}
