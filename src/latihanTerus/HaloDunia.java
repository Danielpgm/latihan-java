package latihanTerus;

public class HaloDunia {
	public String nama;
	public int umur;
	public static String jenkel;
	
	public String getNama() {
		return nama;
	}

	public int getUmur() {
		return umur;
	}

	public void setUmur(int umur) {
		if(umur > 0) {
			this.umur = umur;			
		}else {
//			this.umur = 0;
//			String Result = "Tidak valid";	
//			System.out.print(Result);
		}
	}
	
	
}
