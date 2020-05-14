package zadania_4.zad5_book;

import java.util.ArrayList;

public class Book {

    /*tytuł:String
         - isbn:String
         - rokWydania:int
         - autorzy:Author[3] (tablica stałej długości)
         - ilośćAutorów:int (pole pomocnicze)(podpowiedź: spójrz na projekt DynamicznaTablica.
         Tam znajduje się podpowiedź jak 'zarządzać' autorami)*/

        private String tytul;
        private String isbn;
        private int rokWydania;
        private ArrayList<Author> autorzy;
        private int iloscAutorow;

        public Book(String tytul, String isbn, int rokWydania, ArrayList<Author> autorzy) {
            this.tytul = tytul;
            this.isbn = isbn;
            this.rokWydania = rokWydania;
            this.autorzy = autorzy;
        }

        public String getTytul() {
            return tytul;
        }

        public void setAutorzy(ArrayList<Author> autorzy) {
            this.autorzy = autorzy;
        }

        public ArrayList<Author> getAutorzy() {
            return autorzy;
        }

        public void setIloscAutorow(int iloscAutorow) {
            this.iloscAutorow = iloscAutorow;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "tytul='" + tytul + '\'' +
                    ", isbn='" + isbn + '\'' +
                    ", rokWydania=" + rokWydania +
                    ", autorzy=" + autorzy +
                    ", iloscAutorow=" + iloscAutorow +
                    '}';
        }
}
