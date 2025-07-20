// https://neps.academy/br/exercise/47

import java.util.Scanner;

public class Codigo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num != 1 && num != 0) {
                throw new IllegalArgumentException("Entrada inválida: apenas 1 ou 0 são permitidos.");
            }

            vet[i] = num;
        }

        int cont = 0;
        for (int i = 0; i <= n - 3; i++) {
            if (vet[i] == 1 && vet[i+1] == 0 && vet[i+2] == 0) {
                cont++;
            }
        }

        System.out.println(cont);
        sc.close();
    }
}
