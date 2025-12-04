package tugaspekan15_2511533028;

import java.util.Scanner;

public class PengelompokanBilangan_2511533028 {

    // Prosedur: menampilkan data bilangan
    public static void tampilkanData(int[] angka) {
        System.out.println("\n=== Daftar Bilangan ===");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Bilangan ke-" + (i + 1) + ": " + angka[i]);
        }
    }

    // Fungsi: menghitung jumlah bilangan genap
    public static int hitungGenap(int[] angka) {
        int count = 0;
        for (int n : angka) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Fungsi: menghitung jumlah bilangan ganjil
    public static int hitungGanjil(int[] angka) {
        int count = 0;
        for (int n : angka) {
            if (n % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();

        int[] angka = new int[n];

        // Input bilangan
        for (int i = 0; i < n; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Prosedur tampilkan data
        tampilkanData(angka);

        // Fungsi perhitungan
        int jumlahGenap = hitungGenap(angka);
        int jumlahGanjil = hitungGanjil(angka);

        // Output hasil
        System.out.println("\n=== Hasil Analisis ===");
        System.out.println("Jumlah bilangan genap : " + jumlahGenap);
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
    }
}



