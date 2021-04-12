package bangunruang;

public class Bola extends Lingkaran{
    
    public Bola(int jari) {
        super(jari);
        //TODO Auto-generated constructor stub
    }

    public double volume(){
        double volume= (4/3 * (super.getJari()*3));
        return volume;
    }
}
