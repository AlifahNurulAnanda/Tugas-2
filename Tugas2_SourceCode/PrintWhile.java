/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Senin, 20 Maret 2023
Waktu Pengerjaan : 20:14 */



/* Baca N, Print i = 1 s/d N dengan WHILE */


import java.util.Scanner;


public class PrintWhile {
	public static void main(String[] args) {
		int i, N;
		Scanner masukan = new Scanner(System.in);

		System.out.print("Nilai N > 0 = "); 	/* Inisialisasi */
		N=masukan.nextInt();

		i = 1; /* First Element */

		System.out.print("Print i dengan WHILE : \n");
		while (i <= N) /* Kondisi pengulangan */
		{
		 	System.out.println (i); /* Proses */
			i++; /* Next Element */
			
		}; /* (i > N) */
	}
}