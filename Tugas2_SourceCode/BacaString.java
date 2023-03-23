/*NIM 		 : 13020210140
Nama 		 : Alifah Nurul Ananda
Hari/Tanggal 	 : Jumat, 17 Maret 2023
Waktu Pengerjaan : 11:01 */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;


public class BacaString {
	public static void main(String[] args) throws IOException {
		String str;

		BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Baca string dan integer : \n");
		System.out.print("Masukkan sebuah string	: ");
		str = datAIn.readLine();
		System.out.print("String yang dibaca	: "+str);

	}
}