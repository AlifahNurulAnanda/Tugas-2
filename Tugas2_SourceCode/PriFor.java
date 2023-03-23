/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Senin, 20 Maret 2023
Waktu Pengerjaan : 14:31 */



/* Baca N, Print 1 s/d N dengan FOR */


import java.util.Scanner;


public class PriFor {
	public static void main(String[] args) {
		int i, N;
		Scanner masukan = new Scanner(System.in);

		System.out.print("Baca N, Print 1 s/d N \n");
		System.out.print("N = ");
		
		N=masukan.nextInt();

		for(i = 1; i <= N; i++) {
		System.out.println (i); };
		System.out.println ("Akhir program \n");
	}
}