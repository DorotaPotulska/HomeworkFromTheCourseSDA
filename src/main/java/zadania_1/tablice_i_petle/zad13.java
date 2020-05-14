package zadania_1.tablice_i_petle;
/*13. Napisz program który rysuje trójkąty jak na załączonym obrazku:*/
public class zad13 {
    public static void main(String[] args) {

        /*for(int i=0;i<8;i++){
            for(int j=0;j<=i;j++){

                    System.out.print("#");
            }
            System.out.println();

        }*/

        /*for(int i=0;i<=8;i++){
            for(int j=8;i<=j;j--){

                System.out.print("#");
            }
            System.out.println();

        }*/

       /*for(int i=0;i<8;i++){
           for(int j=i;j<8;j++){
               System.out.print("#");

           }
           System.out.println();
       }*/

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if (j<i){
                    System.out.print(" ");
                }else{
                System.out.print("#");
                }

            }
            System.out.println();
        }

        /*for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if (j<7-i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }

            }
            System.out.println();
        }*/
    }
}
