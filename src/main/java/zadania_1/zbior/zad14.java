package zadania_1.zbior;

import java.util.Scanner;

/*14. Wczytaj ilość liczb i potem wypisz tyle początkowych liczb pierwszych ile wczytano*/
public class zad14 {
    public static void main(String[] args) {

        int ilosc;
        int i=0;

        Scanner podanaIlosc=new Scanner(System.in);

        System.out.println("Podaj ilosc liczb: ");
        ilosc=podanaIlosc.nextInt();

        int[] tablica=new int[ilosc];

      /*  for (int i=0;i<ilosc;i++){

        }
        for(int x:tablica)
            if(x==1 || x==2 ||x==3)
                System.out.print(x +" ");
            else if(x%2!=0 && x%3!=0)
                System.out.print(x +" ");*/
      int liczba=1;

      while(true){

          if (liczba == 1 || liczba == 2 || liczba == 3) {
              tablica[i] = liczba;
              System.out.print(tablica[i] + " ");
              i++;

          } else if (liczba % 2 != 0 && liczba % 3 != 0) {
              tablica[i] = liczba;
              System.out.print(tablica[i] + " ");
              i++;

          }
          if(i==ilosc){
              break;
          }
          liczba++;



      }


    }
}
