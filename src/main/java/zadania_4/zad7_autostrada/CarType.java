package zadania_4.zad7_autostrada;

public enum CarType {
    TRUCK(3),
    CAR(2),
    MOTORCYCLE(1);

    CarType(int mnoznik) {
        this.mnoznik=mnoznik;
    }

    private int mnoznik;

    public int getMnoznik() {
        return mnoznik;
    }
}
