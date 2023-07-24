package pbo_meivayusnita;
import java.util.Scanner; 
public class PBO9_MEIVAYUSNITA {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.print("Silahkan pilih angka 1-3 : ");
        int bil = masukkan.nextInt();
        switch (bil) {
            case 1 : System.out.println("Satu");
               break;
            case 2 : System.out.println("Dua");   
               break;
            case 3 : System.out.println("Tiga");  
        }
    }

}
    

