import java.util.Scanner;

public class ArrayRataNilai09Soal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        
        int[] nilaiMhs = new int[10];
        double total = 0, rata2 = 0, rtrtLulus = 0, rataTdkLulus = 0;
        int jmlLulus = 0, jmlTdkLulus = 0, totalLulus = 0, totalTdkLulus = 0;


        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                System.out.print("Mahasiswa yang ke-" + (i + 1) + "Dinyatakan Lulus");
                totalLulus += nilaiMhs[i];
                jmlLulus++;
                
            } else {
                System.out.print("Mahasiswa yang ke-" + (i + 1) + "Dinyatakan Tidak Lulus");
                totalTdkLulus += nilaiMhs[i];
                jmlTdkLulus++;
            } 
            rata2 = total / jumlahMhs;
            if (jmlLulus > 0) {
                rtrtLulus = totalLulus / jmlLulus;
                
            }
            if (jmlTdkLulus > 0) {
                rataTdkLulus = totalTdkLulus / jmlTdkLulus;
                
            }
            System.out.println("Rata- rata nilai = " + rata2);
            System.out.println("Rata-rata nilai Mahasiswa yang lulus =" + rtrtLulus );
            System.out.println("Rata rata nilai ahasiswa yang tidak lulus = " + rataTdkLulus);
            System.out.println("Jumlah mahasiswa yang lulus = " + jmlLulus);
            System.out.println("Jumlah mahasiswa yang tidak lulus +" + jmlTdkLulus );

            
        }
        
    }
    
}
