package esercizi;

import java.util.Scanner;

public class Tabelline {
    public static void main(String[] args) {
        int n, m;

        System.out.println("inserire numero array: ");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();

        System.out.println("inserire numero da moltiplicare: ");
        sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] array = new int[m];
        for (int i = 0; i < array.length; i++){
            int risultato = i * n;
            System.out.println(risultato);
        }

    }
}