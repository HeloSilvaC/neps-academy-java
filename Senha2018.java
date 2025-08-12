// https://neps.academy/br/exercise/153

import java.util.Scanner;

public class Senha2018 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cont = 0;
        while (num != 2018) {
            cont++;
            num = sc.nextInt();
        }
        System.out.println(cont);
    }
}
