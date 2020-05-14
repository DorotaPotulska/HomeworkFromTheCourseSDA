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
public class zad1_A {
    public static void main(String[] args) {
       Student_1 Dorota = new Student_1(99204,"Dorota","Chajewska",'K');
       Student_1 Piotr = new Student_1(97013,"Piotr","Potulski",'M');

       Student_1[] daneStudentow = new Student_1[]{Dorota,Piotr};

       for(int i=0;i<daneStudentow.length;i++){

           System.out.print(daneStudentow[i].imie+" "+daneStudentow[i].nazwisko+" "+daneStudentow[i].nrIndeksu+" "+daneStudentow[i].plec);
           System.out.println();
       }
    }
}
