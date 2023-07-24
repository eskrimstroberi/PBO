package pbo_meivayusnita;
import java.util.Scanner;
public class PBO13_MEIVAYUSNITA {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int a= 0, total =0, bil=7;
        while (bil != 0){
            a++;
            System.out.print("Masukkan bilangan ke-"+a+" :");
            bil= masukkan.nextInt();
            total += bil;
        }
        System.out.println("Total jumlah "+(a-1)+" bilangan : ");
        System.out.println(total);
        
    }
}

