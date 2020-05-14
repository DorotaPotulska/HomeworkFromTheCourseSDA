package zadania_5.kolekcje_listy.zad5_student;

import java.util.ArrayList;

/*5. ​Stwórz klasę Student która posiada pola: nr indeksu imie nazwisko płeć (wartość enum)

        W mainie stwórz instancję kolekcji typu ArrayList, która zawiera obiekty klasy Student.
        Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek).

        a. Spróbuj wypisać elementy listy stosując zwykłego "sout'a"
        b. Spróbuj wypisać elementy stosując pętlę foreach
        c. Wypisz tylko kobiety
        d. Wypisz tylko mężczyzn
        e. Wypisz tylko indeksy osób*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> listaStudentow= new ArrayList<>();

        listaStudentow.add(new Student("Dorota","Nazwisko",99204,Plec.K));
        listaStudentow.add(new Student("Piotr","Potulski",99199,Plec.M));
        listaStudentow.add(new Student("Anastazja","Potulska",88999,Plec.K));
        listaStudentow.add(new Student("Maks","Potulski",11223,Plec.M));
        listaStudentow.add(new Student("Dorota","Potulska",88204,Plec.K));


        System.out.println(listaStudentow);

        for(Student x:listaStudentow){
            System.out.println(x);
        }

        System.out.println("Wypisanie kobiet");
        for(int i=0; i<listaStudentow.size();i++){
            if ((listaStudentow.get(i).plec).equals(Plec.K)){
                System.out.println(listaStudentow.get(i));
            }
        }

        System.out.println("Wypisanie mezczyzn");
        for(int i=0; i<listaStudentow.size();i++){
            if ((listaStudentow.get(i).plec).equals(Plec.M)){
                System.out.println(listaStudentow.get(i));
            }
        }

        System.out.println("Wypisanie indeksów");
        for(int i=0; i<listaStudentow.size();i++){
            System.out.println(listaStudentow.get(i).nrIndeksu);
        }
    }
}
