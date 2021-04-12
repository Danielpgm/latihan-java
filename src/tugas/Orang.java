package tugas;

public class Orang {
	
	public String fname;
	public String lname;
	public String fullname;
	public int tahunLahir;
	public int usia;
	public String domisili;
	public String Jalan;
	public String Rt;
	public String Rw;
	public String kota;
	
	
//	method
	public String namalengkap() {
		String fullname= this.fname + " " + this.lname;
		return fullname;
	}
	
	public int Umursekarang(){
		int usia= 2021 - this.tahunLahir;
		return usia;
	}
	
	public String Domisili() {
		String domisili= this.Jalan+", Rt:"+ this.Rt+", Rw:"+this.Rw+ ", kota:"+this.kota;
		return domisili;
	}

}