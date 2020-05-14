package zadania_1.tablice_i_petle;

import java.util.Scanner;

/*3. Napisz program, który zwraca w postaci tablicy zbiór wszystkich
        liczb mniejszych od zadanej przez użytkownika liczby oraz:
        a. Podzielnych przez 2
        b. Podzielnych przez 3
        c. *Podzielnych przez zadaną przez użytkownika liczbę*/
public class zad3 {
    public static void main(String[] args) {
        int liczba;


        Scanner podanaLiczba = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        liczba = podanaLiczba.nextInt();
        int[] tablica=new int[liczba];
        for(int i=1;i<=liczba;i++){
            tablica[i-1]=i;

        }


        for(int x:tablica){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x:tablica){
            if(x%2==0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        for(int x:tablica){
            if(x%3==0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        for(int x:tablica){
            if(x%liczba==0) {
                System.out.print(x + " ");
            }
        }


    }
}
