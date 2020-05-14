package zadania_4.zad1;

public class Okno implements IOpenable{
    boolean czyOtwarte;

    public Okno(boolean czyOtrwate) {
        this.czyOtwarte = czyOtrwate;
    }

    @Override
    public boolean czyOtwarty() {
        return this.czyOtwarte;
    }

    @Override
    public void otworz() {
        if(this.czyOtwarte ==true){
            System.out.println("Okno już jest otwarte");
        }else{
            this.czyOtwarte =true;
            System.out.println("Otworzyłem okno");
        }

    }

    @Override
    public void zamknij() {
        if(this.czyOtwarte ==true){
            this.czyOtwarte =false;
            System.out.println("Zamknąłem okno");
        }else{
            System.out.println("Okno jest zamkniete");
        }

    }
}
