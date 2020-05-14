package zadania_2.klasa_obiekt_Zrobic.zad4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dziennik {

    private List<Student> listaStudentow;

    public Dziennik(final List<Student> listaStudentow) {
        this.listaStudentow = listaStudentow;
    }

    @Override
    public String toString() {
        return "Dziennik{" +
                "listaStudentow=" + listaStudentow +
                '}';
    }

    public void dodajStudenta(Student student){
        listaStudentow.add(student);
        System.out.println("Dodano studenta");
    }
    public void usunStudenta(Student student){
        listaStudentow.remove(student);
        System.out.println("Usunieto studenta");
    }

    public void usunStudenta(String nrIndeksu){
        for (int i = 0; i < listaStudentow.size(); i++) {
            if(listaStudentow.get(i).getNrIndeksu().equals(nrIndeksu)){
                listaStudentow.remove(listaStudentow.get(i));
            }
        }
        System.out.println("Usunięto studenta o numerze indeksu "+nrIndeksu);
    }

    public Student zwrocStudenta(String nrIndeksu){
        Student student = null;
        for (int i = 0; i < listaStudentow.size(); i++) {
            if(listaStudentow.get(i).getNrIndeksu().equals(nrIndeksu)){
                student= listaStudentow.get(i);
                break;
            }
        }
        return student;
    }

    public double podajŚredniąStudenta(String nrIndeksu){
        double srednia=0;
        double suma=0;
        int licznik=0;

        for (int i = 0; i < listaStudentow.size(); i++) {
            if(listaStudentow.get(i).getNrIndeksu().equals(nrIndeksu)){

                for (int j = 0; j < listaStudentow.get(i).getListaOcen().size(); j++) {

                    suma +=listaStudentow.get(i).getListaOcen().get(j);
                    licznik++;

                }
            }

        }
        srednia=suma/licznik;
        return srednia;

    }

    public List<Student> podajStudentówZagrożonych(){
        List<Student> listaZagrozonych = new ArrayList<>();
        double srednia;
        for (int i = 0; i <listaStudentow.size() ; i++) {
            srednia= podajŚredniąStudenta(listaStudentow.get(i).getNrIndeksu());

            if(srednia<2.0){
                listaZagrozonych.add(listaStudentow.get(i));
            }
        }
        return listaZagrozonych;
    }

    public List<Student> posortujStudentówPoIndeksie(){
        //List<Student> listaPosortowana = listaStudentow;
        Collections.sort(listaStudentow,new StudentNumberIndeksComparator());
        return listaStudentow;
    }
}
