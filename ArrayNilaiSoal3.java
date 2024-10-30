import java.util.Scanner;
public class ArrayNilaiSoal3 {
    public static void main(String[] args) {
        int[] nilaiAkhir =new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
           
        }
       for (int i = 0; i < nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] > 70) {      
            System.out.println("Mahasiswa ke-" + i + "lulus");
        } else {
            System.out.println("Mahasiswa ke-" + i + "Tidak lulus");
            
        }
        
       }
    }
}
