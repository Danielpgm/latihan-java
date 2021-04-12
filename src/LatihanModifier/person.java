package LatihanModifier;

public class person {

	public String fname;
	public String lname;
	public int tahunLahir;
	public Alamat alamat= new Alamat();
	
	public String fullname() {
		return this.fname + " " + this.lname;
	}

	public person() {
		super();
	}

	public person(String fname, String lname, int tahunLahir, Alamat alamat) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.tahunLahir = tahunLahir;
		this.alamat = alamat;
	}

	public int getTahunLahir() {
		return tahunLahir;
	}

	public void setTahunLahir(int tahunLahir) {
		this.tahunLahir = tahunLahir;
	}

	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
}
