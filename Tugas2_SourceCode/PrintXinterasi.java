/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Selasa, 21 Maret 2023
Waktu Pengerjaan : 12:26 */



/* contoh baca nilai x, jumlahkan nilai yang dibaca dengan ITERATE */


import java.util.Scanner;


public class PrintXinterasi {
	public static void main(String[] args) {
		int Sum = 0;
		int x;
		Scanner masukan = new Scanner(System.in);
		System.out.print("Masukkan nilai x (int), akhiri dgn 999 : ");
		x=masukan.nextInt();

		if (x == 999)
		{
			System.out.print("Kasus kosong \n");
		} else { /* Minimal ada satu data yang dijumlahkan */
		Sum = x; /* Inisialisasi;  invariant !! */
		for (; ;){
			System.out.print("Masukkan nilai x (int), akhiri dgn 999 : ");
			x=masukan.nextInt();
			if (x == 999)
				break;
			else {
				Sum = Sum + x; /* Proses */
			}
		}
	}
	System.out.println("Hasil penjumlahan = "+ Sum); /* Terminasi */
}
}