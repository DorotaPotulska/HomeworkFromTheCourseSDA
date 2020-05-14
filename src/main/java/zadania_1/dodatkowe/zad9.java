package zadania_1.dodatkowe;

import java.util.Scanner;

/*9. Napisać program służący do konwersji wartości temperatury podanej w stopniach
        Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
        Celsjusza + 32.0)*/
public class zad9 {
    public static void main(String[] args) {
        float celcjusz;
        float farenheit;
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj stopnie w Celcjuszach");
        celcjusz = in.nextFloat();

        farenheit = (float) (celcjusz * 1.8 + 32.0);
        System.out.println("Podane stopnie to " + farenheit + " stopni w Farenheitach");
    }

}
