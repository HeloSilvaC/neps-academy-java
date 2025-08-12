// https://neps.academy/br/exercise/463

import java.util.Scanner;

public class AIdadeDeDonaMonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = m - (a + b);

        int maisVelho = Math.max(c, Math.max(a, b));

        System.out.println(maisVelho);
    }
}
