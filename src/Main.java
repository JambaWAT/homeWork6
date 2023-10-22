// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Задание1");
        {
            for (int i = 0; i < 11; i++)
                System.out.println(i);
        }
        System.out.println("Задание2");
        {
            for (int a = 10; a > 0; a--)
                System.out.println(a);
        }
        System.out.println("Задание3");
        {
            for (int b = 0; b < 17; b = b + 2)
                System.out.println(b);
        }
        System.out.println("Задание4");
        {
            for (int c = 10; c > -11; c = c - 1)
                System.out.println(c);
        }
        System.out.println("Задание5");
        {
            for (int d = 1904; d < 2097; d = d + 4)
                System.out.println(d + " год является високосным");
        }
        System.out.println("Задание6");
        {
            for (int e = 7; e < 99; e = e + 7)
                System.out.println(e);
        }
        System.out.println("Задание7");
        {
            for (int f = 1; f < 513; f = f * 2)
                System.out.println(f);
        }
        System.out.println("Задание8");
        {
            int salary = 29000;
            for (int monthNumber = 1; monthNumber <= 12; monthNumber++)
                System.out.println("В " + monthNumber + " Месяц, сумма накоплений равна: " + (monthNumber * salary) + " рублей");
        }
        System.out.println("Задание9");
        {
            float total = 0;
            int salary2 = 29000;
            for (int m = 1; m <= 12; m++) {
                total = total + total / 100;
                total = total + salary2;
                System.out.println("Месяц " + (m + 1) + " Итого" + total);
            }
            System.out.println("Задание10");
            {
                for (int z = 1; z <= 10; z++) {
                    System.out.println("2 * " + z + " = " + 2 * z);
                }
            }
        }
    }
}