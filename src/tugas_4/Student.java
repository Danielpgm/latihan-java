package tugas_4;

import java.util.HashMap;
import java.util.Map;

public class Student implements Person{

    private String fname, lname, domisili;
    private Integer npm;

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

    public String getDomisili() {
        return domisili;
    }
    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public Integer getNpm() {
        return npm;
    }
    public void setNpm(Integer npm) {
        this.npm = npm;
    }

    // method untuk nama lengkap
    public String fullname(){
        return getFname() + " " + getLname();
    }
    // end
    
    @Override
    public void domisili(String domisili) {
        System.out.println("Domisili: " + getDomisili());
    }
    
    @Override
    public void fullname(String fname, String lname) {
        System.out.println("Nama: " + fname + " " + lname);
    }
    
    @Override
    public void npm(Integer nim) {
        System.out.println("Npm: " + nim);   
    }
    
}
