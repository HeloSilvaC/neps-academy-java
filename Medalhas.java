// https://neps.academy/br/exercise/2

import java.util.Scanner;

public class Medalhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tempos = new int[3];
        int[] nadadores = {1, 2, 3};

        for (int i = 0; i < 3; i++) {
            tempos[i] = sc.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (tempos[i] > tempos[j]) {
                    int temp = tempos[i];
                    tempos[i] = tempos[j];
                    tempos[j] = temp;

                    int aux = nadadores[i];
                    nadadores[i] = nadadores[j];
                    nadadores[j] = aux;
                }
            }
        }

        System.out.println(nadadores[0]);
        System.out.println(nadadores[1]);
        System.out.println(nadadores[2]);
    }
}
