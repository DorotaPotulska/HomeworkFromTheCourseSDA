package zadania_4.zad3A_komputer;

public class PodzespolKomputerowy {
    private String wentylator;
    private String plytaGlowna;
    private MagazynDanych magazynDanych;
    private ZrodloZasilania zrodloZasilania;
    private UkladObliczeniowy ukladObliczeniowy;

    public PodzespolKomputerowy(String wentylator, String plytaGlowna, MagazynDanych magazynDanych, ZrodloZasilania zrodloZasilania, UkladObliczeniowy ukladObliczeniowy) {
        this.wentylator = wentylator;
        this.plytaGlowna = plytaGlowna;
        this.magazynDanych = magazynDanych;
        this.zrodloZasilania = zrodloZasilania;
        this.ukladObliczeniowy = ukladObliczeniowy;
    }
}
