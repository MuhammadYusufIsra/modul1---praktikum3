//Package
package praktikum.pkg3;

/**
 *
 * @author Yusuf Isra
 */
//Class
public class Praktikum3 {
    //Method Main
    public static void main(String[] args) {
        //Perulangan for(Looping bersarang)
         for (int i = 1; i<=5; i++){
            for (int j = 1; j<=5; j++){
                //Percabangan IF/ELSE
                if(i==1 || i==5 ||((j == 4 && i == 2) || (j == 3 && i == 3) || (j == 2 && i == 4))){
                    System.out.print("@");
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
         // \n digunakan untuk "spasi" antar baris
        System.out.println("\n");
    }
    
}
