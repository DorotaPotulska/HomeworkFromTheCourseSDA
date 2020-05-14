package zadania_1.tablice_i_petle;

/*11. Utwórz program, który przyjmuje dwie tablice a zwraca trzecią zawierającą wspólne elementy obu tablic.*/
public class zad11 {
    public static void main(String[] args) {

        int[] tab1={1,2,3,4};
        int[] tab2={8,7,6,5,4,3};
        int[] tab3=new int[tab1.length+tab2.length];

        for(int i=0;i<tab1.length;i++){
            tab3[i]=tab1[i];
        }

        for(int i=0;i<tab2.length;i++){
            tab3[tab1.length+i]=tab2[i];
        }

        for(int x:tab3){
            System.out.println(x+", ");
        }






    }
}
