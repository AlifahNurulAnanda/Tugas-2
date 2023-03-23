/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Selasa, 21 Maret 2023
Waktu Pengerjaan : 13:29 */



/* contoh baca nilai x, jumlahkan nilai yang dibaca dengan WHILE */


import java.util.Scanner;


public class PrintXwhile {
	public static void main(String[] args) {
		int Sum;
		int x;
		
		Scanner masukan = new Scanner(System.in);
		Sum = 0; /* Inisialiasasi */
		System.out.print("Masukkan nilai x (int), akhiri dgn 999 : ");
		x=masukan.nextInt(); /* First Element */

		while (x != 999) /* Kondisi berhenti */
		{
			Sum = Sum + x; /* Proses */
			System.out.print("Masukkan nilai x (int), akhiri dgn 999 : ");
			x=masukan.nextInt(); /* First Element */
		}
		System.out.println("Hasil penjumlahan = "+ Sum); /* Terminasi */
	}
}
