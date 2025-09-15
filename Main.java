import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Считывание четерех натуральных чисел Х,А,В и С консоли
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // Определение можно ли поместить груз А в лифт
        // Если да, выводи А
        if (x >= a) {
            System.out.print("A ");
            // Определение можно ли поместить груз В в лифт
            // Если да, выводи В
            if (x >= b) {
                System.out.print("B ");
                // Определение можно ли поместить груз С в лифт
                // Если да, выводи С
                // Перехим на новую строку для поиска максимального
                if (x >= c) {
                    System.out.println("C");
                    // Определение можно ли поместить три груза в лифт
                    // Если да, выводи 3
                    if (x >= a + b + c) {
                        System.out.println("3");

                    } else {
                        // Определение можно ли поместить два груза в лифт
                        // Если да, выводи 2
                        if (x >= a + b) {
                            System.out.println("2");
                        } else {
                            // Определение можно ли поместить два груза в лифт
                            // Если да, выводи 2
                            if (x >= a + c) {
                                System.out.println("2");
                            } else {
                                // Определение можно ли поместить два груза в лифт
                                // Если да, выводи 2
                                if (x >= c + b) {
                                    System.out.println("2");
                                } else {
                                    // Если нет выводим 1
                                    System.out.println("1");
                                }
                            }
                        }
                    }


                } else {
                    // Если С больше Х
                    // Перехим на новую строку для поиска максимального
                    System.out.println();
                    // Определение можно ли поместить два груза в лифт
                    // Если да, выводи 2
                    if (x >= b + a) {
                        System.out.println("2");
                    } else {
                        // Если нет, выводим 1
                        System.out.println("1");
                    }
                }
            } else {
                // Если В больше Х
                // Определение можно ли поместить груз С в лифт
                // Если да, выводи С
                // Перехим на новую строку для поиска максимального
                if (x >= c) {
                    System.out.println("C");
                    // Определение можно ли поместить два груза в лифт
                    // Если да, выводи 2
                    if (x >= c + a) {
                        System.out.println("2");
                    } else {
                        // Если нет, выводим 1
                        System.out.println("1");
                    }
                } else {
                    // Если В и С больше Х
                    // Выводим 1
                    System.out.println();
                    System.out.println("1");
                }


            }
        } else {
            // Если А больше Х
            // Определение можно ли поместить груз В в лифт
            // Если да, выводи В
            if (x >= b) {
                System.out.print("B ");
                // Определение можно ли поместить груз С в лифт
                // Если да, выводи С
                // Перехим на новую строку для поиска максимального
                if (x >= c) {
                    System.out.println("C");
                    if (x >= b + c) {
                        System.out.println("2");
                    } else {
                        System.out.println("1");
                    }
                } else {
                    // Если А и С больше Х
                    // Выводим 1
                    System.out.println();
                    System.out.println("1");
                }
            } else {
                // Если А больше Х
                // Если В больше Х
                // Определение можно ли поместить груз С в лифт
                // Если да, выводим С и выводим 1
                if (x >= c) {
                    System.out.println("C");
                    System.out.println("1");
                } else {
                    // Если А,В и С больше Х
                    // Выводим 0
                    System.out.println();
                    System.out.println("0");
                }
            }
        }
    }
}
