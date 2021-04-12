package latihanTerus;
import java.util.Scanner;

public class soal1 {
	
	public static void main(String[] args) {
		Scanner masuk= new Scanner(System.in);
		
		boolean menu = true;
		
		while(menu == true) {
			
			System.out.print("masukan jumlah baris :");
			int i= masuk.nextInt();
		
		
			for(int k=0; k<=i; k++) {
				for(int l=0; l<k; l++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
			System.out.println("");
			System.out.println("");
			System.out.println("Lagi (Y/N)?");
			String cek=masuk.next();
			
			if(cek.equalsIgnoreCase("N")) {
//				menu = false;
				System.exit(1);
			}else if(cek.equalsIgnoreCase("Y")) {
				menu = true;
			}else {
				System.exit(0);
			}
		}
	}
}
