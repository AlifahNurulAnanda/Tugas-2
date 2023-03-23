/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Senin, 20 Maret 2023
Waktu Pengerjaan : 14:37 */



/* Baca N, Print i = 1 s/d N dengan ITERATE */


import java.util.Scanner;


public class PrintIterasi {
	public static void main(String[] args) {
		int i, N;
		Scanner masukan = new Scanner(System.in);

		System.out.print("Nilai N > 0 = "); 	/* Inisialisasi */
		N=masukan.nextInt();

		i = 1; /* First Element */

		System.out.print("Print i dengan ITERATE : \n");
		for(; ;) {
		 	System.out.println (i); /* Proses */
			if(i == N)
				break; /* Kondisi Berhenti */
			else {
				i++; /* Next Element */
			}
		} /* (i == N) */
	}
}