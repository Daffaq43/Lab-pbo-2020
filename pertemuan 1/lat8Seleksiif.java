import java.util.Scanner;

public class lat8Seleksiif {
	public static void main(String[] args) {
		int age = 0;
		Scanner sc = new Scanner (System.in);

		System.out.print("Masukkan umur anda : ");
		age = sc.nextInt ();

		if (age>=17)
			System.out.println ("Anda sudah boleh buat KTP");
	}
}

/* program ini melibatkan percobaan seleksi if di dalamnya, yaitu penentuan apakah seseorang dapat membuat ktp atau tidak berdasarkan umur yang di input. */