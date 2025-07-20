// https://neps.academy/br/exercise/257

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num == 0 || num == 1) {
            System.out.println(1);
        } else {
            int anterior = 1;
            int atual = 1;
            for (int i = 2; i <= num; i++) {
                int proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
            System.out.println(atual);

        }
        sc.close();
    }
}
