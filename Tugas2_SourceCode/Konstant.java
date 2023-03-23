/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Minggu, 19 Maret 2023
Waktu Pengerjaan : 17:33 */



/* Membaca jari-jari, menghitung luas lingkaran. 
   Latihan pemakaian konstanta */


import java.util.Scanner;


public class Konstant {
	public static void main(String[] args) {
		final float PHI = 3.1415f;
		float r ;
		Scanner masukan = new Scanner(System.in);

		System.out.print("Jari-jari lingkaran = ");
		r = masukan.nextFloat();
		System.out.print("Luas lingkaran = "+ (PHI*r*r)+"\n");
		System.out.print("Akhir program");
	}
}