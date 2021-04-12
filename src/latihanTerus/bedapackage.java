package latihanTerus;
import LatihanModifier.contoh1;

public class bedapackage {
	public static void main(String[] args) {
		contoh1 segitiga= new contoh1();
		
		segitiga.alas= 10;
		segitiga.tinggi= 5;
		
		System.out.println(segitiga.hitungLuas());
	}
}
