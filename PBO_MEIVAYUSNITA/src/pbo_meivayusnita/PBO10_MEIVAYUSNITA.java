package pbo_meivayusnita;
import java.util.Scanner;
public class PBO10_MEIVAYUSNITA {  
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan nilai TPA =");
        int TPA = masukkan.nextInt();
        System.out.print("Masukkan nilai Bahasa inggris :");
        int BahasaInggris = masukkan.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80))
           System.out.println("Siswa dapat beasiswa");
        else
           System.out.println("Siswa Tidak Dapat Beasiswa");
    }
}

