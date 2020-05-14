package zadania_5.kolekcje_listy.zad6_DOKONCZ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dziennik {
    private List<Student> listaStudentow;

    public Dziennik(List<Student> listaStudentow) {
        this.listaStudentow = listaStudentow;
    }

    public void dodajStudenta(Student student){
        listaStudentow.add(student);
    }

    public void dodajStudenta2(Student... student){
        listaStudentow.addAll(Arrays.asList(student));
    }
 /*   public void usunStudenta(Student student){
       *//* for(Student x:listaStudentow){
            if(x.equals(student)) {
                listaStudentow.remove(student);
            }
        }*//*
        listaStudentow.remove(student);
    }*/

    public void usunStudenta2(Student... student){
        for (int i = 0; i < student.length; i++) {
            listaStudentow.remove(student[i]);
        }

}

    public void usunStudenta(String nrIndeksu){
        for(int i=0;i<listaStudentow.size();i++){
            if((listaStudentow.get(i).getNrIndeksu()).equals(nrIndeksu)){
                listaStudentow.remove(listaStudentow.get(i));

            }
        }
    }

    public Student zwrocStudenta(String nrIndeksu){
        Student student= new Student();
        for(int i=0;i<listaStudentow.size();i++){
            if((listaStudentow.get(i).getNrIndeksu()).equals(nrIndeksu)){
                student=listaStudentow.get(i);
                break;
            }
        }
        return student;
    }

    public List<Student> zwrocStudenta2(String... nrIndeksu){
        List<Student> znalezieni= new ArrayList<>();
        Student student= new Student();
        for (int i = 0; i < nrIndeksu.length; i++) {
            for(int j=0;j<listaStudentow.size();j++){
                if((listaStudentow.get(j).getNrIndeksu()).equals(nrIndeksu[i])){
                    student=listaStudentow.get(j);
                    znalezieni.add(student);

                }
            }

        }
        return znalezieni;
    }
  /*      - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer indexu studenta,
    a w wyniku zwraca konkretnego studenta.
            - posiadać metodę 'podajŚredniąStudenta(String):double'
    która przyjmuje indeks studenta i zwraca średnią ocen studenta.*/

        public double podajŚredniąStudenta(String nrIndesku){
            double srednia =0;
            double suma=0;
            int licznik=0;
            for(Student x:listaStudentow){
                if (x.getNrIndeksu().equals(nrIndesku)) {
                    for(double y:x.getListaOcen()){
                        suma+=y;
                        licznik++;
                    }
                    srednia=suma/licznik;
                }
            }
            return srednia;
        }

        public List<Student> podajStudentowZagrozonych(){
            List<Student> zagrozeni = new ArrayList<>();

             for(Student x:listaStudentow){
                 if (podajŚredniąStudenta(x.getNrIndeksu())<2.0){
                     zagrozeni.add(x);
                 };
             }
            return zagrozeni;

        }

        public List<Student> posortujStudentówPoIndeksie(){
            Collections.sort(listaStudentow,new SortujPoNrIndeksu());
            return listaStudentow;
        }

           /* - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>'
            - która sortuje listę studentów po numerach indeksów, a następnie zwraca posortowaną listę.*/

public void dodajOcene (String nrIndeksu,double... oceny){
    for(int i=0;i<listaStudentow.size();i++){
        if((listaStudentow.get(i).getNrIndeksu()).equals(nrIndeksu)){
            for (int j = 0; j < oceny.length; j++) {
                listaStudentow.get(i).getListaOcen().add(oceny[j]);
                //System.out.println(listaStudentow.get(i).getListaOcen());
            }

        }
    }

}
    @Override
    public String toString() {
        return "Dziennik{" +
                "listaStudentow=" + listaStudentow +
                '}';
    }
}
