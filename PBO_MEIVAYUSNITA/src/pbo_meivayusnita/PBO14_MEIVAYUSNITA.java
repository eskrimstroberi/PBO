package pbo_meivayusnita;
import java.util.Scanner;
public class PBO14_MEIVAYUSNITA {
    public static void main(String[] args) {
     Scanner masukkan = new Scanner(System.in);
 
        int r;
        double hasil;
        double phi = 3.14;
        
        System.out.print("Masukkan Nilai r : ");
        r = masukkan.nextInt();
        
        hasil = 4 * 3.14 * r * r;
        System.out.println("Luas Permukaan Bola : " +hasil);
        
        
    }
}


