package Lagrange;

import java.util.Scanner;

public class Lagrange {

    public static void main(String[] args) {

        int w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość węzłow:");
        w = sc.nextInt();
        float[][] tab = new float[2][w];
        for (int i = 0; i < w; i++) {
            System.out.println("Podaj wartości x" + i + ":");
            tab[0][i] = sc.nextFloat();
            System.out.println("Podaj wartości y" + i + ":");
            tab[1][i] = sc.nextFloat();
        }
        System.out.println("Podaj wartość x:");
        float x = sc.nextFloat();
        float a = 1;
        float b = 1;
        float y=0;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w; j++) {
                if (j == i) {
                    continue;
                } else {
                    a = a * (x - tab[0][j]);
                    b = b * (tab[0][i] - tab[0][j]);}
            }
            y=y+(tab[1][i]*(a/b));
            a=1;
            b=1;
        }
        System.out.println("wartość y = "+y);
    }
}
