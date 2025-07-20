// https://neps.academy/br/exercise/52

import java.util.Scanner;

public class Lampadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num != 1 && num != 2) {
                throw new IllegalArgumentException("Entrada inválida: apenas 1 ou 2 são permitidos.");
            }

            vet[i] = num;
        }

        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
           if (vet[i] == 1) {
                a = 1 - a;
            } else if (vet[i] == 2) {
                a = 1 - a;
                b = 1 - b;
            }
        }

        System.out.println(a);
        System.out.println(b);

        sc.close();
    }
}
