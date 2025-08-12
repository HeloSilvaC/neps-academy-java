// https://neps.academy/br/exercise/218

import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String op = sc.nextLine();
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        switch (op) {
            case "M":
                System.out.println(String.format("%.2f",n1 * n2));
                break;
            case "D":
                System.out.println(String.format("%.2f", n1 / n2));
                break;
            default:
                break;
        }

    }
}
