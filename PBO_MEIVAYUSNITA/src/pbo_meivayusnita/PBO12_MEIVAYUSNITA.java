package pbo_meivayusnita;
import java.util.Scanner;
public class PBO12_MEIVAYUSNITA {
      public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
          System.out.print("Masukkan batas bilangan =");
          int batas = masukkan.nextInt();
          int hasil = 0;
          for(int i=1; i<=batas; i++)
          hasil += i;
          System.out.println("Total jumlahnya adalah : "+hasil);      
      }   
} 

