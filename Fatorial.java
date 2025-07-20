// https://neps.academy/br/exercise/158

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

         int soma = 1;
     
        for(int i = num; i > 0; i--){
            soma = soma * i;
        }
        System.out.println(soma);
        sc.close();
    }
}
