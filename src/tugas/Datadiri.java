package tugas;
import java.util.Scanner;

public class Datadiri {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		Orang data= new Orang();
		Pendidikan pend= new Pendidikan("JM31", "Slamer", "Slamer", "PGRI");
		Pendidikan2 pend2= new Pendidikan2();
		
		String cek;
		boolean datadiri = true;
		boolean menu = true;
		
		while(menu) {
			System.out.println("================ DATA DIRI ===================" );
			System.out.println("1. Masukan data diri" );
			System.out.println("2. Masukan pendidikan" );
			System.out.println("3. Lihat data diri" );
			System.out.println("4. Lihat data pendidikan" );
			System.out.println("5. Keluar" );
			System.out.print("Masukan pilihan anda (dalam angka; contoh 1): " );
			int pilihan=scan.nextInt();
			
			switch(pilihan) {
				case 1:
					while (datadiri) {					
						System.out.print("Masukan nama depan anda: ");
						data.fname= scan.next();
						
						System.out.print("Masukan nama belakang anda: ");
						data.lname= scan.next();
						
						System.out.print("Masukan tahun lahir anda: ");
						data.tahunLahir= scan.nextInt();
						
						System.out.print("Masukan nama jalan: ");
						data.Jalan= scan.next();
						
						System.out.print("Rt: ");
						data.Rt= scan.next();
						
						System.out.print("Rw: ");
						data.Rw= scan.next();
						
						System.out.print("Kota: ");
						data.kota= scan.next();
						
						System.out.println("==================== Data diri anda ====================");
						System.out.println(" ");
						System.out.println("Nama		:" + data.namalengkap());
						System.out.println("Umur		:" + data.Umursekarang());
						System.out.println("Alamat		:" + data.Domisili());
						System.out.print("Perlu perubahan (Y/N):");
						cek=scan.next();
						if(cek.equalsIgnoreCase("Y")) {
							datadiri = true;
						}else if(cek.equalsIgnoreCase("N")) {
							break;
						}
					}
				break;
					
				case 2:
					while (datadiri) {
						System.out.print("Masukan nama sd anda: ");
						pend2.sd=scan.next();
						
						System.out.print("Masukan nama smp anda: ");
						pend2.smp=scan.next();
						
						System.out.print("Masukan nama sma anda: ");
						pend2.sma=scan.next();
						
						System.out.print("Masukan nama kampus anda: ");
						pend2.kuliah=scan.next();
						
						System.out.println("==================== Data Pendidikan anda ====================");
						System.out.println("Sd		:" + pend.sd);
						System.out.println("Smp		:" + pend.smp);
						System.out.println("Sma		:" + pend.sma);
						System.out.println("kampus		:" + pend.kuliah);
						System.out.print("Perlu perubahan (Y/N):");
						cek=scan.next();
						if(cek.equalsIgnoreCase("Y")) {
							datadiri = true;
						}else if(cek.equalsIgnoreCase("N")) {
							break;
						}
					}
				break;
					
				case 3:
					data.fname = "Yohanes";
					data.lname = "Pangarep";
					data.tahunLahir = 1998;
					data.Jalan = "Jl. yang lurus";
					data.Rt = "10";
					data.Rw = "2";
					data.kota = "Depok";
					
					System.out.println("==================== Data diri anda ====================");
					System.out.println(" ");
					System.out.println("Nama		:" + data.namalengkap());
					System.out.println("Umur		:" + data.Umursekarang());
					System.out.println("Umur		:" + data.Domisili());
				break;
					
				case 4:
					System.out.println("==================== Data Pendidikan anda ====================");
					System.out.println("Sd		:" + pend.sd);
					System.out.println("Smp		:" + pend.smp);
					System.out.println("Sma		:" + pend.sma);
					System.out.println("kampus		:" + pend.kuliah);
					
				break;
			}	
			
			System.out.println("");
			System.out.print("kembali ke menu utama (Y/N)?");
			cek=scan.next();
			
			if(cek.equalsIgnoreCase("N")) {
				System.out.println("sampai jumpa lagi");
				menu = false;	
			}else if(cek.equalsIgnoreCase("Y")) {
				menu = true;
			}else {
				System.exit(0);
			}
		}

	}
}
