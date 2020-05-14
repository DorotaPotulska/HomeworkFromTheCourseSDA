package zadania_6.rekurencja_DOKONCZYC;

public class Main {
    public static void main(String[] args) {
        Rekurencja rekurencja= new Rekurencja();
        System.out.println("Silnia");
        System.out.println(rekurencja.factorial(4));

        int[] tabela=new int[]{1,2,3,4};
        System.out.println("Suma wszystkich elementów tablicy");
        System.out.println(rekurencja.sum(tabela));

        System.out.println("Odwrócony tekst");
        System.out.println(rekurencja.reverse("Dorota"));
    }
}
