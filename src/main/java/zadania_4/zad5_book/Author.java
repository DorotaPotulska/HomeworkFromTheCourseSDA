package zadania_4.zad5_book;

public class Author {

        private String imie;
        private String nazwisko;

        public Author(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        @Override
        public String toString() {
            return "Author{" +
                    "imie='" + imie + '\'' +
                    ", nazwisko='" + nazwisko + '\'' +
                    '}';
        }
}
