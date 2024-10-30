import java.util.Scanner;

public class ArrayRataNilaiSoal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMhs];
        double total = 0, rata2 = 0, rataLulus = 0, rataTdkLulus = 0;
        int jmlLulus = 0, jmlTdkLulus = 0, totalLulus = 0, totalTdkLulus = 0;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
            
            if (nilaiMhs[i] > 70) {
               
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
               
                totalTdkLulus += nilaiMhs[i];
                jmlTdkLulus++;
            }
        }

        rata2 = total / jumlahMhs;
        if (jmlLulus > 0) {
            rataLulus = (double) totalLulus / jmlLulus;
        }
        if (jmlTdkLulus > 0) {
            rataTdkLulus = (double) totalTdkLulus / jmlTdkLulus;
        }

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTdkLulus);
       
    }
}
