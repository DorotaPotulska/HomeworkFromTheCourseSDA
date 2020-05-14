package zadania_5.kolekcje_listy.zad5_student;

public class Student {
    String imie;
    String nazwisko;
    int nrIndeksu;
    Plec plec;

    public Student(String imie, String nazwisko, int nrIndeksu, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrIndeksu=" + nrIndeksu +
                ", plec=" + plec +
                '}';
    }
}
