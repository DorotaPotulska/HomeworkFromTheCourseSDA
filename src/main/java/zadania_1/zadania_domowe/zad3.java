package zadania_1.zadania_domowe;

import java.util.Random;

/*Zadanie 3
        stworz nowa tablice z 100 intami, uzupelnij ja losowymi liczbami, a nastepnie sprawdz zawartosc kazdego elementu tabeli i wypisz:
        a) jezeli liczba jest liczba pierwsza -> "liczba pierwsza"
        b) jezeli ma 3 dzielniki -> "3 dzielniki"
        c) jezeli ma 4 lub wiecej -> "4 lub wiecej dzielnikow"
        (skorzystac z switch/case)*/
public class zad3 {
    public static void main(String[] args) {
        int tablica[]=new int[100];
        Random rd = new Random();

        //uzupełnienie tablicy
        for(int i=0;i<tablica.length;i++){
            tablica[i]=rd.nextInt();
            //tablica[i]=rd.nextInt(21)-5;//przedział od -5 do 15
        }
        //wyświetlenie tablicy
        for(int i=0;i<tablica.length;i++){
            System.out.println(tablica[i]);
        }
        //wyświetlenie tablicy z opisami
        int iloscDzielnikow =0;
        int[] tablicaWynikow=new int[tablica.length];

        for(int i=0;i<tablica.length;i++){
            for(int j=2;j<Math.abs(tablica[i]);j++){
                if(Math.abs(tablica[i])%j==0){
                    iloscDzielnikow+=1;
                }
            }

            tablicaWynikow[i]=iloscDzielnikow;
            iloscDzielnikow=0;
            }

        for(int i=0;i<tablica.length;i++){
            System.out.println(tablicaWynikow[i]);
        }
            for(int i=0;i<tablica.length;i++){

             switch (tablicaWynikow[i]){
                 case 0:
                     System.out.println("Liczba "+tablica[i] +" jest liczbą pierwsza");
                     break;
                 case 1:
                     System.out.println("Liczba "+tablica[i]+" ma 3 dzielniki");
                     break;
                 default:
                     System.out.println("Liczba "+tablica[i]+" ma 4 lub wiecej dzielników");
                     break;
             }

        }

    }
}
