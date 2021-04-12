package tugas_4;

import java.util.Map;

public class Matakuliah{

    private String namamatkul, dosen;
    private int sks;
    

    public String getNamamatkul() {
        return namamatkul;
    }
    public void setNamamatkul(String namamatkul) {
        this.namamatkul = namamatkul;
    }
    public String getDosen() {
        return dosen;
    }
    public void setDosen(String dosen) {
        this.dosen = dosen;
    }
    public int getSks() {
        return sks;
    }
    public void setSks(int sks) {
        this.sks = sks;
    }

    // konstruktor kosong
    public Matakuliah(){

    }

    public Matakuliah(String namamatkul, String dosen, int sks) {
        this.namamatkul = namamatkul;
        this.dosen = dosen;
        this.sks = sks;
    }
}
