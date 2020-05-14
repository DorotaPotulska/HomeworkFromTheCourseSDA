package zadania_4.zad1;

public class Drzwi implements IOpenable{
    boolean czyOtwarte;

    public Drzwi(boolean czyOtwarte) {
        this.czyOtwarte = czyOtwarte;
    }

    @Override
    public boolean czyOtwarty() {
        return this.czyOtwarte;
    }

    @Override
    public void otworz() {
        if(this.czyOtwarte ==true){
            System.out.println("Drzwi już są otwarte");
        }else{
            this.czyOtwarte =true;
            System.out.println("Otworzyłem drzwi");
        }

    }

    @Override
    public void zamknij() {
        if(this.czyOtwarte ==true){
            this.czyOtwarte =false;
            System.out.println("Zamknąłem drzwi");
        }else{
            System.out.println("Drzwi są zamkniete");
        }

    }

}
