package zadania_1.petle;

import java.util.Scanner;

/*17.Napisać program, który w pętli for oraz while wypisuje:
        a. liczby od -200 do -1000 (pętla która co krok dokonuje dekrementacji).
        b. liczby od 1000 do 100000 w jednej linii, a co 1000 liczbę dodaj wypisanie nowej linii.
        c. tabliczkę mnożenia od 5x10
        d. tabliczkę mnożenia a x b - gdzie zmienne a i b załaduj ze scanner’a*/
public class zad17 {
    public static void main(String[] args) {
       /* for(int i=-200;i>=-1000;i--){
            System.out.println(i+",");
        }*/

       /*int i=-200;
       while (i>=-1000){
           System.out.println(i+",");
           i--;
       }*/

      /* for(int i=100;i<=100000;i++){
           if (i%1000!=0){
               System.out.print(i+", ");
           }else{
               System.out.println(i);
           }
       }*/
      /*int i=1000;
      while (i<100000){
          if (i%1000!=0){
              System.out.print(i+", ");
          }else{
              System.out.println(i);
          }
          i++;
      }*/

      /*for(int i=1;i<=5;i++){
          for(int j=1;j<=10;j++){
              System.out.print(i+" * "+j+" = "+i*j +"| ");
          }
          System.out.println();
      }*/

        int liczbaA;
        int liczbaB;


        Scanner podanaLiczbaA=new Scanner(System.in);
        Scanner podanaLiczbaB=new Scanner(System.in);

        System.out.println("Podaj liczbę A: ");
        liczbaA=podanaLiczbaA.nextInt();
        System.out.println("Podaj liczbę B: ");
        liczbaB=podanaLiczbaB.nextInt();

        for(int i=1;i<=liczbaA;i++){
            for(int j=1;j<=liczbaB;j++){
                System.out.print(i+" * "+j+" = "+i*j +"| ");
            }
            System.out.println();
        }

    }
}
