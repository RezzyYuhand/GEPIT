package Gepit;

public class MethodProject {
    public static void duration(double waktu) {
        double menit = waktu % 60;
        double jam = (waktu-menit)/60;

        if (jam==0){
            System.out.printf("%-9s: %d menit\n","Durasi",(int)menit);
        }
        else if (menit==0){
            System.out.printf("%-9s: %d jam\n","Durasi",(int)jam);
        }
        else {
            System.out.printf("%-9s: %d jam %d menit\n","Durasi",(int)jam,(int)menit);
        }
            
    }
    public static void Jogging(double kecepatan, double jarak, double waktu, double berat) {
        double MET;
        double kalori;
        if (kecepatan < 6){
            MET = 4;
        }
        else if (kecepatan >= 6 && kecepatan < 8){
            MET = 6;
        }
        else if (kecepatan >= 6 && kecepatan < 10){
            MET = 9;
        }
        else {
            MET = 12;
        }
        kalori = (MET * 3.5 * berat * waktu) / 200;
        System.out.printf("kalori yang telah dibakar : %.1f cal\n",kalori);
        
    }

    public static void Cycling(double kecepatan, double jarak, double waktu, double berat) {
        double MET;
        double kalori;
        if (kecepatan < 16){
            MET = 4;
        }
        else if (kecepatan >= 16 && kecepatan < 19){
            MET = 6;
                    }
        else if (kecepatan >= 19 && kecepatan < 22){
            MET = 8;
        }
        else {
            MET = 11;
        }
        kalori = (MET * 3.5 * berat * waktu) / 200;
        System.out.printf("kalori yang telah dibakar : %.1f cal\n",kalori);
    }

    public static void Quotes(double kecepatan, double jarak, double waktu, double berat) {
        double MET;
        double kalori;
        if (kecepatan < 16){
            MET = 4;
        }
        else if (kecepatan >= 16 && kecepatan < 19){
            MET = 6;
                    }
        else if (kecepatan >= 19 && kecepatan < 22){
            MET = 8;
        }
        else {
            MET = 11;
        }
        kalori = (MET * 3.5 * berat * waktu) / 200;

        if (kalori < 100){
            System.out.printf("%37s\n","Semangat olahraganya kamu pasti bisa!");
        }
        else if (kalori < 200){
            System.out.printf("%36s\n","Hebat!!, besok coba lagi sampai 200");
        }
        else if (kalori < 300){
            System.out.printf("%31s\n","Kerja bagus, tingkatkan!!");
        }
        else if (kalori < 450){
            System.out.printf("%30s\n","Sempurna, pertahankan!!");
        }
        else {
            System.out.printf("%30s\n","Wow, kamu seorang atlet");
        }
    }
}
