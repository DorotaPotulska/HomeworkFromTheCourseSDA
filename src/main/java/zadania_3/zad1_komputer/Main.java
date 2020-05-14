package zadania_3.zad1_komputer;
/*Zadanie 1
        Stwórz klasę Komputer która posiada pola:
        potrzebna moc (int)
        producent (string)
        typ proceseora (enum o nazwie TypProcesora z wartościami: WIELORDZENIOWY/JEDNORDZENIOWY)

        Stwórz klasę dziedziczącą Laptop która posiada dodatkowe pole:
        wielkosc matrycy (double)
        czy posiada retine (boolean)
        Stwórz kilka obiektów typu Laptop i typu Komputer. Umieść je w tabelach, a następnie wypisz pętlą while.

        *Dla laptopów (żeby sprawdzić czy komputer jest Laptopem zastosuj instanceof) wypisz rowniez ich wielkosc matrycy.*/

public class Main {
    public static void main(String[] args) {
        Komputer komputer1 = new Komputer(200,"Lenovo", TypProcesora.WIELORDZENIOWY);
        Komputer komputer2 =new Komputer(300,"Dell", TypProcesora.JEDNORDZENIOWY);
        Komputer komputer3 = new Komputer(400,"Acer", TypProcesora.WIELORDZENIOWY);

        Komputer[] tablicaKomp = {komputer1,komputer2,komputer3};

        Laptop laptop1= new Laptop(200,"Lenovo", TypProcesora.WIELORDZENIOWY,300,true);
        Laptop laptop2= new Laptop(300,"Dell", TypProcesora.WIELORDZENIOWY,300,true);
        Laptop laptop3= new Laptop(400,"Acer", TypProcesora.WIELORDZENIOWY,300,true);

        Laptop[] tabLap ={laptop1,laptop2,laptop3};

        int i=0;
        while(i<tabLap.length){
            System.out.println(tabLap[i].toString());
            System.out.println(tabLap[i] instanceof Komputer);
            i++;
        }

        int j=0;
        while(j<tablicaKomp.length){
            System.out.println(tablicaKomp[j].toString());
            System.out.println(tablicaKomp[j] instanceof Laptop);
            j++;
        }
    }
}
