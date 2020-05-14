package zadania_2.oop_okrojone.zad1;
/*Zadanie 1
        Stwórz klasę Student która posiada pola:
        nr indeksu
        imie
        nazwisko
        płeć (literka, K lub M)

        Stworz dla tej klasy odpowiedni konstrutkor.
        Wygeneruj dla klasy gettery, settery, konstruktor ze wszystkimi parametrami i domyślny.

        Stwórz 3 instancje obiektu student (zrob to w osobnej klasie, osobnej metodzie) i wypisz ich parametry na ekran.*/
public class Student_1 {

    /*public Student(){

    }*/
    int nrIndeksu;
    String imie;
    String nazwisko;
    char plec;

    public Student_1(int nrIndeksu, String imie,String nazwisko,char plec){
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

}
