package TugasPekan5;

public class TugasPekan5 {
	public static void main(String[] args) {
		int n = 7;
		int lebar = 27;
		System.out.print("#");
		for (int i = 0; i < lebar; i++) {
			System.out.print("=");
		}
		
		System.out.println("#");
		for (int i = 0; i < n; i++) {
			System.out.print("| ");
			int k = (i < n / 2) ? i : n - i - 1;
			for (int s = 0; s < (n - k); s++) {
				System.out.print(" ");				
			}
			
			System.out.print("<>");
			for (int d = 0; d < k * 3; d++) {
				System.out.print(" . ");				
			}
			
			System.out.print("<>");
			for (int s = 0; s < (n - k); s++) {
				System.out.print(" ");				
			}
			
			System.out.println(" |");
		}
		
		System.out.print("#");
		for (int i = 0; i < lebar; i++) {
			System.out.print("=");
		}
		
		System.out.println("#");
	}

}
