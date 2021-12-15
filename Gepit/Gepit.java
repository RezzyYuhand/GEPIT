package Gepit;
import java.util.Scanner;

public class Gepit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sudahkah anda Berolahraga?\nJika belum, GEPIT hadir untuk anda");
        System.out.println("============== GEPIT ================");
        System.out.printf("%-22s: ", "Berat Badan (kg)");
        double berat = sc.nextDouble();
        System.out.printf("Pilih Olahraga yang akan anda lakukan\n1. Jogging\n2. Cycling\n");
        System.out.println("=====================================");
        System.out.print("Pilih : ");
        int  a = sc.nextInt();
        if (a == 1 || a == 2);
        else {
            do {
                System.out.println("=====================================");
                System.out.println("Maaf menu olahraga tidak tersedia\nOlahraga yang tersedia\n1. Jogging\n2. Cycling");
                System.out.println("=====================================");
                System.out.print("Pilih : ");
                a = sc.nextInt();
                if (a==1 || a == 2)break;
            }
            while (a != 1 || a != 2) ;
        }
        System.out.println("=====================================");
        System.out.printf("%-26s: ", "Jarak yang ditempuh (km)");
        double jarak = sc.nextDouble();
        System.out.printf("%-26s: ", "Durasi berolahraga (menit)");
        double waktu = sc.nextDouble();
        System.out.println("=====================================");
        double kecepatan = jarak / (waktu / 60);

        double pace;  
        pace = waktu/jarak;
        

        switch(a) {
            case 1:
            MethodProject.Jogging(kecepatan, jarak, waktu, berat);
            break;
            case 2:
            MethodProject.Cycling(kecepatan, jarak, waktu, berat);
            break;
        }
        
        System.out.printf("%-9s: %.1f menit/km\n","Pace", pace);
        MethodProject.duration(waktu);
        MethodProject.Quotes(kecepatan, jarak, waktu, berat);

        
    }
}
