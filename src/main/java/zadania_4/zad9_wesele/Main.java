package zadania_4.zad9_wesele;

import java.util.Scanner;

/*2.Wesele
        Stwórz aplikację dla osób które zapraszają ludzi na wesela. Aplikacja na początku pobiera od użytkownika
        ilość osób zaproszonych na wesele, a następnie prosi o podanie czy jest to zaproszenie POJEDYNCZE czy Z_OS_TOWARZYSZACA.

        Stwórz enum TypZaproszenia o polach:
        POJEDYNCZE
        Z_OS_TOWARZYSZACA

        Enum powinien posiadać pole prywatne 'ileOsob' które dla
        wyboru POJEDYNCZE ma wartosc 1, dla Z_OS_TOWARZYSZACA ma wartosc 2.
        Stwórz getter do tego pola.

        Stwórz klasę zaproszenie które posiada pola:

        Imię,
        Nazwisko,
        TypZaproszenia

        Po zaimplementowaniu poproś użytkownika o podanie ilości zaproszeń a następnie wprowadź dla każdego zaproszenia jego imie, nazwisko i typ.
        Przechowaj zaproszenia w tablicy.

        Po zebraniu informacji stwórz pętlę i zsumuj osoby na zaproszeniach (jeśli jest to zaproszenie z os. towarzyszaca, to dodajesz 2, jesli nie, to 1).


        Przyklad:

        Ile zaproszen?
        3
        Marian
        Marianski
        Z_OS_TOWARZYSZACA
        Arek
        Kowalski
        POJEDYNCZE
        Ola
        Bela
        Z_OS_TOWARZYSZACA

        Lacznie zaproszono: 5 osób.*/
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ile Zaproszeń?");
        int iloscZaproszen = in.nextInt();

        Zaproszenie[] tabZaproszen = new Zaproszenie[iloscZaproszen];

        String tmp=in.nextLine();
        for (int i = 0; i < iloscZaproszen; i++) {

            tabZaproszen[i]= new Zaproszenie();
            System.out.println("Podaj imie");
            tabZaproszen[i].setImie(in.nextLine());
            System.out.println("Podaj nazwisko");
            tabZaproszen[i].setNazwisko(in.nextLine());

            System.out.println("Rodzaj zaproszenia: P - pojedyncze lub O - z osobą towarzyszącą");
            if(in.nextLine().equals("P")){
                tabZaproszen[i].setTypZaproszenia(TypZaproszenia.POJEDYNCZE);
            }else {
                tabZaproszen[i].setTypZaproszenia(TypZaproszenia.Z_OS_TOWARZYSZACA);
            }
        }

        int iloscGosci=0;

        for (int i = 0; i <tabZaproszen.length ; i++) {

            if(tabZaproszen[i].getTypZaproszenia().equals(TypZaproszenia.POJEDYNCZE)){
                iloscGosci++;
            }else{
                iloscGosci+=2;
            }

        }

        System.out.println(" Zaproszono "+iloscGosci+"gości na weselu ");
    }
}
