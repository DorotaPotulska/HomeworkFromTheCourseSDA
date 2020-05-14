package zadania_4.zad5_book;
/*
Zadanie 5:
        Zaimplementuj aplikację która pozwala tworzyć i przechowywać obiekty Book i Author.
        Każda książka (Book) może mieć maksymalnie 3 autorów. Książka posiada pola:
        - tytuł:String
        - isbn:String
        - rokWydania:int
        - autorzy:Author[3] (tablica stałej długości)
        - ilośćAutorów:int (pole pomocnicze)(podpowiedź: spójrz na projekt DynamicznaTablica.
        Tam znajduje się podpowiedź jak 'zarządzać' autorami)
        Klasa Author:
        - imie:String
        - nazwisko:String
        Aplikacja powinna przechowywać 10 książek (stwórz je na sztywno w Main).
        Książki domyślnie nie mają autorów (ilość autorów = 0, ale autorzy [tablica] jest zainicjowana
        na sztywno z długością 3). Aplikacja ma umożliwiać dodawanie i wypisywanie autorów poprzez komendy.
        Przykład działania:# poprawne działanie
        Co chcesz zrobić? [wypisz, dodaj, quit]
        wypisz
        Podaj tytuł książki:
        Pan Tadeusz
        Ta książka nie ma autorów.
        Co chcesz zrobić? [wypisz, dodaj, quit]
        dodaj
        Podaj tytuł książki:
        Pan Tadeusz
        Podaj imie i nazwisko autora:
        Henryk Sienkiewicz
        Autor dodany.
        Co chcesz zrobić? [wypisz, dodaj, quit]
        wypisz
        Pan Tadeusz
        Pan Tadeusz, autorzy:
        Henryk Sienkiewicz
        Co chcesz zrobić? [wypisz, dodaj, quit]
        quit# złe działanieCo chcesz zrobić? [wypisz, dodaj, quit]
        wypisz
        Podaj tytuł książki:
        Pan Tadeuszek
        Nie ma takiej książki
        Co chcesz zrobić? [wypisz, dodaj, quit]
        dodaj
        Podaj tytuł książki:
        Pan Tadeuszek
        Nie ma takiej książki
        Co chcesz zrobić? [wypisz, dodaj, quit]
        wypisz
        Pan Tadeuszek
        Nie ma takiej książki
        Co chcesz zrobić? [wypisz, dodaj, quit]
        quit
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        //ArrayList<Author> autorzy=new ArrayList<Author>(3);
        String tytulKsiazki;

        ArrayList<Book> books= new ArrayList<>();

                books.add(new Book("Tytul1","123",1991, new ArrayList<Author>(3)));
                books.add(new Book("Tytul2","545",2000, new ArrayList<Author>(3)));
                books.add(new Book("Tytul3","765",1920, new ArrayList<Author>(3)));
                books.add(new Book("Tytul4","234",2013, new ArrayList<Author>(3)));
                books.add(new Book("Tytul5","675",1981, new ArrayList<Author>(3)));
                books.add(new Book("Tytul6","988",1888, new ArrayList<Author>(3)));
                books.add(new Book("Tytul7","356",1900, new ArrayList<Author>(3)));
                books.add(new Book("Tytul8","754",1921, new ArrayList<Author>(3)));
                books.add(new Book("Tytul9","876",1921, new ArrayList<Author>(3)));
                books.add(new Book("Tytul10","234",1941, new ArrayList<Author>(3)));

                boolean wyjscie=false;
        do {
            Scanner in = new Scanner(System.in);
            String wybor;
            System.out.println("Co chcesz zrobić? [wypisz, dodaj, quit]");
            wybor = in.nextLine();

            switch (wybor) {
                case "wypisz":
                    System.out.println("Podaj tytuł książki");
                    tytulKsiazki = in.nextLine();
                    wypisz(books,tytulKsiazki);
                    break;
                case "dodaj":
                    System.out.println("Podaj tytuł książki");
                    tytulKsiazki = in.nextLine();
                    dodaj(books,tytulKsiazki);
                    break;
                case "quit":
                    wyjscie=true;
                    break;
                default:
                    System.out.println("Zle działanie");
                    break;
            }

            for (Book x : books) {
                System.out.println(x);
            }
        }while(wyjscie==false);
    }


    private static void wypisz(ArrayList<Book> books, String tytulKsiazki) {
        int licznik=0;
        for (Book x : books) {

            if (x.getTytul().equalsIgnoreCase(tytulKsiazki)) {
                if (x.getAutorzy().size() == 0) {
                    System.out.println("Ta ksiązka nie ma autorów");
                    licznik++;
                    break;
                }else{
                    System.out.println(x.getAutorzy());
                    licznik++;
                }

            }
        }
        if(licznik==0){
            System.out.println("Nie ma takiej książki");
        };
    }

    public static void dodaj(ArrayList<Book> books, String tytulKsiazki){
        Scanner in = new Scanner(System.in);
        int licznik=0;

        for (Book x : books) {
            if (x.getTytul().equalsIgnoreCase(tytulKsiazki)) {
                if (x.getAutorzy().size() == 3) {
                    System.out.println("Ta ksiązka ma juz 3 autorów");
                    licznik++;
                    break;
                }
                System.out.println("Podaj imię");
                String imie = in.nextLine();
                System.out.println("Podaj nazwisko");
                String nazwisko = in.nextLine();
                //ArrayList<Author> autor = new ArrayList<>();
                ArrayList<Author> autor = x.getAutorzy();
                autor.add(new Author(imie, nazwisko));
                x.setAutorzy(autor);
                x.setIloscAutorow(x.getAutorzy().size());
                System.out.println("Autor dodany");
                licznik++;
            }

        }

        if(licznik==0){
            System.out.println("Nie ma takiej książki");
        };
    }


}
