package zadania_2.oop_okrojone.zad4;
/*Zadanie 4
        Utwórz własny typ daty np. MojaData, który przyjmuje 3 argumenty typu int dla określenia dni, miesięcy i lat.
        Dodaj metodę wyświetl datę, który wyświetli datę w następujący sposób:
        a. 1.11.2011 (pierwszy listopada 2011)
        b. 01.11.2011
        c. * 1 lis 2011*/
public class zad4 {
    public static void main(String[] args) {
        Data data=new Data(1,11,2011);
        data.wyswietlDate();
        data.wyswietlDate2();
        data.wyswietlDate3();

       /* System.out.println("Podaj dzień: ");
        data.pobierzInt();
        System.out.println("Podaja miesiąc");
        data.pobierzInt();
        System.out.println("Podaj rok");
        data.pobierzInt();*/
    }
}
