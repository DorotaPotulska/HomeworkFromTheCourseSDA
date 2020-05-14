package zadania_3.zad4_odejmowanieDat;

/*Zadanie 4
        Rozwinięcie zadania 3– Utwórz klasę Wydarzenie o 2 polach – data wydarzenia (MojaData) oraz nazwa wydarzenia.
        Utwórz metodę:
        a. ileZostaloLat:int – zwraca czas w latach
        b. ileZostaloMiesiecy:int – zwraca czas w miesiacach
        c. ileZostaloDni:int – zwraca czas w dniach*/

public class Main {
    public static void main(String[] args) {
        //System.out.println(LocalDateTime.now().getYear());
        //System.out.println(LocalDate.now());

        Wydarzenie[] wydarzenia = {
                new Wydarzenie(new MojaData(28,3,2020),"Koncert Chylinskiej"),
                new Wydarzenie(new MojaData(4,2,2020),"Moje Urodziny"),
                new Wydarzenie(new MojaData(13,8,2020),"Urodziny Maksia"),
                new Wydarzenie(new MojaData(13,2,2020),"Urodziny Nastki"),
                new Wydarzenie(new MojaData(5,6,2020),"Urodziny Piotrka"),
        };
        //Period period = Period.between(parse.wydarzenie.getDataWydarzenia(), LocalDate.now());
        for(Wydarzenie x:wydarzenia){
            System.out.println("Do wydarzenia"+" mamy:");
            System.out.println(x);
            System.out.println(x.ileZostaloLat()+" lat,");
            System.out.println(x.ileZostaloMiesiecy()+" miesiecy");
            System.out.println(x.ileZostaloDni()+" dni");
        }

    }
}
