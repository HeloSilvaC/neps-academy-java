// https://neps.academy/br/exercise/156

import java.util.Scanner;

public class ValoresEntreDoisNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int maior = Math.max(a, b);
        int menor = Math.min(a, b);
    
        for(int i = menor; i<=maior; i++){
            System.out.print(i + " ");
        }

    }
}