package zadania_2.klasy_metody.zad3;

import java.util.Random;
import java.util.Scanner;

/*3. Utworzenie klasy drukującej losową liczbę w zadanym przez użytkownika zakresie
        a. Użytkownik deklaruje maksymalną liczbę (losowanie odbywa się od liczby zera
        do liczby maksymalnej zdefiniowanej przez użytkownika)
        np. i. Użytkownik wpisuje ‘10’ -> liczba losowa przyjmuje wartość od 0 do 10
        b. Użytkownik deklaruje minimalną liczbę oraz maksymalną :
        i. Dla liczby ‘1’ i ‘100’ -> liczba losowa przyjmuje wartość od 1 do 100
        c. Użytkownik może podawać liczby ujemne:
        i. Dla liczb: ‘-100’ i ‘5’ -> liczba losowa przyjmuje wartość od -100 do 5*/
public class zad3 {
    public static void main(String[] args) {
        int x;
        int y;
        int opcja;

        System.out.println("Wybierz opcje : ");
        System.out.println("1. Losujemy liczby od 0 do podanej Twojej liczby");
        System.out.println("2. Losujemy liczby od min do max które podaje uzutkownik");
        opcja=wczytajLiczbe();

        switch (opcja){
            case 1:
                x=0;
                System.out.println("Podaj max");
                y=wczytajLiczbe();
                System.out.println(losujLiczbę(x,y));
                break;
            case 2:
                System.out.println("Podaj min");
                x=wczytajLiczbe();
                System.out.println("Podaj max");
                y=wczytajLiczbe();
                System.out.println(losujLiczbę(x,y));
            break;
            default:
                break;
        }


    }

    public static int losujLiczbę(int x,int y){

        Random rd=new Random();
        return rd.nextInt(y-x+1)+x;
    }

    public static int wczytajLiczbe(){
        Scanner in=new Scanner(System.in);
        return in.nextInt();
    }
}
