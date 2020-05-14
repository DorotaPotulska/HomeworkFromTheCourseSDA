package zadania_1.dodatkowe;

/*5. Zadeklaruj zmienne logiczne (boolean) które noszą nazwe:
        jest_cieplo     wieje_wiatr     swieci_slonce
        oraz zmienne:     ubieram_sie_cieplo - jesli nie jest cieplo lub wieje wiatr
        biore_parasol - jesli nie swieci slonce ale nie wieje wiatr
        ubieram_kurtke - jesli wieje, nie ma slonca i nie jest cieplo*/
public class zad5 {
    public static void main(String[] args) {
        boolean jest_cieplo = true;
        boolean wieje_wiatr = false;
        boolean swieci_slonce = false;

        boolean ubieram_sie_cieplo;
        boolean biore_parasol;
        boolean ubieram_kurtke;

        if (!jest_cieplo || wieje_wiatr) {
            ubieram_sie_cieplo = true;
            System.out.println("ubieram_sie_cieplo " + ubieram_sie_cieplo);
        } else if (!swieci_slonce && !wieje_wiatr) {
            biore_parasol = true;
            System.out.println("biore_parasol " + biore_parasol);
        } else if (wieje_wiatr && !swieci_slonce && !jest_cieplo) {
            ubieram_kurtke = true;
            System.out.println("ubieram_kurtke " + ubieram_kurtke);
        }

    }
}
