package zadania_1.tablice_i_petle;
/*9. *Napisz program do tworzenia i wyświetlania unikatowych liczb trzycyfrowych
        zbudowanych z liczb ‘1’ , ‘2’, ‘3’, ‘4’ (żadna z liczb nie może się powtarzać)*/
public class zad9 {
    public static void main(String[] args) {
        int[] tablica={1,2,3,4};

        for(int x:tablica){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int i=0;i<tablica.length;i++){
            for(int j=0;j<tablica.length;j++){
                for(int k=0;k<tablica.length;k++){
                    System.out.println(tablica[i]+""+tablica[j]+""+tablica[k]);
                }

            }
        }
    }
}
