package zadania_2.obiektowosc.zad1;
/*zad 1 Stwórz klasę SalaLekcyjna która posiada pola:
        String nazwa;
        int numerSali;

    dodaj metodę: (gdzie powinna sie znalezc metoda ktora dziala na polach sali?)
        wypiszDaneSali():void - która wypisuje informacje dot. sali

    Stwórz dwie/trzy sale i wypisz jej informacje na konsole*/
    public class SalaLekcyjna {

        String nazwa;
        int numerSali;

        public SalaLekcyjna(String nazwa,int numerSali){
            this.nazwa =nazwa;
            this.numerSali=numerSali;
        }
        public void wypiszDaneSali(){
            System.out.println("Sala nazywa się "+nazwa+" i ma numer "+numerSali);
        }

}
