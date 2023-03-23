/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Selasa, 21 Maret 2023
Waktu Pengerjaan : 13:06 */



/* contoh baca nilai x, jumlahkan nilai yang dibaca dengan REPEAT */


import java.util.Scanner;


public class PrintXrepeat {
	public static void main(String[] args) {
		int Sum;
		int x;
		Scanner masukan = new Scanner(System.in);
		System.out.print("Masukkan nilai x (int), akhiri dgn 999 : ");
		x=masukan.nextInt();

		if (x == 999)
		{
			System.out.print("Kasus kosong \n");
		} else { 	/* Minimal ada satu data yang dijumlahkan */
		Sum = 0; 	/* Inisialisasi;  invariant !! */
		do{
			Sum = Sum + x; /* Proses */
			System.out.print("Masukkan nilai x (int), akhiri dgn 999 : ");
			x=masukan.nextInt(); /* Next Element */
		} while (x != 999); /* Kondisi pengulangan */
			System.out.println("Hasil penjumlahan = "+ Sum); /* Terminasi */
	}
}
}