package bangunruang;

public class Lingkaran {
    private int jari;
    public double phi= 3.14;

    public int diameter(){
        int diameter= jari*2;
        return diameter;
    }

    public double keliling(){
        double keliling= 2*jari*phi;
        return keliling;
    }

    public double luas(){
        double luas= diameter()*phi;
        return luas;
    }

    public Lingkaran(int jari) {
        this.jari = jari;
    }

    public int getJari() {
        return jari;
    }
    
}
