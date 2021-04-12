package inheritance;

public class Student extends Person2 {
    
    private int sksk;
    private String matkul;

    public Student(String fname, String lname, int sksk, String matkul) {
        super();
        this.sksk = sksk;
    }

    public int getSksk() {
        return sksk;
    }

    public void setSksk(int sksk) {
        this.sksk = sksk;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    
    
}
