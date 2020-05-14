package zadania_1.petle;

import java.util.Scanner;

/*14. Napisz program, który pobiera od użytkownika dodatnią liczbę naturalną n i tworzy
tablicę a zmiennych typu logicznego (boolean) o rozmiarze n×n.
Następnie program           powinien wypełnić utworzoną tablicę,
tak by a[i][j] = true jeżeli liczby (i+1) oraz (j+1)              są względnie pierwsze,
tzn. nie mają wspólnych dzielników poza 1. Tak utworzoną tablicę należy wypisać na ekranie,
przy czym dla wartości true     należy wyświetlić znak ”+”, natomiast dla wartości false znak ”.”.

        Przykład:
        Podaj liczbę (> 0): 10
        1 2 3 4 5 6 7 8 9 10
        1 + + + + + + + + + +
        2 +  . +  . +  . +  . +  .
        3 + +  . + +  . + +  . +
        4 +  . +  . +  . +  . +  .
        5 + + + +  . + + + +  .
        6 +  .  .  . +  . +  .  .  .
        7 + + + + + +  . + + +
        8 +  . +  . +  . +  . +  .
        9 + +  . + +  . + +  . +
        10 +  . +  . . . +  . +  .*/
public class zad14 {
    public static void main(String[] args) {

        int liczba;
        Scanner in= new Scanner(System.in);

        System.out.println("Podaj dodatnią liczbę n: ");
        liczba=in.nextInt();

        Boolean[][] tablica=new Boolean[liczba][liczba];

        for(int i=0;i<liczba;i++){
            for(int j=0;j<liczba;j++){
               int a = i+1;
               int b=j+1;

               while (a!=b){
                   if(a<b) {
                       b = b - a;
                   }else{
                       a=a-b;
                   }
               }
               if(a==1){
                   tablica[i][j]=true;
               }else{

                   tablica[i][j]=false;
               }
            }
        }


        for (int i = 0; i < liczba; i++) {
            System.out.print(i+" ");
            for (int j = 0; j < liczba; j++) {
                System.out.print(tablica[i][j]+" ");
            }
            System.out.println();
        }

        char[][] tablicaNowa=new char[liczba][liczba];
        for (int i = 0; i < liczba ; i++) {
            for (int j = 0; j < liczba; j++) {
                if(tablica[i][j]==true){
                    tablicaNowa[i][j]='+';
                }else{
                    tablicaNowa[i][j]='.';
                }
            }

        }
        for (int i = 0; i < liczba; i++) {
            System.out.print(i+" ");
            for (int j = 0; j < liczba; j++) {
                System.out.print(tablicaNowa[i][j]+" ");
            }
            System.out.println();
        }
    }
}
