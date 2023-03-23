/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Senin, 20 Maret 2023
Waktu Pengerjaan : 20:02 */



import java.util.Scanner;


public class PrintRepeat {
	public static void main(String[] args) {
		int i, N;
		Scanner masukan = new Scanner(System.in);

		System.out.print("Nilai N > 0 = "); 	/* Inisialisasi */
		N=masukan.nextInt();

		i = 1; /* First Element */

		System.out.print("Print i dengan REPEAT : \n");
		do {
		 	System.out.print (i+"\n"); /* Proses */
			i++; /* Next Element */
		}
		
		while (i <= N); /* Kondisi pengulangan */
	}
}