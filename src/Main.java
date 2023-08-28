import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

// Треугольник Паскаля
                Scanner s = new Scanner(System.in);
                System.out.println("Введите колличество уровней: ");
                int n = s.nextInt();
                int coef = 1;

                for (int i = 0; i < n; i++) {
                    for (int j = 1; j < n - i; ++j) {
                        System.out.print("  ");
                    }

                    for (int j = 0; j <= i; j++) {
                        if (j == 0 || i == 0)
                            coef = 1;
                        else
                            coef = coef * (i - j + 1) / j;

                        System.out.printf("%4d", coef);
                    }

                    System.out.println();
                }
            }
        }


        /*for (int m = 0; m < n; m++) {
            if (m % 2 == 0) ;


            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if ((i + j) % 2 == 0) System.out.print("  ");
                        else System.out.print("  ");
                    }
                    for (int j = 0; j < n; j++) {
                        if ((i + j) % 2 == 0) System.out.print("+ ");
                        else System.out.print("- ");
                    }
                }

                System.out.println();
            }
        }*/


