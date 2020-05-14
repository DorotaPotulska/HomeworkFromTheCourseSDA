package zadania_2.klasa_obiekt_Zrobic.zad1_komputer;
/*1.	Stwórz klasę Komputer która posiada pole:
        potrzebna moc (int)
        producent( string)
        typ proceseora (enum WIELORDZENIOWY/JEDNORDZENIOWY)

        Stwórz klasę dziedziczącą Laptop która posiada dodatkowe pole:
        wielkosc matrycy (double)
        czy posiada retine (boolean)

        Stwórz kilka obiektów typu Laptop i typu Komputer. Umieść je w tabelach,
        a następnie wypisz pętlą while. Dla laptopów wypisz rowniez ich wielkosc matrycy.
        (skorzystaj z instanceof -> https://stackoverflow.com/questions/7526817/use-of-instance-of-in-java)*/

public class Main {
    public static void main(String[] args) {
        Laptop laptop1=new Laptop(100,"Lenovo", TypProcesora.WIELORDZENIOWY,30,true);
        Laptop laptop2=new Laptop(100,"Dell", TypProcesora.JEDNORDZENIOWY,30,true);
        Laptop laptop3=new Laptop(200,"Lenovo", TypProcesora.WIELORDZENIOWY,30,false);

        Laptop[] laptopy={laptop1,laptop2,laptop3};

        Komputer komputer1=new Komputer(400,"Lenovo", TypProcesora.WIELORDZENIOWY);
        Komputer komputer2=new Komputer(200,"Dell", TypProcesora.WIELORDZENIOWY);
        Komputer komputer3=new Komputer(100,"Lenovo", TypProcesora.JEDNORDZENIOWY);

        Komputer[] komputery ={komputer1,komputer2,komputer3};

        int i =0;

        while(i<laptopy.length){
            System.out.println(laptopy[i].toString());
            System.out.println("Laptop instanceof Komputer");
            System.out.println(laptopy[i] instanceof Komputer);
            System.out.println("Laptop instanceof Laptop");
            System.out.println(laptopy[i] instanceof Laptop);
            i++;
        }

        int j=0;
        while (j<komputery.length){
            System.out.println(komputery[j].toString());
            System.out.println("Komputer instanceof Laptop");
            System.out.println(komputery[j] instanceof Laptop);
            System.out.println("Komputer instanceof Komputer");
            System.out.println(komputery[j] instanceof Komputer);
            j++;
        }
    }
}
