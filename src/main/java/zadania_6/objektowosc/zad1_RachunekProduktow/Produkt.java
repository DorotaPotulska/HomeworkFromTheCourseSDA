package zadania_6.objektowosc.zad1_RachunekProduktow;

public class Produkt {
    protected String Nazwa;
    protected Double cenaNetto;
    protected PodatekProduktu wartoscPodatku;

    public Produkt(final String nazwa, final Double cenaNetto, final PodatekProduktu wartoscPodatku) {
        Nazwa = nazwa;
        this.cenaNetto = cenaNetto;
        this.wartoscPodatku = wartoscPodatku;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public Double getCenaNetto() {
        return cenaNetto;
    }

    public PodatekProduktu getWartoscPodatku() {
        return wartoscPodatku;
    }

    public void setNazwa(final String nazwa) {
        Nazwa = nazwa;
    }

    public void setCenaNetto(final Double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public void setWartoscPodatku(final PodatekProduktu wartoscPodatku) {
        this.wartoscPodatku = wartoscPodatku;
    }

    public double podajCeneBrutto(){
        double cenaBrutto=0;
        cenaBrutto=(1+ wartoscPodatku.getWartosc())* cenaNetto;
        return cenaBrutto;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "Nazwa='" + Nazwa + '\'' +
                ", cenaNetto=" + cenaNetto +
                ", wartoscPodatku=" + wartoscPodatku +
                '}';
    }
}
