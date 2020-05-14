package zadania_4.zad1;

public class Brama implements IOpenable {
    boolean czyOtwarte;

    public Brama(boolean czyOtrwate) {
        this.czyOtwarte = czyOtrwate;
    }

    @Override
    public boolean czyOtwarty() {
        return this.czyOtwarte;
    }

    @Override
    public void otworz() {
        if(this.czyOtwarte ==true){
            System.out.println("Brama już jest otwarta");
        }else{
            this.czyOtwarte =true;
            System.out.println("Otworzyłem brame");
        }

    }

    @Override
    public void zamknij() {
        if(this.czyOtwarte ==true){
            this.czyOtwarte =false;
            System.out.println("Zamknąłem brame");
        }else{
            System.out.println("Brama jest zamknieta");
        }

    }
}
