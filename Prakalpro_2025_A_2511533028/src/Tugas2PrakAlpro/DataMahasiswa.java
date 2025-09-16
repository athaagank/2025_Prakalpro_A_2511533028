package Tugas2PrakAlpro;

import java.util.Scanner;

public class DataMahasiswa {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		// Input data
		System.out.println("Masukkan NIM : ");
		String nim = input.nextLine();
		
		System.out.println("Masukkan Nama : ");
		String nama = input.nextLine();
		
		System.out.println("Masukkan Umur : ");
		int umur = input.nextInt();
		
		// Konversi umur menjadi String
		String umurString = String.valueOf(umur);
		
		// Konversi NIM menjadi Long dan tambahkan dengan umur
		long nimLong = Long.parseLong(nim);
		long hasilPenjumlahan = nimLong + umur;
		
		// Cetak hasil
		System.out.println("\n=== Data Mahasiswa ===");
		System.out.println("NIM : " + nim);
		System.out.println("Nama : " + nama);
		System.out.println("Umur : " + umur + " tahun");
		
		// IPK tidak diminta dari input, jadi bisa diisi manual (contoh)
		double ipk = 3.75;
		System.out.println("IPK : " + ipk);
		System.out.println("\nUmur (String): " + umurString);
		System.out.println("NIM + Umur : " + hasilPenjumlahan);
		
	}

}
