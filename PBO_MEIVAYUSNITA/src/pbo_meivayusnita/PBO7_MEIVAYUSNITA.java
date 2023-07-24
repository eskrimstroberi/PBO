package pbo_meivayusnita;
import java.util.Scanner;
public class PBO7_MEIVAYUSNITA {
    public static void main(String[] args) {
     Scanner masukkan = new Scanner(System.in);
     int nilai;
        System.out.print("Masukkan nilai akhir PBO : ");
        nilai = masukkan.nextInt();
        if(nilai < 70)
            System.out.println("Siswa tidak lulus");
        if(nilai > 70)
            System.out.println("Siswa lulus");
    }
  
}
