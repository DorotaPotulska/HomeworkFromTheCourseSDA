package zadania_3.zad5_zamowienia;

import java.util.ArrayList;

public class Zamowienie {

    ArrayList<Pozycja> pozycje;

    public Zamowienie(ArrayList<Pozycja> pozycje) {
        this.pozycje = pozycje;
    }

    /*int maksRozmiar;

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }

    public Zamowienie() {
        maksRozmiar=10;
    }*/

    public void dodajPozycje(Pozycja pozycja){

        pozycje.add(pozycja);

    }

    public double obliczWartosc(){
        double suma=0;
        for(Pozycja x:pozycje){
            suma+=x.obliczWartosc();
        }

      return suma;
    }

    @Override
    public String toString() {
        return "Zamowienie:\n" + pozycje +
                "Razem "+ obliczWartosc();
    }
}
