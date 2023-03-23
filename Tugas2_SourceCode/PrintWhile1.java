/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Senin, 20 Maret 2023
Waktu Pengerjaan : 20:14 */



/* Baca N, Print i = 1 s/d N dengan WHILE (ringkas) */


import java.util.Scanner;


public class PrintWhile1 {
	public static void main(String[] args) {
		int N;
		int i = 1;
		Scanner masukan = new Scanner(System.in);

		System.out.print("Nilai N > 0 = ");
		N=masukan.nextInt();

		System.out.print("Print i dengan WHILE (ringkas) : \n");
		while (i <= N)
		{
		 	System.out.println (i++);
		} /* (i > N) */
	}
}