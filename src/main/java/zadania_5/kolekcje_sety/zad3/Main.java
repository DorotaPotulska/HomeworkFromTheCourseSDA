package zadania_5.kolekcje_sety.zad3;

import java.util.HashSet;
import java.util.Set;

/*3. Utwórz klasę ParaLiczb (int a,int b) i dodaj kilka instancji do zbioru:  {(1,2), (2,1), (1,1), (1,2)}.
        Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie z oczekiwaniem?*/
public class Main {
    public static void main(String[] args) {
        Set<ParaLiczb> SetParLiczb= new HashSet<>();
        SetParLiczb.add(new ParaLiczb(1,2));
        SetParLiczb.add(new ParaLiczb(2,1));
        SetParLiczb.add(new ParaLiczb(1,1));
        SetParLiczb.add(new ParaLiczb(1,2));

        System.out.println(SetParLiczb);
    }
}
