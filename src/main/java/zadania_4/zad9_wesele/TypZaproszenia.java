package zadania_4.zad9_wesele;

public enum TypZaproszenia {
    POJEDYNCZE(1),
    Z_OS_TOWARZYSZACA (2);

    private int ileOsob;

    TypZaproszenia(int ileOsob) {
        this.ileOsob = ileOsob;
    }

    public int getIleOsob(){
        return  ileOsob;
    }


}
