package zadania_3.Biblioteka;

public abstract class Egzemplarz {

    protected Autor autor;
    protected String tytul;
    protected char typ;

    public Egzemplarz(Autor autor, String tytul, char typ) {
        this.autor = autor;
        this.tytul = tytul;
        this.typ = typ;
    }
    @Override
    public String toString(){
        return "Autor "+ this.autor.imie+" "+this.autor.nazwisko + " tytuł "+this.tytul+" typ "+this.typ;
    }

}
