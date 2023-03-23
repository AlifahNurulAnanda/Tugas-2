/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Selasa, 21 Maret 2023
Waktu Pengerjaan : 14:00 */



/* contoh program yang mengandung prosedur dan fungsi
   prosedur/fungsi */


import java.util.Scanner;


public class SubProgram {
	public static int maxab (int a, int b) {
		/* mencari maximum dua bilangan bulat */
		return ((a >= b) ? a:b);
	}

	public static void tukar (int a, int b)
	{
	  /* menukar dua bilangan bulat */
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println ("Ke dua bilangan setelah tukar : a = " +a+ ", b = " +b);
	}


	/*** Program Utama ***/
	public static void main (String[] args) {
		/* Membaca dua bilangan integer */
		/* Menuliskan maximum dua bilangan yangg dibaca dgn memanggil fungsi */
		/* Menukar kedua bilangan dengan 'prosedur' */

		int a, b;
		Scanner masukan = new Scanner(System.in);
		System.out.print("Maksimum dua bilangan \n");
		System.out.print("Ketikkan dua bilangan, pisahkan dengan RETURN : \n"); 
		a=masukan.nextInt();
		b=masukan.nextInt();
		System.out.println("Ke dua bilangan : a = " + a + ", b = " + b);
		System.out.println("Maksimum = " + (maxab (a, b)));
		System.out.print("Tukar kedua bilangan... \n");
		tukar(a, b);
	}
}