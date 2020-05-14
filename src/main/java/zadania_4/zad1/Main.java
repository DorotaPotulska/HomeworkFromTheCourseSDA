package zadania_4.zad1;
/*
Zadanie 1:
        Stwórz interfejs IOpenable. W interfejsie zaimplementuj metodę:
        - czyOtwarty():boolean
        Stwórz interfejs IOtwieralny. Interfejs powinien rozszerzać interfejs IOpenable. W interfejsie zaimplementuj metodę:
        - otwórz():void
        Stwórz interfejs IZamykalny. Interfejs powinien rozszerzać interfejs IOpenable. W interfejsie zaimplementuj metodę:
        - zamknij():void
        Stwórz interfejs IWłączalny. W interfejsie zaimplementuj metody:
        - włącz():void
        - czyWłączony():boolean
        Stwórz interfejs IWyłączalny. W interfejsie zaimplementuj metody:
        - wyłącz():void
        - czyWłączony():boolean
        Stwórz klasę:
        Czajnik, Okno, Drzwi, Brama, Alarm, Samochód.
        W których z tych klas warto zaimplementować który interfejs?
        Spróbuj zaimplementować klasy jak najpełniej.
        Pamiętaj o paradygmacie abstrakcji.
        Stwórz main'a i w nim kilka obiektów.
        Co najmniej po jednym każdego typu.
        Dodaj obiekty IOpenable do tablicy.
        Przeiteruj je i wszystkie otwórz, a następnie zamknij.
*/

public class Main {
    public static void main(String[] args) {
        Okno okno1= new Okno(true);
        Okno okno2= new Okno(false);
        System.out.println("Okno pierwsze");
        System.out.println(okno1.czyOtwarty());
        okno1.otworz();
        okno1.zamknij();
        System.out.println();
        System.out.println("Okno drugie");
        System.out.println(okno2.czyOtwarty());
        okno2.otworz();
        okno2.zamknij();


        Samochod samochod= new Samochod(true,false);

        System.out.println();
        System.out.println("Samochód");
        samochod.czyOtwarty();
        samochod.otworz();
        samochod.zamknij();
        samochod.czyWlaczony();
        samochod.wlacz();
        samochod.czyWylaczony();
        samochod.zamknij();

        Alarm alarm = new Alarm(true);

        alarm.czyWlaczony();
        alarm.czyWylaczony();
        alarm.wlacz();
        alarm.wylacz();

        Brama brama= new Brama(true);

        brama.czyOtwarty();
        brama.zamknij();
        brama.otworz();

        Czajnik czajnik= new Czajnik(true,true);

        System.out.println();
        System.out.println("Czajnik");
        czajnik.czyOtwarty();
        czajnik.otworz();
        czajnik.zamknij();
        czajnik.czyWlaczony();
        czajnik.wlacz();
        czajnik.czyWylaczony();
        czajnik.zamknij();

        Drzwi drzwi = new Drzwi(true);

        System.out.println("Drzwi");
        System.out.println(drzwi.czyOtwarty());
        drzwi.otworz();
        drzwi.zamknij();

        IOpenable[] iOpenables = new IOpenable[]{okno1,okno2,samochod,drzwi,brama,czajnik};

        for(IOpenable x:iOpenables){
            x.otworz();
        }

        for(IOpenable x:iOpenables){
            x.zamknij();;
        }

        for(IOpenable x:iOpenables){
            x.zamknij();;
        }
        for(IOpenable x:iOpenables){
            x.otworz();
        }

    }
}
