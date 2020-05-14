package zadania_1.petle;

import java.util.Scanner;

/*5. Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B, A < B,
        a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu (A,A +               1,...,B).
        Obliczenia należy wykonać dwukrotnie stosując kolejno pętle: while, for.

        Przykład: Dla A = 4 i B = 11 program powinien wyświetlić: 60 60*/
public class zad5 {
    public static void main(String[] args) {
        int A;
        int B;

        Scanner liczbaA = new Scanner(System.in);
        Scanner liczbaB = new Scanner(System.in);

        System.out.println("Podaj liczbę A: ");
        A=liczbaA.nextInt();

        System.out.println("Podaj liczbę B: ");
        B=liczbaB.nextInt();

        while (A>=B){
            System.out.println("Liczba B musi być większa od A:");
            System.out.println("Podaj liczbę B: ");
            B=liczbaB.nextInt();
        }
       /* int roznica=B-A;
        int suma=0;
        for(int i=0;i<=roznica;i++){
            suma+=A;
            A+=1;
        }
        System.out.println(suma);*/


        /*int suma=0;
        for(int i=A;i<=B;i++){
            suma+=A;
            A+=1;
        }
        System.out.println(suma);*/
        int suma=0;
        while(A<=B){
            suma+=A;
            A+=1;
        }
        System.out.println(suma);
    }
}
