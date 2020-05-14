package zadania_2.klasa_obiekt_Zrobic.zad5;

import java.util.List;

public class CentrumKonferencyjne {

    private StanCentrum stanCentrum;
    private List<SalaKonferencyjna> saleKonferencyjne;

    public CentrumKonferencyjne(final StanCentrum stanCentrum, final List<SalaKonferencyjna> saleKonferencyjne) {
        this.stanCentrum = stanCentrum;
        this.saleKonferencyjne = saleKonferencyjne;
    }

    public boolean dodajSaleKonferencyjna(SalaKonferencyjna salaKonferencyjna){
        boolean czyNaLiscie = false;
        for (SalaKonferencyjna sala:saleKonferencyjne) {
            if(salaKonferencyjna.getNumerSali()==sala.getNumerSali()){
                czyNaLiscie= true;
                break;
            }
        }

        if(czyNaLiscie == false){
            saleKonferencyjne.add(salaKonferencyjna);
            return true;
        } else{
            return false;
        }
    }

    public void wylistujWszystkieSale(){
        for (SalaKonferencyjna sala:saleKonferencyjne) {
            System.out.println(sala);
        }
    }

    public SalaKonferencyjna znajdzNajtanszaSale(int iloscPotrzebnychMiejsc){
        double najtanszaCena=-10.0;
        SalaKonferencyjna najtanszaSala = new SalaKonferencyjna();
        int i=0;
        for (SalaKonferencyjna sala: saleKonferencyjne) {
            if(sala.getPojemnoscSali()>=iloscPotrzebnychMiejsc && sala.getCzyZajeta()==false){
                if(i==0) {
                    najtanszaCena = sala.getCenaSali();
                    najtanszaSala=sala;
                    i++;
                }

                if(najtanszaCena>sala.getCenaSali()){
                    najtanszaCena=sala.getCenaSali();
                    najtanszaSala=sala;
                }
            }

        }
        return najtanszaSala;
    }

    public SalaKonferencyjna znajdzNajtanszaSale(){
        double najtanszaCena=-10.0;
        SalaKonferencyjna najtanszaSala = new SalaKonferencyjna();
        int i=0;
        for (SalaKonferencyjna sala: saleKonferencyjne) {
            if(sala.getCzyZajeta()==false){
                if(i==0) {
                    najtanszaCena = sala.getCenaSali();
                    najtanszaSala=sala;
                    i++;
                }

                if(najtanszaCena>sala.getCenaSali()){
                    najtanszaCena=sala.getCenaSali();
                    najtanszaSala=sala;
                }
            }
        }
        return najtanszaSala;
    }

    public boolean zarezerwujSale(int numerSali){
        boolean czyUdaloSieZarezerwowac=false;

        for (SalaKonferencyjna sala:saleKonferencyjne) {
            if(sala.getNumerSali()==numerSali) {
                if (sala.getCzyZajeta() == false) {
                    sala.setCzyZajeta(true);
                    czyUdaloSieZarezerwowac = true;
                }
                break;
            }
        }
        return czyUdaloSieZarezerwowac;
    }

    public void wylistujWolneSale(){

        for (SalaKonferencyjna sala : saleKonferencyjne) {
            if(sala.getCzyZajeta()==false){
                System.out.println(sala);
            }

        }
    }

    public boolean zwolnijSale(int numerSali){
        boolean czyUdaloSieZwolnicSale=false;

        for (SalaKonferencyjna sala:saleKonferencyjne) {

            if(sala.getNumerSali()==numerSali){
                if(sala.getCzyZajeta()==true){
                    sala.setCzyZajeta(false);
                    czyUdaloSieZwolnicSale=true;
                }
                break;
            }

        }

        return czyUdaloSieZwolnicSale;
    }

    public void wypiszStanSali(int numerSali){
        for (SalaKonferencyjna sala:saleKonferencyjne) {

            if(sala.getNumerSali()==numerSali){
                System.out.println(sala);

                System.out.println("Sala numer "+sala.getNumerSali()+
                        " o pojemności "+ sala.getPojemnoscSali()+" osób, "+
                        "jest obecnie "+ ((sala.getCzyZajeta()==true) ? "zajęta":"wolna")+
                        " a jej cena wynosi "+sala.getCenaSali());
            }

        }
    }
}

