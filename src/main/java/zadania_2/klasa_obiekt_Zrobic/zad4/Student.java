package zadania_2.klasa_obiekt_Zrobic.zad4;

import java.util.List;
import java.util.Objects;

public class Student{
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
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        final Student student = (Student) o;
        return Objects.equals(getNrIndeksu(), student.getNrIndeksu()) &&
                Objects.equals(getImie(), student.getImie()) &&
                Objects.equals(getNazwisko(), student.getNazwisko());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNrIndeksu(), getImie(), getNazwisko());
    }

    @Override
    public String toString() {
        return '\n'+"Student{" +
                "listaOcen=" + listaOcen +
                ", nrIndeksu='" + nrIndeksu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }


}
