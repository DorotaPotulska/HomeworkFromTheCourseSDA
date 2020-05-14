package zadania_3.zad6_komunikacjaMiejska;

import java.util.ArrayList;
import java.util.Arrays;

/*Zadanie 6
        https://www.mimuw.edu.pl/~kozubek/teaching/2010-2011/po/zajecia06/laboratorium06.pdf
        Laboratorium z programowania obiektowego23.03.2011 r.
        Zaprojektuj hierarchię klas opisujących pojazdy komunikacji miejskiej.
        Wyraź w tej hie-rarchii następujące fakty:
        •wszystkie pojazdy komunikacji miejskiej (k. m.) są pojazdami,
        •komunikacja miejska używa tramwajów i autobusów,
        •pojazdy są garażowane w zajezdniach, odpowiednio tramwajowych i autobusowych,
        •każdy pojazd zna swoją szybkość maksymalną,•każdy pojazd k. m. zna swój numer,
        •każdy pojazd k. m. zna swoją zajezdnię,
        •każdy tramwaj jest zestawem 1 do 3 wagonów (i wie, z ilu wagonów się składa),
        •każdy autobus wie, ile zużył paliwa w bieżącym miesiącu,
        •każda zajezdnia zna swoją nazwę,
        •każda zajezdnia wie, jakie pojazdy do niej należą,
        •każda zajezdnia ma nazwę.
        Każdy pojazd musi umieć podać swój opis w postaci napisu.
        Opis ma zawierać wszystkieinformacje, które zna dany pojazd (np. numer, czy szybkość maksymalną).
        Opis zajezdnito nazwa zajezdni, jej typ i opisy poszczególnych pojazdów.
        Zajezdnia autobusowa podajedodatkowo sumaryczne zużycie paliwa w bieżącym miesiącu,
        a tramwajowa ogólną liczbęwagonów.

        Napisz program w Javie, który utworzy kilka obiektów
        reprezentujących różne pojazdyi dwie zajezdnie (autobusową i tramwajową),
        przydzieli pojazdy do zajezdni, a następniewypisze opis obu zajezdni.*/
public class Main {
    public static void main(String[] args) {

        Tramwaj tramwaj1= new Tramwaj(20,13, IloscWagonow.SKLAD_1_WAGONOWY);
        Tramwaj tramwaj2= new Tramwaj(40,14, IloscWagonow.SKLAD_2_WAGONOWY);
        Tramwaj tramwaj3= new Tramwaj(30,15, IloscWagonow.SKLAD_1_WAGONOWY);
        Tramwaj tramwaj4= new Tramwaj(10,16, IloscWagonow.SKLAD_3_WAGONOWY);

        Autobus autobus1= new Autobus(50,113,100);
        Autobus autobus2= new Autobus(50,213,130);
        Autobus autobus3= new Autobus(50,313,133);
        Autobus autobus4= new Autobus(50,413,200);

        Zajezdnia zajezdniaTramwajowa= new Zajezdnia("Chabrowa",new ArrayList<>(Arrays.asList(tramwaj1,tramwaj2,tramwaj3,tramwaj4)),TypZajezdni.TRAMWAJOWA);
        Zajezdnia zajezdniaAutobusowa= new Zajezdnia("Liliowa",new ArrayList<>(Arrays.asList(autobus1,autobus2,autobus3,autobus4)),TypZajezdni.AUTOBUSOWA);

        System.out.println(zajezdniaAutobusowa);
        System.out.println(zajezdniaTramwajowa);

    }
}
