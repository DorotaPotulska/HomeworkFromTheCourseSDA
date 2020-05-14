package zadania_5.kolekcje_listy.zad6_DOKONCZ;

import java.util.List;

public class Student {

    private List<Double> listaOcen;
    private String nrIndeksu;
    private String imie;
    private String nazwisko;

    public Student(List<Double> listaOcen, String nrIndeksu, String imie, String nazwisko) {
        this.listaOcen = listaOcen;
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student() {
    }

    public List<Double> getListaOcen() {
        return listaOcen;
    }

    public String getNrIndeksu() {
        return nrIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                "listaOcen=" + listaOcen +
                ", nrIndeksu='" + nrIndeksu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
