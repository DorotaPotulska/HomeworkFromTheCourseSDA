package zadania_3.zad7_robot;

public enum RuchRobota{
    KROK_LEWA(10),
    KROK_PRAWA(10),
    RUCH_REKA_LEWA(5),
    RUCH_REKA_PRAWA(5),
    SKOK(20);

    private int energia;

    RuchRobota(int energia) {

        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }
}
