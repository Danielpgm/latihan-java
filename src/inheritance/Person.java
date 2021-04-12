package inheritance;

public class Person {
//  without constructor
    private String fname;
    private String lname;
    private String Version;


//  getter and setter
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

//  Method
    public String namalengkap(){
        return this.fname+ " " + this.lname;
    }

    public void getVersion(){
        System.out.println("Version dari class person");
    }
}
