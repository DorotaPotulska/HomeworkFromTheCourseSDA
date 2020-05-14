package zadania_2.oop_okrojone.zad1;

public class zad1_B {
    public static void main(String[] args) {
        Student_2 Maks = new Student_2();
       Maks.setImie("Maksymilian");
       Maks.setNazwisko("Potulski");
       Maks.setNrIndeksu(15813);
       Maks.setPlec('M');

       Student_2 Dorota = new Student_2();
       Dorota.setImie("Dorota");
       Dorota.setNazwisko("Chajewska");
       Dorota.setNrIndeksu(99204);
       Dorota.setPlec('K');

       Student_2 Piotr = new Student_2();
       Piotr.setImie("Piotr");
       Piotr.setNazwisko("Potulski");
       Piotr.setNrIndeksu(99213);
       Piotr.setPlec('M');


        Student_2[] daneStudentow = new Student_2[]{Dorota,Piotr,Maks};

        for(int i=0;i<daneStudentow.length;i++){

            System.out.print(daneStudentow[i].getImie() +" "+daneStudentow[i].getNazwisko()+" "+daneStudentow[i].getNrIndeksu()+" "+daneStudentow[i].getPlec());
            System.out.println();
        }
    }
}
