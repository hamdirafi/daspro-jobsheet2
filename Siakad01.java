import java.util.Scanner;

/**
 * Siakad01
 */
public class Siakad01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print(s:"Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print(s:"Masukkan nim: ");
        nim = sc.nextLine();
        System.out.print(s:"Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print(s:"Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3g;

        System.out.println("Nama: " + nama + "nim: " + nim);
        System.out.println("Kelas: " + kelas + "absen: " + absen);
        System.out.println("Nilai Akhir: " + Nilai Akhir);

    }
}      
