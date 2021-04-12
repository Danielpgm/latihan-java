package bangunruang;

public class Main {
    
    public static void main(String[] args) {
        Prisma prs= new Prisma();
        Kubus kbs= new Kubus();
        Bola lkr= new Bola(10);

        prs.alas= 12;
        prs.tinggi= 10;

        System.out.println(" ");
        System.out.println("alas segitiga: " + prs.alas);
        System.out.println("tinggi segitiga: " + prs.tinggi);
        System.out.println("luas segitiga(1/2*alas*tinggi): " + prs.luas());
        System.out.println("Volume segitiga(luasalas*tinggi): " + prs.volume());
        System.out.println(" ");

        kbs.sisi=10;
        System.out.println("Luas persegi (s*2): " + kbs.luas());
        System.out.println("keliling persegi (s*4): " + kbs.keliling());
        System.out.println("Volume kubus (s*s*s): " + kbs.volumekubus());
        System.out.println(" ");

        // lkr.jari=10;
        System.out.println("Luas lingkaran(): " + lkr.luas());
        System.out.println("Luas lingkaran(): " + lkr.keliling());
        System.out.println("Volume Bola(): " + lkr.volume());

    }
}
