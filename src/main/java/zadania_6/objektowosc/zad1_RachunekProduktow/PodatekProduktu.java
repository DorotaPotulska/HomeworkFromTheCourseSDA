package zadania_6.objektowosc.zad1_RachunekProduktow;

public enum PodatekProduktu {
    VAT8 (0.08),
    VAT23 (0.23),
    VAT5(0.05),
    NO_VAT(0.0);

    private double wartosc;

    PodatekProduktu(final double wartosc){
        this.wartosc=wartosc;
    }

    public double getWartosc(){
        return wartosc;
    }
}
