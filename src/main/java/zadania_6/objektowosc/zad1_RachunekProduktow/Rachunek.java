package zadania_6.objektowosc.zad1_RachunekProduktow;

import java.util.List;

public class Rachunek {

    private List<Produkt> listaProduktow;

    public Rachunek(final List<Produkt> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    public List<Produkt> getListaProduktow() {
        return listaProduktow;
    }

    public void dodajProdukt(Produkt produkt){
        listaProduktow.add(produkt);
    }

    public void wypiszRachunek(){
        if(listaProduktow.size()>0) {
            for (int i = 0; i < listaProduktow.size(); i++) {
                System.out.println(listaProduktow.get(i));
            }
        }else{
            System.out.println("Rachunek nie posiada żadnych produktów");
        }

    }

    public double podsumujRachunekNetto(){
        double sumaCenNetto=0;
        for (int i = 0; i < listaProduktow.size(); i++) {
            sumaCenNetto+=listaProduktow.get(i).getCenaNetto();
        }
        return sumaCenNetto;
    }

    public double podsumujRachunekBrutto(){
        double sumaCenBrutto=0;
        for (int i = 0; i < listaProduktow.size(); i++) {

            sumaCenBrutto+=listaProduktow.get(i).podajCeneBrutto();

        }
        return sumaCenBrutto;
    }

    public double zwrocWartoscPodatku(){

        return podsumujRachunekBrutto()-podsumujRachunekNetto();
    }

    public void cenaVat8OrazVat23(){
        for (int i = 0; i < listaProduktow.size(); i++) {

            System.out.println("Cena produktu: "+listaProduktow.get(i).getNazwa() +" przy 8% podatku wynosiłaby "+listaProduktow.get(i).cenaNetto*(1+ PodatekProduktu.VAT8.getWartosc()));
            System.out.println("Cena produktu: "+listaProduktow.get(i).getNazwa() +" przy 23% podatku wynosiłaby "+listaProduktow.get(i).cenaNetto*(1+ PodatekProduktu.VAT23.getWartosc()));

        }
    }
}

/*
Dodatkowe:
        ** - stwórz metodę która zwróci informację o tym ile kosztowałyby wszystkie produkty gdyby posiadały podatek 8%, oraz gdyby posiadały podatek 23%.
*/
