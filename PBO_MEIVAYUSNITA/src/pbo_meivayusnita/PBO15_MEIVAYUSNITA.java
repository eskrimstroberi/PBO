package pbo_meivayusnita;
import java.util.Scanner;
public class PBO15_MEIVAYUSNITA {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int pilihan;
        double suhu, hasil;
        
        System.out.print("Masukkan suhu (C) : ");
        suhu = masukkan.nextInt();
        
        System.out.println("");
        System.out.println("Konversi ke : ");
        System.out.println("1. Reamur");
        System.out.println("2. Kelvin");
        System.out.println("3. Fahrenheit");
        System.out.println("");
        
        System.out.print("Masukkan pilihan anda : ");
        pilihan = masukkan.nextInt();
        
        if (pilihan == 1) {
            hasil = 4 * suhu / 5;
            System.out.println("Hasil (R) : " +hasil);
        }
        else if (pilihan == 2) {
            hasil = suhu + 273;
            System.out.println("Hasil (K) : " +hasil);
        }
        else if (pilihan == 3) {
            hasil = (9 * suhu + 32) / 5;
            System.out.println("Hasil (K) : " +hasil);
        }
        
    }
}
