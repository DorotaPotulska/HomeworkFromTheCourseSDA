package zadania_2.obiektowosc.zad1;

/*zad 1 Stwórz klasę SalaLekcyjna która posiada pola:
        String nazwa;
        int numerSali;

        dodaj metodę: (gdzie powinna sie znalezc metoda ktora dziala na polach sali?)
        wypiszDaneSali():void - która wypisuje informacje dot. sali

        Stwórz dwie/trzy sale i wypisz jej informacje na konsole*/
public class Main {
    public static void main(String[] args) {
        SalaLekcyjna Zabki = new SalaLekcyjna("Żabki",5);
        SalaLekcyjna Sowki=new SalaLekcyjna("Sówki",6);

        SalaLekcyjna tablicaSal[]=new SalaLekcyjna[]{Zabki,Sowki};

        for(int i=0;i<tablicaSal.length;i++){
            tablicaSal[i].wypiszDaneSali();
        }

    }
}
