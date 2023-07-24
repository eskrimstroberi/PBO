package pbo_meivayusnita;
import java.util.Scanner;
public class PBO8_MEIVAYUSNITA {
    public static void main(String[] args) {
       Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan nilai WEB : ");
        int nilai = masukkan.nextInt();
        if(nilai >= 90)
            System.out.println("Nilai A");
        else if(nilai >= 75)
            System.out.println("Nilai B");
        else if(nilai >= 50)
            System.out.println("Nilai C");
        else if(nilai >= 35)
            System.out.println("Nilai D");
        else
            System.out.println("Nilai G");
    }
}
