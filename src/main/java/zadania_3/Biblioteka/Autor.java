package zadania_3.Biblioteka;

public class Autor extends Czlowiek{

    public Autor(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    public String toString(){
        return "Autor "+ this.imie+" "+this.nazwisko;
    }
}
