package zadania_3.zad6_komunikacjaMiejska;

public enum IloscWagonow {
    SKLAD_1_WAGONOWY(1),
    SKLAD_2_WAGONOWY(2),
    SKLAD_3_WAGONOWY(3);

    private int ilosc;

    IloscWagonow(final int ilosc) {
        this.ilosc = ilosc;
    }

    public int getIlosc() {
        return ilosc;
    }
}
