/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Jumat, 17 Maret 2023
Waktu Pengerjaan : 15:21 */


/* contoh pemakaian IF dua kasus komplementer
   membaca sebuah nilai, menuliskan 'Nilai a positif, nilai a', jika a >= 0
   dan 'Nilai a negatif, nilai a', jika a < 0 */
   


import java.util.Scanner;


public class If2 {
	public static void main(String[] args) {
		int a;
		Scanner masukan = new Scanner(System.in);

		System.out.print("Contoh IF dua kasus \n");
		System.out.print("Ketikkan suatu nilai integer : ");
		a = masukan.nextInt();
		if (a >= 0) {
			System.out.println("Nilai a positif "+ a);
		} else /* a < 0*/ {
			System.out.println("Nilai a negatif "+ a);
		}
	}
}