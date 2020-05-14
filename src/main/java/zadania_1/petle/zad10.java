package zadania_1.petle;

import java.util.Scanner;

/*10.Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
        Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą
        wysokość choinki (liczbę wierszy). Przykład: dla n = 5 wynik powinien wyglądać
        następująco:
            *
           ***
          *****
         *******
        **********/
public class zad10 {
    public static void main(String[] args) {
        int n;

        Scanner podanaLiczna = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        n = podanaLiczna.nextInt();
        while (n <= 0) {
            System.out.println("Podana liczba powinna być dodatnia wieksza od zera");
            System.out.println("Podaj liczbę: ");
            n = podanaLiczna.nextInt();
        }

        /*for(int j=n;j>0;j--){
         *//*for(int i=0;i<n;i++){
                System.out.print("*");
            }*//*
            System.out.println("*");
        }*/
        /*for(int i=0;i<n;i++){
            for(int j=n;j>0;j--){
                if(i<n+1 && i>n-1){
                    System.out.print("*");
                }else{
                    System.out.println(" ");
                }



            }
            System.out.println("*");*/

        for (int j = 0; j <n; j++) {
            for (int i = 0; i < 2 * n; i++) {
                if (n-j<=i && i<=n+j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }
            System.out.println("");
            }
        }
    }