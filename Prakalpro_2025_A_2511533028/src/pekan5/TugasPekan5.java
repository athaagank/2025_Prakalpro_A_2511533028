package pekan5;

public class TugasPekan5 {
	public static void main(String[] args) {
		for (int line = 1; line <= 5; line++) {
			// baris dari 1 sampai 5
			for (int j = 1; j <= 5; j++) {
				// kolom dari 1 sampai 5
				if (j == (6 - line)) {
					// posisi angka (bergeser ke kiri)
					System.out.print(line);					
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}

}


