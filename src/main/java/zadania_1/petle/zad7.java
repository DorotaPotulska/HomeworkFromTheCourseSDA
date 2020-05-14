package zadania_1.petle;

import java.util.Arrays;
import java.util.Scanner;

/*7. Napisać program, który pobiera od użytkownika ilość liczb ​N​,
        a następnie wczytuje: - N liczb całkowitych od użytkownika - W następnej kolejności program
        powinien wyświetlić sumę największej oraz
        najmniejszej z podanych liczb oraz ich średnią arytmetyczną.*/
public class zad7 {
    public static void main(String[] args) {
        int N;
        Scanner podanaN=new Scanner(System.in);

        System.out.println("Podaj liczbę N: ");
        N=podanaN.nextInt();
        int i=0;
        int[] tablica=new int[N];

        Scanner liczba=new Scanner(System.in);

        while (i<N){
            System.out.println("Podaj liczbę:");
            tablica[i]=liczba.nextInt();
            i++;

        }

        for(int x:tablica){
            System.out.print(x+" ");
        }
        System.out.println();
        Arrays.sort(tablica);

        for(int y:tablica){
            System.out.print(y+" ");
        }
        System.out.println();

        int suma;
        suma=tablica[0]+tablica[N-1];

        System.out.println(suma);
        System.out.println();

        float srednia;
        srednia=(float) (tablica[0]+tablica[N-1])/2;

        System.out.println(srednia);
    }
}
