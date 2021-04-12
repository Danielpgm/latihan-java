package latihanTerus;

public class AmbilNama {
	
	public static void main (String [] dp) {
		HaloDunia obj= new HaloDunia();
		
		obj.nama= "Daniel";
		obj.setUmur(-23);
//		pemanggilan variable static
		HaloDunia.jenkel= "laki-laki";
		
		System.out.println("Nama		:" + obj.getNama());
		
		if(obj.getUmur() > 0) {
			System.out.println("Umur		:" + obj.getUmur());
		}else {
			System.out.println("umur		:tidak valid");
		}
		
		System.out.println("Jenis kelamin 	:" + HaloDunia.jenkel);
		
		for(int i=0; i<10; i++) {
			for(int j=0; j>i; j++) {
				System.out.println("*");
			}
			System.out.println(" ");
		}
		
	}
}
